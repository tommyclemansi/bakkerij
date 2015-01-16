package myUpload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class myUploadServlet servlet is used from the upload
 * jsp file.
 */
/*
 * setting max size (this is bytes) setting to 10M
 */
@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
@WebServlet(description = "servlet used for uploading images", urlPatterns = { "/upload.do" })
public class myUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public myUploadServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	testUpload(request,response);
	}

	private void testUpload(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException 
	{
		Collection<Part> parts;
		try {
			parts = request.getParts();
		} catch (ServletException se) {
			request.setAttribute("errorMessage","Not a multipart/form data request");
			RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
			return; // need to check return..
		}
		if (parts.isEmpty()) {
			request.setAttribute("errorMessage","No parts in multipart/form-data request");
			RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);

		} else {
			List<String> warnings = new ArrayList<>();
			request.setAttribute("warnings", warnings);
			//List<MediaItem> items = new ArrayList<>();
			//request.setAttribute("mediaItems", items);

			for (Part part : parts) {

				String disposition = part.getHeader("content-disposition");
				System.out.println("disposition: " + disposition);
				String name = disposition.substring(
						disposition.indexOf("filename") + 10,
						disposition.length() - 1);

				try {
					String contentType = getServletContext().getMimeType(name);
					if (contentType.startsWith("image")
							|| contentType.startsWith("video")) {
						int periodIndex = name.lastIndexOf(".");
						String fileExtension = name.substring(periodIndex);
						String title = name.substring(0, periodIndex);
						String id = System.currentTimeMillis() + fileExtension;
             	//					MediaItem item = new MediaItem(title, id, new Date());
				//		mm.createMediaItem(item, part.getInputStream());
				//		items.add(item);

					} else {
						warnings.add(contentType + "not supported for " + name);

					}
					part.delete();
				} catch (IOException fe) {
					warnings.add("Exception writing file: " + name + " : " + fe);
					fe.printStackTrace();
				}
			}// end of for loop
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			//rd.forward(request, response);
		}
	}

}

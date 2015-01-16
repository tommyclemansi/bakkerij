<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<!-- simple page to upload bakkerij fotoken -->
<html>
    <head>
        <title>Bakkerij lukken - upload een Taartjen</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="user-scalable=no, width=device-width" />
        <c:choose>
            <c:when test="${fn:containsIgnoreCase(header['User-Agent'],'mobile')}">
                <link href="${pageContext.request.contextPath}/css/mobieltje.css" rel="stylesheet" type="text/css"/>
            </c:when>
            <c:otherwise>
                <link href="${pageContext.request.contextPath}/css/bakkerij.css" rel="stylesheet" type="text/css"/>
            </c:otherwise>
        </c:choose>
    </head>

    <body>
        <div class="titlebar">
            <h1>Upload File</h1>
            <a class="titlebar-back" href="${pageContext.request.contextPath}/">Back</a>
        </div>
        <form class="settings-form" action="upload.do" enctype="multipart/form-data" method="POST"> 
            <input type="file" name="file1"><br>
            <input type="Submit" value="Upload"><br>
        </form>
        
  <!-- need to include footer jspf -->
    </body>
</html>

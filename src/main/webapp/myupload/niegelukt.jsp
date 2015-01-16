<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bakkerij de Lukken - upload een Taart</title>
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


    <body>
        <div class="titlebar">
            <h1>Error</h1>
            <a class="titlebar-back" href="${pageContext.request.contextPath}/">Back</a>
        </div>
        <!-- error message is passed from the Servlet..  -->
        <h2>${MyerrorMessage}</h2>
    </body>
</html>
<%-- 
    Document   : Advice
    Created on : Sep 30, 2015, 8:29:05 PM
    Author     : ActiveLearning
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Here are our Recommendations:</h1>
        <c:forEach items="${products}" var="product">
            ${product}<br/>
        </c:forEach>
    </body>
</html>

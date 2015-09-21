<%-- 
    Document   : UrlTagDemo
    Created on : Aug 13, 2015, 3:53:00 PM
    Author     : ActiveLearning
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  ArrayList shoppingCart = new ArrayList();
            session.setAttribute("cart", shoppingCart);
            %>
        
        <c:set var="userId">User 12345</c:set>
            
        <c:url var="formattedUrl" value="/DisplayCartServlet">
            <c:param name="userId" value="${userId}"/>
        </c:url>
        <a href="${formattedUrl}"/>Display Orders</a>
    </body>
</html>

<%-- 
    Document   : GetProducts.jsp
    Created on : Sep 28, 2015, 7:35:51 PM
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
        <h1>Product Listing</h1>
        <table border="1">
        <c:forEach items="${the_products}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.description}</td>
                <td>${product.size}</td>
                <td>${product.price}</td>
                
                <c:set scope="session" var="someSessionAttribute" value="hello" />
                
                <c:url var="formattedUrl" value="/AddToCartServlet">
                    <c:param name="id" value="${product.id}"/>
                </c:url>
                
                <td><a href="${formattedUrl}">Buy Product</a></td>
                
            </tr>
        </c:forEach>
        </table>
    </body>
</html>

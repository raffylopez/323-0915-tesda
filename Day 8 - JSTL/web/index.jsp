<%-- 
    Document   : index
    Created on : Sep 28, 2015, 8:10:57 PM
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
        <% request.setAttribute("a_message", "Hello world!");
        %>
        
        <c:set var="another_message" scope="request"
               >Hello World!</c:set>
        
        
    </body>
</html>

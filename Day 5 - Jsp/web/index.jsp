<%-- 
    Document   : index
    Created on : Sep 22, 2015, 6:38:51 PM
    Author     : ActiveLearning
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= "<h1>Hello World! "+ new java.util.Date() + "</h1>" %>
        <%= session.getId() %>
    </body>
</html>

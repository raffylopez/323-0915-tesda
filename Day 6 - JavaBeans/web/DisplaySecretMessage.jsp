<%-- 
    Document   : DisplaySecretMessage
    Created on : Sep 24, 2015, 6:38:22 PM
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
        
        <jsp:useBean id="secret_message" class="java.lang.String" scope="request"/>
        <%
            out.println(secret_message);
        %>
    </body>
</html>

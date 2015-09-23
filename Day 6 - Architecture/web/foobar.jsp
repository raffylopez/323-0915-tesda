<%-- 
    Document   : foobar
    Created on : Sep 23, 2015, 9:49:37 PM
    Author     : ActiveLearning
--%>

<%@page import="grocerific.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="p" class="grocerific.Product"/>
        
        
        <% p.setId(123);
            %>
    </body>
</html>

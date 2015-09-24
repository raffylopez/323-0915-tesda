<%-- 
    Document   : Hello
    Created on : Sep 24, 2015, 9:16:04 PM
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
        <% String theName = request.getParameter("the_name");
           out.println("Hello " + theName + "!");
        %>
        <br/>
        Hello, ${param.the_name}
        
        <br/>
        The Sum of 1 and 1 is : ${1+1}
    </body>
</html>

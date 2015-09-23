<%-- 
    Document   : DisplayData
    Created on : Sep 23, 2015, 7:04:26 PM
    Author     : ActiveLearning
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            ArrayList<String> retrievedFruits = 
                    (ArrayList<String>)application.getAttribute("the_fruits");
            for(String fruit:retrievedFruits){
                out.println("-" + fruit + "<br/>");
            }
            %>
    </body>
</html>

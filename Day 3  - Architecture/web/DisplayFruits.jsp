<%-- 
    Document   : DisplayFruits.jsp
    Created on : Aug 12, 2015, 1:39:09 PM
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
        <table border="1">
        <%
            ArrayList<String> retrievedFruits = (ArrayList<String>)application.getAttribute("my_fruits");
            for(String fruit:retrievedFruits){%>
            <tr><td><%= fruit %></td></tr>
            <%}
            
            %>
            </table>
    </body>
</html>

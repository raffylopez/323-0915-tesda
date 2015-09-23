<%-- 
    Document   : ProcessEmployee
    Created on : Sep 23, 2015, 10:03:25 PM
    Author     : ActiveLearning
--%>

<%@page import="com.acme.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- <% Employee e = new Employee(); %> --%>
        <jsp:useBean id="e" class="com.acme.Employee"/>
        
        <jsp:setProperty name="e" property="*" />
        
        Name: <jsp:getProperty name="e" property="name"/><br/>
        Age: <jsp:getProperty name="e" property="age"/><br/>
        Salary: <jsp:getProperty name="e" property="salary"/><br/>
        
    </body>
</html>

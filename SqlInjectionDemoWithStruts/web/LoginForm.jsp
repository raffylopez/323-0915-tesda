<%-- 
    Document   : index
    Created on : Aug 14, 2015, 12:24:22 PM
    Author     : ActiveLearning
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        Input correct username to login<br/>
        <form action="LoginAction.do">
            Username: <input type="text" name="username" />
            <br/>
            <input type="submit" value="Login"/>
        </form>
        <html:errors/>
        
        
    </body>
</html>

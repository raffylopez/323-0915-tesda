<%-- 
    Document   : SelectPriorityForm.jsp
    Created on : Sep 30, 2015, 8:05:40 PM
    Author     : ActiveLearning
--%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ipod Adviser</h1>
        <form action="SelectIpod.do">
            <input type="radio" name="priority" value="size"/>Size<br/>
            <input type="radio" name="priority" value="capacity"/>Capacity<br/>
            <input type="radio" name="priority" value="price"/>Price<br/><br/>
            <input type="submit" value="Submit"/>
        </form>
        <html:errors/>
    </body>
</html>

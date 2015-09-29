<%-- 
    Document   : DisplayTestimonial
    Created on : Sep 28, 2015, 8:22:06 PM
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
        <c:out value="${param.the_testimonial}"/>
    </body>
</html>

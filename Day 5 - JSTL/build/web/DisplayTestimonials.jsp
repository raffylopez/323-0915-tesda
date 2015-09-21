<%-- 
    Document   : DisplayTestimonials
    Created on : Aug 13, 2015, 3:07:06 PM
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
        <c:out value="${param.testimonial}" />
    </body>
</html>

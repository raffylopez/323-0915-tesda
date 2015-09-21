<%-- 
    Document   : index
    Created on : Aug 11, 2015, 4:26:36 PM
    Author     : ActiveLearning
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%!
    @Override
    public void init() throws ServletException {
        System.out.println("hello world");
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%= "Hello world!"%><br/>
        <%= new java.util.Date()%><br/>

        
        <%  out.println("Hello world!");%>
        <%-- asdfsdf  sdf--%>
        <% session.setAttribute("abc", 123);%>

        
        
            out.println("<h1>Servlet asdfsdf at " + request.getContextPath() + "</h1>");

            //String name = (String) session.getAttribute("s_name");
            //String age = (String) session.getAttribute("s_age");

            out.println(name + "<br/>");
            out.println(age + "<br/>");
        %>
    </body>
</html>

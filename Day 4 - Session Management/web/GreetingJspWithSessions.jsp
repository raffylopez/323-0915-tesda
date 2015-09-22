<%-- 
    Document   : GreetingJspWithSessions
    Created on : Sep 22, 2015, 6:53:31 PM
    Author     : ActiveLearning
--%>

<%!
    public void jspInit(ServletConfig cfg){
        // iniitialization code
    }
   %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!-- head -->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%-- compute sum --%>
        <%   
            /*int number = 1 + 1;          */
            int sum = 1 + 1;
        %>
        <%= "The sum is: " + sum %> 
    </body>
</html>

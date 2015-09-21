<%-- 
    Document   : DisplayMessage
    Created on : Aug 13, 2015, 10:13:19 AM
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
     
        <%  String s = (String)session.getAttribute("secretMessage");
        out.println(s);
            %>
        
        <jsp:useBean id="secretMessage" class="java.lang.String" scope="session"/>
        <%  out.println(secretMessage); %> 
        
        
        
        <%-- METHOD 2 --%>
        ${secretMessage}<br/>
        Employee Id: ${the_person["id"]}<br/>
        Employee Name: ${the_person.name}<br/>
        Employee Age: ${the_person.age}<br/>
    </body>
</html>

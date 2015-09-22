<%-- 
    Document   : AddToCart
    Created on : Sep 22, 2015, 7:54:53 PM
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
            /* (1) Get product String from form */
            String item = request.getParameter("the_product");
            //                   ^ taken from form
            
            /* (2) Read a session attribute named 'cart' into java variable 'cart' */
            ArrayList<String> cart;
            cart = (java.util.ArrayList) session.getAttribute("cart");
            
            /* (3) Is it null? If null, then cart = new ArrayList<String>(); */
            if (cart==null){
                cart = new java.util.ArrayList<String>();
            }
            /* (4) Add product String to cart */
            
            /* (5) Save cart back into session */
            
            /* (6) Display contents of cart using a loop */
        %>
    </body>
</html>

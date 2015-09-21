<%@page import="java.util.ArrayList"%>
<%
    
    // NO
    ArrayList<String> cart = new java.util.ArrayList();
    
    // YES
    java.util.ArrayList<String> mycart = (java.util.ArrayList) session.getAttribute("cart");
    if (mycart == null) {
        mycart = new java.util.ArrayList();
    }
    
    %>
    
    
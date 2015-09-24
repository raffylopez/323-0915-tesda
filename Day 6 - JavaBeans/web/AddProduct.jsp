<%-- TIP: This is not MVC, form submits to this JSP directly --%>

<%@page import="grocerific.Product"%>
<%-- (1) use useBean to create a new Product object with 
         id="p". 
         (NOTE: No need to define scope="..." here)
--%><jsp:useBean id="p" class="grocerific.Product" />

<%-- (2) Auto-populate "p" with data from form using jsp:setProperty with param. --%>
<jsp:setProperty name="p" property="*" />

<%-- (3) use useBean to read an ArrayList attribute named "list" 
         (NOTE: Use scope="session" here, so the list saves to the session)
--%><jsp:useBean id="list" class="java.util.ArrayList" scope="session"/>

<%-- (4) use a scriptlet to add the "p" in number 1 into 
         the ArrayList "list". Then save "list" back to session.
         Remember that you can use variables you created in 
         <jsp:useBean> within scriptlets
--%>
<%
    list.add(p);
    session.setAttribute("list", list);
    
    for(Object o:list){
        Product p = (Product) o;
        out.println(p.getId());
        out.println(p.getDescription());
    }
%>

<%-- (5) in the scriplet, use a for-loop to loop over the
         ArrayList "list"
--%>




<%
    
    
    %>
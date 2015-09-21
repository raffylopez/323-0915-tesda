<form action="AskAMessage.jsp">
    Message: <input type="text" name="the_message"/><br/>
    <input type="submit" value="Go"/>
</form><br/>

<%
if (request.getParameter("the_message") !=null) {
    out.println(request.getParameter("the_message"));
}
%>

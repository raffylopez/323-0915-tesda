<%@page import="com.acme.Employee"%>

<jsp:useBean id="john" class="com.acme.Employee" />
<jsp:setProperty name="john" property="*"  />


id: <jsp:getProperty name="john" property="id"/><br/>
name: <jsp:getProperty name="john" property="name"/><br/>
age: <jsp:getProperty name="john" property="age"/><br/>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<style><%@include file="/WEB-INF/style.css"%></style>
<!DOCTYPE html>
<html>
<head>
    <title>Index</title>
</head>
<div class="block-level">
<body>
<%Boolean sessionInvalid = session.getAttribute("session") == null;%>
<% String Welcome = sessionInvalid ? "Please log in" : "Welcome, "+ session.getAttribute("user"); %>
<h1><%=Welcome%>
</h1>
<br/>
<%if(!sessionInvalid){%><a href="display.jsp">Intern list</a> | <a href="logoutprocess.jsp">Log Out</a><%}else{%> <a href="login.jsp">Log in</a><%}%>
</body></div>
</html>
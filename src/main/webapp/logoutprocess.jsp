
<%@ include file="index.jsp" %>
<html>
<head>
    <title>Log out</title>
</head>
<body>
<%session.invalidate();
out.print("You have been successfully logged out.");
%>
</body>
</html>

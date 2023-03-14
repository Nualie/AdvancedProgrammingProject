<%--
  Created by IntelliJ IDEA.
  User: PC_Cray
  Date: 13/03/2023
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="index.jsp" %>
<hr/>

<h3>Login Form</h3>
<%
    String profile_message =(String)request.getAttribute("profile_msg");
    if(profile_message !=null){
        out.print(profile_message);
    }
    String login_message =(String)request.getAttribute("login_msg");
    if(login_message !=null){
        out.print(login_message);
    }
%>
<br/>
<form action="loginprocess.jsp" method="post">
    Email:<input type="text" name="email"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="Log in"/>
</form>
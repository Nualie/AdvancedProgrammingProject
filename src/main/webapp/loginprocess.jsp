<%@ page import="bean.LoginDao" %>
<jsp:useBean id="obj" class="bean.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>

<%
  boolean status= LoginDao.validate(obj);  ; //TODO: implement log in process
  if(status){
    out.println("Successfully logged in");
    session.setAttribute("session","TRUE");
  }
  else
  {
    out.print("Sorry, email or password error");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
  }
%>
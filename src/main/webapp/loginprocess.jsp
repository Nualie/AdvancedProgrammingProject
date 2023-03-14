<%@ page import="bean.LoginDao" %>
<jsp:useBean id="obj" class="bean.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>

<%
  boolean status= LoginDao.validate(obj);
  if(status){
    out.print("Successfully logged in!");
    session.setAttribute("session","TRUE");
    session.setAttribute("user",LoginDao.getLogin(obj));
    session.setAttribute("tutorId",LoginDao.getTutorId(obj));
  }
  else
  {
    out.print("Sorry, email or password error.");}
%>
<jsp:include page="index.jsp"></jsp:include>

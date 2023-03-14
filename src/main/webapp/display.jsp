<%--
  Created by IntelliJ IDEA.
  User: PC_Cray
  Date: 15/02/2023
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="bean.InternInfoDao" %>
<%@ page import="static java.sql.DriverManager.println" %>
<jsp:useBean id="obj" class="bean.InternInfoBean"/>
<%@ include file="index.jsp" %>
<jsp:setProperty property="*" name="obj"/>

<!DOCTYPE html>
<html>
<body>
<%if(sessionInvalid) println("You are not authorized to view this page");
else {
%>
<form>
    <table>
        <tr>
            <td><b>Name</b></td>
            <td><b>First name</b></td>
            <td><b>Email</b></td>
            <td><b>CDC</b></td>
            <td><b>Email</b></td>
            <td><b>Fiche Visite</b></td>
            <td><b>Fiche Val Entree</b></td>
            <td><b>Sondage Web</b></td>
            <td><b>Rapport Rendu</b></td>
            <td><b>Soutenance</b></td>
            <td><b>Visite planifiee</b></td>
            <td><b>Visite faite</b></td>
        </tr>
        <c:set var="id" scope="session" value="${sessionScope.get(\"tutorId\")}"/>
        <c:forEach items="${InternInfoDao.InternInformation(id)}" var="intern">
            <tr>
                <td>  ${intern.lastname}</td>
                <td>  ${intern.firstname}    </td>
                <td>  ${intern.email}  </td>
                <td>  ${intern.cdc}  </td>
                <td>  ${intern.fichevisite}  </td>
                <td>  ${intern.ficheevalentree}  </td>
                <td>  ${intern.sondageweb}  </td>
                <td>  ${intern.rapportrendu}  </td>
                <td>  ${intern.sout}  </td>
                <td>  ${intern.visiteplanif}  </td>
                <td>  ${intern.visitefaite}  </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
<%}%>

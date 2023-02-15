<%--
  Created by IntelliJ IDEA.
  User: PC_Cray
  Date: 15/02/2023
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 
    Document   : welcome
    Created on : 20 sept. 2019, 10:33:43
    Author     : JAA
--%>
<!DOCTYPE html>
<html>
<body>
<form>
    <table>
        <tr>
            <td><b>Name</b></td>
            <td><b>First name</b></td>
            <td><b>Email</b></td>
        </tr>

        <c:forEach items="${internList}" var="intern">
            <tr>
                <td>  ${intern.name}</td>
                <td>  ${intern.firstname}    </td>
                <td>  ${intern.mail}  </td>
            </tr>
        </c:forEach>
    </table>
    <input type='submit' name="action" value="Detail"/>
</form>
</body>
</html>


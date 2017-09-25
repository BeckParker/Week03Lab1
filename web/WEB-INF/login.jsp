<%-- 
    Document   : index
    Created on : Sep 20, 2017, 12:53:22 PM
    Author     : 679810
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
        <h1>Login</h1>
        <div>
            <form action="login" method="POST">
                Username: <input type="text" name="username" value="${username}"><br>
                Password: <input type="password" name="pword" value="${password}"><br>
                <input type="submit" value="Login">
            </form>
        </div>
        ${errorMessage}
        ${success}
    
<c:import url="/includes/footer.html" />

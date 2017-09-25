<%-- 
    Document   : index
    Created on : Sep 20, 2017, 12:53:22 PM
    Author     : 679810

1.	LoginServlet: doGet displays a login form (login.jsp) to the user that can also show messages.  
        doPost() processes the submission of the form.  doPost() first validates that user name and password are not empty.  
        Then, it passes the user name and password parameters to the login() method of a business/service class called UserService.  
        If login() returns true, forwards the user to the mainPage.jsp.  
        If invalid, display an appropriate error message, keeping the textboxes filled in with what the user had previously entered.
2.	MainPageServlet: shows a welcome message (mainPage.jsp) to the user including his/her username. 
        Also shows a Logout hyperlink which will take the user back to the LoginPage servlet and display the message “You have successfully logged out.”

The UserService class is very simple.  It has only one (non-static) method:
	boolean login(String username, String password)
which validates the user and password.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
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
    </body>
</html>

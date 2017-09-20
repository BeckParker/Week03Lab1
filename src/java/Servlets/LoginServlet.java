/*
1.	LoginServlet: doGet displays a login form (login.jsp) to the user that can also show messages.  
        doPost() processes the submission of the form.  doPost() user validates that user name and password are not empty.  
        Then, it passes the user name and password parameters to the login() method of a business/service class called UserService.  
        If login() returns true, forwards the user to the mainPage.jsp.  
        If invalid, display an appropriate error message, keeping the textboxes filled in with what the user had previously entered.
2.	MainPageServlet: shows a welcome message (mainPage.jsp) to the user including his/her username. 
        Also shows a Logout hyperlink which will take the user back to the LoginPage servlet and display the message “You have successfully logged out.”

The UserService class is very simple.  It has only one (non-static) method:
	boolean login(String username, String password)
which validates the user and password.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 679810
 */
public class LoginServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
         
         return;
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userName = request.getParameter("fname");
                userName = userName.toLowerCase();
        String passWord = request.getParameter("pword");
        
        if (userName == null || passWord == null 
                || userName.trim().isEmpty() || passWord.trim().isEmpty()) {
           
            doGet(request, response);
            
            request.setAttribute("errorMessage", "Both values are required!");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
            forward(request, response);
            
        } else if (userName != "adam" || userName != "betty" || passWord != "password") {
            request.setAttribute("errorMessage", "Invalid username or password!");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
            forward(request, response);
            
        }
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

/**
 *
 * @author 679810
 */
public class UserService {
    String userName1 = "betty";
    String userName2 = "adam";
    String passWord = "password";
    
    public boolean login (String username, String password) {
        
        if (username.equals(userName1) || username.equals(userName2) && password.equals(passWord))
            return true;
        else
            return false;
    }
    
    
}

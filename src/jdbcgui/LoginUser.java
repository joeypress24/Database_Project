/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcgui;

/**
 *
 * @author Press, Joseph, and Watsy, Farah
 */
public class LoginUser {
    String username;
    String Name; 
    int type;
    
    // constructor to create a new LoginUser object
    LoginUser(String uuser, String uname, int utype) {
        username = uuser;
        Name = uname;
        type = utype;
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

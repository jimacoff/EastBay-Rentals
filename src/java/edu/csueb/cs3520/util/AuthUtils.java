/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;


import edu.csueb.cs3520.bean.User;
import edu.csueb.cs3520.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moniq
 */
public class AuthUtils {

    public static User authorize(String uname, String pword) {
        User user = null;
        if (uname.equals("root") && pword.equals("password")) {
            user = new User();
            user.setUsername(uname);
            user.setPassword(pword);
        }
        return user;
    }


}

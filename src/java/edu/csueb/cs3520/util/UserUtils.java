/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;

import edu.csueb.cs3520.bean.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserUtils {
    
    
    private static ArrayList<User> users = new ArrayList();

    public UserUtils() {
        users.add(new User("root","password"));
    }
    
    public boolean addClient(User user){
        users.add(user);
        return true;
    }
    
    public User getClient(String username, String password){
        for (User user : users) {
            if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password))
                return user;
        }
        return null;
    }
    

    
    public static void updateUser(User user, String email){
        Statement stmt = null;
        Connection connection = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");            
        String dbURL = "jdbc:mysql://localhost:3306/cs3520";
            String username = "root";
            String password = "teste";
           connection = DriverManager.getConnection(
                    dbURL, username, password);
           stmt = connection.createStatement();
           String query ="Update user set username = '"+user.getUsername()+"', password='"+user.getPassword()+"', email= '"+ user.getEmail()+"' WHERE email= '"+email+"';";
           stmt.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
       
    }
    
public static User getUser(String unme, String pass) throws ClassNotFoundException {

        Statement stmt = null;
        ResultSet rs = null;
        Connection connection = null;
        User user = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");            
        String dbURL = "jdbc:mysql://localhost:3306/cs3520";
            String username = "root";
            String password = "teste";
           connection = DriverManager.getConnection(
                    dbURL, username, password);
           
            stmt = connection.createStatement();
            rs = stmt.executeQuery("select * from user where username= '"+unme+"'");
            while(rs.next()){
                String uname = rs.getString("username");
                String pswrd= rs.getString("password");
                                
                user= new User();
                user.setUsername(uname);
                user.setPassword(pswrd);
              
            }
            

            if(user.getPassword().equals(pass))
                return user;
           
           
        } catch (SQLException e) {
            for (Throwable t : e) {
                t.printStackTrace();
            }
        }finally{
            try {
                rs.close();
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
           
}     return null;
    }
    
    
    public static void insertUser(User user){
        Statement stmt = null;
        Connection connection = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");            
        String dbURL = "jdbc:mysql://localhost:3306/cs3520";
            String username = "root";
            String password = "teste";
           connection = DriverManager.getConnection(
                    dbURL, username, password);
           stmt = connection.createStatement();
           String query ="Insert into user (username,password) values('"+user.getUsername()+"','"+user.getPassword()+"')";
           stmt.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
       
    }
    
    public static boolean removeUserByEmail(String uname){
        Statement stmt = null;
        ResultSet rs = null;
        Connection connection = null;
        int count =0;
        try {
        Class.forName("com.mysql.jdbc.Driver");            
        String dbURL = "jdbc:mysql://localhost:3306/cs3520";
            String username = "root";
            String password = "teste";
           connection = DriverManager.getConnection(
                    dbURL, username, password);
           stmt = connection.createStatement();
           count = stmt.executeUpdate("Delete from user where username='"+uname+"'");
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
        return count!=0;
    }
    public static List<User> getUsers() throws ClassNotFoundException {
        List<User> users = new ArrayList<User>();
        Statement stmt = null;
        ResultSet rs = null;
        Connection connection = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");            
        String dbURL = "jdbc:mysql://localhost:3306/cs3520";
            String username = "cs3520";
            String password = "admin";
           connection = DriverManager.getConnection(
                    dbURL, username, password);
            
            //ConnectionFactory cf = new ConnectionFactory();
            //Connection connection = cf.getConnection();
            System.out.println("conectou!!"); 
            
            stmt = connection.createStatement();
            rs = stmt.executeQuery("select * from user");
            while(rs.next()){
                System.out.println(rs.getString("username")); 
                String uname = rs.getString("username");
                String pswrd= rs.getString("password");
                String email = rs.getString("email");
                
                User user= new User();
                user.setUsername(uname);
                user.setPassword(pswrd);
                user.setEmail(email);
                users.add(user);
            }
           
           
        } catch (SQLException e) {
            for (Throwable t : e) {
                t.printStackTrace();
            }
        }finally{
            try {
                rs.close();
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
           
}     return users;
    }
}

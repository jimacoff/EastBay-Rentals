/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;

import edu.csueb.cs3520.bean.Client;
import edu.csueb.cs3520.bean.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientUtils {
    private ArrayList<Client> clients = new ArrayList();
    
    public static Client getClient(String unme) throws ClassNotFoundException {

        Statement stmt = null;
        ResultSet rs = null;
        Connection connection = null;
        Client client = null;
        try {
Class.forName("com.mysql.jdbc.Driver");            
String dbURL = "jdbc:mysql://localhost:3306/cs3520";
            String username = "root";
            String password = "teste";
           connection = DriverManager.getConnection(
                    dbURL, username, password);
           
            stmt = connection.createStatement();
            rs = stmt.executeQuery("select * from client where username= '"+unme+"'");
            while(rs.next()){
            rs.getString("unme");
                rs.getString("pass");
                
                                
                client = new Client(rs.getString("firstName"),rs.getString("lastName"),rs.getString("email"),rs.getString("username"),rs.getString("password"));
                
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
           
}     return client;
    }
    
    public static void addClient(Client client){
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
           String query ="Insert into client (firstName,lastName,password,email,cardinfo,username) values('"+client.getName()+"','"+client.getLastname()+"','"+client.getPswd()+"','"+client.getEmail()+"','"+client.getCardInfo()+"','"+client.getUname()+"')";
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
    
}

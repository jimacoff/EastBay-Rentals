/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;

import edu.csueb.cs3520.bean.Rental;
import edu.csueb.cs3520.bean.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RentalUtils {

    


    public RentalUtils() {

    }


    public static Rental getRental(Date inicio, Date fim, int carId) throws ClassNotFoundException {

        Statement stmt = null;
        ResultSet rs = null;
        Connection connection = null;
        Rental rental = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/cs3520";
            String username = "root";
            String password = "teste";
            connection = DriverManager.getConnection(
                    dbURL, username, password);

            stmt = connection.createStatement();
            rs = stmt.executeQuery("select * from rental where carId = '" + carId + "'");
            
            while (rs.next()) {

                rental = new Rental(rs.getInt("carId"), rs.getString("username"), rs.getDate("startDate"), rs.getDate("endDate"), rs.getDouble("total"));
                if(rental!=null)
                    if (rental.getBegin().after(fim) && rental.getEnd().before(inicio)) {
                        return rental;
                }
                    
            }

        } catch (SQLException e) {
            for (Throwable t : e) {
                t.printStackTrace();
            }
        } finally {
            try {
                rs.close();
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
            return null;
    }

    public static void addRental(Rental rental) {
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

            String query = "Insert into rental (username,carId,startDate,endDate,total) values('" + rental.getUsername() + "','" + rental.getIdCar() + "','" + rental.getBegin() + "','" + rental.getEnd() + "','" + rental.getTotal() + "')";
            stmt.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserUtils.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }



  public static List<Rental> getRentals() throws ClassNotFoundException {
        List<Rental> rentals = new ArrayList<Rental>();   
        Statement stmt = null;
        ResultSet rs = null;
        Connection connection = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/cs3520";
            String username = "root";
            String password = "teste";
            connection = DriverManager.getConnection(
                    dbURL, username, password);

            stmt = connection.createStatement();
            rs = stmt.executeQuery("select * from rental");
            while (rs.next()) {
                System.out.print(rs.getString("username"));
                Rental rental = new Rental();
                rental.setUsername(rs.getString("username"));                
                rental.setIdCar(rs.getInt("carId"));
                rental.setBegin(rs.getDate("startDate"));
                rental.setEnd(rs.getDate("endDate"));
                rental.setTotal(rs.getDouble("total"));
                rentals.add(rental);  
            }
            
            
        } catch (SQLException e) {
            for (Throwable t : e) {
                t.printStackTrace();
            }
        } finally {
            try {
                rs.close();
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return rentals;
    }
  
  public static boolean deleteRental(String uname, Double total){
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
           count = stmt.executeUpdate("Delete from rental where username='"+uname+"' and total= '"+total+"'");
           
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
}
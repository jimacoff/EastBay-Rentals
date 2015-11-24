/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.servlet;

import edu.csueb.cs3520.bean.User;
import edu.csueb.cs3520.util.AuthUtils;
import edu.csueb.cs3520.util.UserUtils;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Monique
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/AdminServlet"})
public class AdminServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        
        
        String action = request.getParameter("action");
        if(null!=action && action.equals("delete")){
            System.out.println("deleting user");
            //delete user
            String email = request.getParameter("email");
            if(null!=email){
                boolean status = UserUtils.removeUserByEmail(email);
            }
            
        }
        else if(null!=action && action.equals("insert")){
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String email1= request.getParameter("email");
                User user = new User();
                user.setEmail(email1);
                user.setPassword(password);
                user.setUsername(username);
                UserUtils.insertUser(user);
            } else if(null!=action && action.equals("update")){
                String email= request.getParameter("OldEmail");
                User user = UserUtils.getUser(email);
                request.setAttribute("oldUser", user);
                this.getServletContext().getRequestDispatcher("/update.jsp").forward(request, response);   
            }
                List<User> users = UserUtils.getUsers();
                request.setAttribute("users", users);
                this.getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
                
        
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

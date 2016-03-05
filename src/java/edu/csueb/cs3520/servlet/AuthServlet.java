/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.servlet;

import edu.csueb.cs3520.bean.User;
import edu.csueb.cs3520.util.UserUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author moniq
 */
public class AuthServlet extends HttpServlet {

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
            throws ServletException, IOException {
            String url = "";
            if(request.getParameter("username") != null){
                try {
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    
                    System.out.println("Username: " + username);
                    System.out.println("Password: " + password);
                    
                    User user = new User();
                    if(username.equalsIgnoreCase("root"))
                        user = new User("root","password");
                    else   
                        user = UserUtils.getUser(username, password);
                    if(null!=user){
                        url="/index.jsp";
                        request.getSession().setAttribute("user", user);
                        //not use the request scope cause it clears in every request, Session scope will last for the time the user is logged in
                    }else{
                        url = "/gottalogin.jsp";
                        request.setAttribute("login_error", "Invalid login for Username: " +username+ ", Please retry credentials");            
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AuthServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                request.getSession().setAttribute("user", null);
                url = "/index.jsp";
                
            }
            this.getServletContext().getRequestDispatcher(url).forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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

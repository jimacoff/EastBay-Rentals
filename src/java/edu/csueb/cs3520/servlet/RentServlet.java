/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.servlet;

import edu.csueb.cs3520.bean.Car;
import edu.csueb.cs3520.bean.Rental;
import edu.csueb.cs3520.bean.User;
import edu.csueb.cs3520.util.CarUtils;
import edu.csueb.cs3520.util.DateUtils;
import edu.csueb.cs3520.util.RentalUtils;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thiagoloschi
 */
public class RentServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
            
            String url = "/rent.jsp";
            String id = request.getParameter("id");
            CarUtils cu = new CarUtils();
            Car car = cu.getCar(Integer.valueOf(id));
            String[] from = request.getParameter("begin").split("-");
            String[] to = request.getParameter("end").split("-");
            RentalUtils r = new RentalUtils();
             
            int yb = Integer.valueOf(from[0]);
            int mb = Integer.valueOf(from[1]);
            int db = Integer.valueOf(from[2]);
            int ye = Integer.valueOf(to[0]);
            int me = Integer.valueOf(to[1]);
            int de = Integer.valueOf(to[2]);
            
            Date begin = new Date(yb, mb, db);
            Date end = new Date(ye, me, de);
             
            Calendar inicio = Calendar.getInstance();
            Calendar fim = Calendar.getInstance();
            
            inicio.set(yb, mb, db);
            fim.set(ye,me,de);
            
            
            
            Long days = DateUtils.daysBetween(inicio,fim);
            Double cost;
            
            request.setAttribute("car", car);
            
            if(inicio.after(fim))
                request.setAttribute("login_error", "Please select a right date.");
            else{
                Rental rental;
               
                User user = (User) request.getSession().getAttribute("user");
                
                    
                rental = RentalUtils.getRental(begin, end, car.getId());
                
                if(rental == null){
                    if(inicio.equals(fim))
                        cost = car.getCost();
                    else
                        cost = days*car.getCost();
                    rental = new Rental(car.getId(),user.getUsername(),begin,end,cost);    
                    RentalUtils.addRental(rental);
                    request.setAttribute("begin", rental.getBegin().toGMTString().split("3")[0]);               
                    request.setAttribute("end", rental.getEnd().toGMTString().split("3")[0]);               
                    request.setAttribute("rental", rental);               
                    request.setAttribute("valid", true);
                }else{
                    request.setAttribute("end", rental.getEnd().toGMTString().split("3")[0]); 
                    request.setAttribute("rental", rental); 
                    request.setAttribute("valid", false);
                }
                
               
                
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RentServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(RentServlet.class.getName()).log(Level.SEVERE, null, ex);
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


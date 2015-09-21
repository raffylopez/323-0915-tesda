/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.hiddenfields;

import com.acme.rewriting.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ActiveLearning
 */
public class Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<h1>Servlet Servlet1 at " + request.getContextPath() + "</h1>");

            String name = request.getParameter("the_name");
            String age = request.getParameter("the_age");
            
            String encName = URLEncoder.encode(name);
            String encAge = URLEncoder.encode(age);

            out.println(name + "<br/>");
            out.println(age + "<br/>");
            out.println("<br/>");
  
            out.println("<form action='Servlet2'>");
            out.println(" <input type='submit' value='To Servlet2'/>");
            out.println(" <input type='hidden' name='the_name' value='"+name+"'/>");
            out.println(" <input type='hidden' name='the_age' value='"+age+"'/>");
            out.println("</form>");
//            out.println("<a href='Servlet2?the_name=" + encName + "&the_age=" 
//                                                      + encAge + "'>To Servlet2</a>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ActiveLearning
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
         Connection conn = null;
        PreparedStatement stmt = null;
        try {
            String username = request.getParameter("username");
            Class.forName("com.mysql.jdbc.Driver");
            final String USERNAME = "root";
            final String PASSWORD = "secret";
            final String CONNECTION_URL = "jdbc:mysql://localhost:3306/acme";
            String sql = "SELECT username FROM "
                       + "Users WHERE username=?";
            
            conn = 
                    DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,username);
            ResultSet rs = stmt.executeQuery();
            
            out.println("<h2>SQL: " + sql + "</h2>");
            int recordCount = 0;
            while(rs.next()){
                recordCount++;
            }
            if (recordCount > 0) {
                out.println("<h1>Welcome " + username + "!</h1>");
            } else {
                out.println("<h1>Invalid login, please try again!</h1>");
            }
           
        } catch (Exception ex) {
            out.println(ex);
            //response.sendRedirect("error.jsp");
        } finally {       
            try {
                if (stmt !=null) stmt.close();
                if (conn !=null) conn.close();
                out.close();
            } catch (Exception ex) {
            response.sendRedirect("error.jsp");    }
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

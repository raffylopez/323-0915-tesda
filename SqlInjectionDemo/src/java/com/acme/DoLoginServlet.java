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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ActiveLearning
 */
public class DoLoginServlet extends HttpServlet {

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
        PreparedStatement pstmt = null;
        
        try {
            
            String username = request.getParameter("username");
            Class.forName("com.mysql.jdbc.Driver");
            final String CONN_URL = "jdbc:mysql://localhost:3306/acme";
            final String USERNAME = "root";
            final String PASSWORD = "secret";
            String sql = "SELECT count(*) AS numrecords FROM Users WHERE username=?" ;

            conn = DriverManager.getConnection(CONN_URL, USERNAME, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            /* move cursor to first record */
            rs.next();
            
            int countOfSelectedRecords = rs.getInt("numrecords");
            
            /* if record exists in table, welcome user in */
            if (countOfSelectedRecords > 0) {
                out.println("<h2>Welcome " +username+ "!</h2>You have successfully logged in!</h1>");
            } else {
                out.println("<h2>Username '"+username+"' does not exist! </h2>Please try again.");
            }
            out.println("<br/><br/><b>SQL: </b><code>" + sql +"</code>");
            
        } catch (Exception e) {
            // TODO: log exception
            response.sendRedirect("error.jsp");
        } finally {
            out.close();
            try {
                if (pstmt!=null) pstmt.close();
                if (conn!= null) conn.close();
            } catch (SQLException ex) {
                response.sendRedirect("error.jsp");
            }
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

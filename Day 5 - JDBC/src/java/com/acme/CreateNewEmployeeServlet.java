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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ActiveLearning
 */
public class CreateNewEmployeeServlet extends HttpServlet {

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
        
        
        ArrayList<String> employeeNames = new ArrayList<String>();
        employeeNames.add("Janice");
        employeeNames.add("Sandra");
        employeeNames.add("James");
        employeeNames.add("Ken");
        employeeNames.add("Arnold");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String CONN_URL = "jdbc:mysql://localhost:3306/acme";
            final String USERNAME = "root";
            final String PASSWORD = "secret";
            String sql = "INSERT INTO Employees VALUES(DEFAULT, ?, DEFAULT, DEFAULT)";

            conn = DriverManager.getConnection(CONN_URL, USERNAME, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            
            for (String employeeName : employeeNames) {
                pstmt.setString(1, employeeName);
                pstmt.executeUpdate();
            }
            
            
        } catch (Exception e) {
            // TODO: log exception
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        } finally {
            out.close();
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
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

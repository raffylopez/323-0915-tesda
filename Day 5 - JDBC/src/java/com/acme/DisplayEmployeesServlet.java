/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
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
public class DisplayEmployeesServlet extends HttpServlet {
    static Logger logger = Logger.getLogger("DisplayEmployeesServlet");
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
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String CONN_URL = "jdbc:mysql://localhost:3306/acme";
            final String USERNAME = "root";
            final String PASSWORD = "secret";
            String sql = "SELECT id,name,age,salary FROM Employees";

            conn = DriverManager.getConnection(CONN_URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            out.println("<table>");
            while (rs.next()) {
                out.println("<tr>");
                int id = rs.getInt("id");
                String name = rs.getString(2);
                int age = rs.getInt(3);
                float salary = rs.getFloat(4);
                out.println("<td>" + id + "</td>");
                out.println("<td>" + name + "</td>");
                out.println("<td>" + age + "</td>");
                out.println("<td>" + salary + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");

        } catch (Exception e) {
            // TODO: log exception
            response.sendRedirect("error.jsp");
        } finally {
            out.close();
            try {
                if (stmt!=null) stmt.close();
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

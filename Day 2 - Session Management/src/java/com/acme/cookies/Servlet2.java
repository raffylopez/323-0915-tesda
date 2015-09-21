/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.cookies;

import com.acme.rewriting.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ActiveLearning
 */
public class Servlet2 extends HttpServlet {

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

            out.println("<h1>Servlet asdfsdf at " + request.getContextPath() + "</h1>");
            Cookie[] cookies = request.getCookies();
            Cookie nameCookie = findCookie(cookies, "c_name");
            Cookie ageCookie = findCookie(cookies, "c_age");

            String name = nameCookie == null ? "[unknown value]" : nameCookie.getValue();
            String age = ageCookie   == null ? "[unknown value]" : ageCookie.getValue();
            
            out.println(name + "<br/>");
            out.println(age + "<br/>");
        } finally {
            out.close();
        }
    }
    
    Cookie findCookie(Cookie[] cookies, String targetCookieName) {
        if (cookies != null){
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals(targetCookieName)){
                    return cookie;
                }
            }
        }
        return null;
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

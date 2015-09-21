/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ActiveLearning
 */
public class AuthenticatorModel {
    public boolean authenticate(String username){
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            
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
                return true;
            } else {
                return false;
            }
            
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (pstmt!=null) pstmt.close();
                if (conn!= null) conn.close();
            } catch (SQLException ex) {
                
            throw new RuntimeException(ex);
            }
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme;

import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author ActiveLearning
 */
public class MyContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("strawberry");
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("my_fruits", fruits);
    }

    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

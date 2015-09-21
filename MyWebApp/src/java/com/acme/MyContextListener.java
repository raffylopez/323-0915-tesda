/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme;

import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author ActiveLearning
 */
@WebListener
public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("kiwi");
        ServletContext sc = sce.getServletContext();
        sc.setAttribute("my_fruits", fruits);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}

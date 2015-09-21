/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ActiveLearning
 */
public class ExceptionHandlingDemo {
    public static void badMethod1() throws FileNotFoundException{
        badMethod2();
    }
    
    public static void badMethod2() throws FileNotFoundException{
        new FileInputStream("nonexistent file");
    }
    
    public static void main(String[] args) {
        try {
            badMethod1();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExceptionHandlingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

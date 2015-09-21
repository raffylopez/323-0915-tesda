/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author ActiveLearning
 */
public class LoginActionForm extends org.apache.struts.action.ActionForm {
    String username;
    
    
    
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (username.trim().equals("")) {
            errors.add("djfdsfj", new ActionMessage("username.is.blank"));
        }
        return errors;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

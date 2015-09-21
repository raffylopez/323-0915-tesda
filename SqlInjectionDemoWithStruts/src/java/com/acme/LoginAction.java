/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme;

import com.acme.models.AuthenticatorModel;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ActiveLearning
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginActionForm laf = (LoginActionForm) form;
        String username = laf.getUsername();
        AuthenticatorModel model = new AuthenticatorModel();
        boolean isValidUser = model.authenticate(username);
        request.setAttribute("the_username", username);
        
        if(isValidUser==true) {
            return mapping.findForward("valid_user");
        } else {
            return mapping.findForward("invalid_user");
        }
        
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ipod;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author ActiveLearning
 */
public class SelectPriorityForm extends org.apache.struts.action.ActionForm {
    
    private String priority;
    
    

    /**
     *
     */
    public SelectPriorityForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (
               getPriority() == null || (
               !getPriority().equals("size") && 
               !getPriority().equals("capacity") && 
               !getPriority().equals("price") 
           )) {
            // fail validation here
            errors.add("name", new ActionMessage("invalid.priority"));
        }
        return errors;
    }
}

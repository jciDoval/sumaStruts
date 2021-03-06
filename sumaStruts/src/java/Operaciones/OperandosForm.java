/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author alumno
 */
public class OperandosForm extends org.apache.struts.action.ActionForm {
    
    private String operando1, operando2;
    private double dato1, dato2;
    private double resultado;
    private ActionErrors errors = new ActionErrors();

    public ActionErrors getErrors() {
        return errors;
    }

    public void setErrors(ActionErrors errors) {
        this.errors = errors;
    }

    
    
    public String getOperando1() {
        return operando1;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setOperando1(String operando1) {
        this.operando1 = operando1;
    }

    public String getOperando2() {
        return operando2;
    }

    public void setOperando2(String operando2) {
        this.operando2 = operando2;
    }

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

   
    
    

    /**
     *
     */
    public OperandosForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        errors.clear();
        
        if (operando1 == null || operando1.trim().length() < 1) {
            errors.add("Operando 1", new ActionMessage("error.operando1.necesario"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        if (operando2 == null || operando2.trim().length() < 1) {
            errors.add("Operando 2", new ActionMessage("error.operando2.necesario"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        //try para el primer operando.
        try
        {
            dato1 = Double.parseDouble(operando1);
        }
        catch(NumberFormatException e)
        {
            errors.add("Formato1", new ActionMessage("error.formato1"));
        }
        
        
        //Try para el segundo operando
        try
        {
            dato2 = Double.parseDouble(operando2);
        }
        catch(NumberFormatException e)
        {
            errors.add("Formato2", new ActionMessage("error.formato2"));
        }
        
        return errors;
    }
}

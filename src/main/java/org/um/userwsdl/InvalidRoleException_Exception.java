
package org.um.userwsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidRoleException", targetNamespace = "http://um.org/userwsdl")
public class InvalidRoleException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidRoleException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidRoleException_Exception(String message, InvalidRoleException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidRoleException_Exception(String message, InvalidRoleException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.org.um.userwsdl.InvalidRoleException
     */
    public InvalidRoleException getFaultInfo() {
        return faultInfo;
    }

}

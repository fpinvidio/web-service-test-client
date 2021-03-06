
package org.um.vendorwsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidTokenException", targetNamespace = "http://um.org/vendorwsdl")
public class InvalidTokenException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidTokenException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidTokenException_Exception(String message, InvalidTokenException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidTokenException_Exception(String message, InvalidTokenException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.org.um.vendorwsdl.InvalidTokenException
     */
    public InvalidTokenException getFaultInfo() {
        return faultInfo;
    }

}

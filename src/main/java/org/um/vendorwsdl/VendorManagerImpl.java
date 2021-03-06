
package org.um.vendorwsdl;

import org.um.model.Role;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "VendorManagerImpl", targetNamespace = "http://um.org/vendorwsdl")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VendorManagerImpl {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws InvalidTokenException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "uploadMovie", targetNamespace = "http://um.org/vendorwsdl", className = "org.org.um.vendorwsdl.UploadMovie")
    @ResponseWrapper(localName = "uploadMovieResponse", targetNamespace = "http://um.org/vendorwsdl", className = "org.org.um.vendorwsdl.UploadMovieResponse")
    public void uploadMovie(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
            Role arg1,
            @WebParam(name = "arg2", targetNamespace = "")
            Movie arg2)
        throws InvalidTokenException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws InvalidTokenException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "uploadAd", targetNamespace = "http://um.org/vendorwsdl", className = "org.org.um.vendorwsdl.UploadAd")
    @ResponseWrapper(localName = "uploadAdResponse", targetNamespace = "http://um.org/vendorwsdl", className = "org.org.um.vendorwsdl.UploadAdResponse")
    public void uploadAd(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
            Role arg1,
            @WebParam(name = "arg2", targetNamespace = "")
            Ad arg2)
        throws InvalidTokenException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws InvalidTokenException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "uploadClip", targetNamespace = "http://um.org/vendorwsdl", className = "org.org.um.vendorwsdl.UploadClip")
    @ResponseWrapper(localName = "uploadClipResponse", targetNamespace = "http://um.org/vendorwsdl", className = "org.org.um.vendorwsdl.UploadClipResponse")
    public void uploadClip(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
            Role arg1,
            @WebParam(name = "arg2", targetNamespace = "")
            ClipData arg2)
        throws InvalidTokenException_Exception
    ;

}

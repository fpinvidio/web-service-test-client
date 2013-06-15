
package org.um.userwsdl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "UserManagerWebService", targetNamespace = "http://um.org/userwsdl", wsdlLocation = "http://localhost:8080/usermanager-1.0-SNAPSHOT/webservices/UserManager?wsdl")
public class UserManagerWebService
    extends Service
{

    private final static URL USERMANAGERWEBSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.um.userwsdl.UserManagerWebService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.um.userwsdl.UserManagerWebService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/usermanager-1.0-SNAPSHOT/webservices/UserManager?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/usermanager-1.0-SNAPSHOT/webservices/UserManager?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        USERMANAGERWEBSERVICE_WSDL_LOCATION = url;
    }

    public UserManagerWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserManagerWebService() {
        super(USERMANAGERWEBSERVICE_WSDL_LOCATION, new QName("http://um.org/userwsdl", "UserManagerWebService"));
    }

    /**
     * 
     * @return
     *     returns UserManagerImpl
     */
    @WebEndpoint(name = "UserManagerPort")
    public UserManagerImpl getUserManagerPort() {
        return super.getPort(new QName("http://um.org/userwsdl", "UserManagerPort"), UserManagerImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserManagerImpl
     */
    @WebEndpoint(name = "UserManagerPort")
    public UserManagerImpl getUserManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://um.org/userwsdl", "UserManagerPort"), UserManagerImpl.class, features);
    }

}

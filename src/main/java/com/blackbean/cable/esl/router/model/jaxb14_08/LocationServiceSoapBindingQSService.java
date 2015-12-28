
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebServiceClient(name = "LocationServiceSoapBindingQSService", targetNamespace = "http://xml.blackbean.com/location/services", wsdlLocation = "https://cet-esp.cable.blackbean.com/LocationService/14.08?wsdl")
public class LocationServiceSoapBindingQSService
        extends Service {

    private final static URL LOCATIONSERVICESOAPBINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOCATIONSERVICESOAPBINDINGQSSERVICE_EXCEPTION;
    private final static QName LOCATIONSERVICESOAPBINDINGQSSERVICE_QNAME = new QName("http://xml.blackbean.com/location/services", "LocationServiceSoapBindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://cet-esp.cable.blackbean.com/LocationService/14.08?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOCATIONSERVICESOAPBINDINGQSSERVICE_WSDL_LOCATION = url;
        LOCATIONSERVICESOAPBINDINGQSSERVICE_EXCEPTION = e;
    }

    public LocationServiceSoapBindingQSService() {
        super(__getWsdlLocation(), LOCATIONSERVICESOAPBINDINGQSSERVICE_QNAME);
    }

    public LocationServiceSoapBindingQSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOCATIONSERVICESOAPBINDINGQSSERVICE_QNAME, features);
    }

    public LocationServiceSoapBindingQSService(URL wsdlLocation) {
        super(wsdlLocation, LOCATIONSERVICESOAPBINDINGQSSERVICE_QNAME);
    }

    public LocationServiceSoapBindingQSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOCATIONSERVICESOAPBINDINGQSSERVICE_QNAME, features);
    }

    public LocationServiceSoapBindingQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LocationServiceSoapBindingQSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns LocationServicePort
     */
    @WebEndpoint(name = "LocationServiceSoapBindingQSPort")
    public LocationServicePort getLocationServiceSoapBindingQSPort() {
        return super.getPort(new QName("http://xml.blackbean.com/location/services", "LocationServiceSoapBindingQSPort"), LocationServicePort.class);
    }

    /**
     * @param features A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns LocationServicePort
     */
    @WebEndpoint(name = "LocationServiceSoapBindingQSPort")
    public LocationServicePort getLocationServiceSoapBindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xml.blackbean.com/location/services", "LocationServiceSoapBindingQSPort"), LocationServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOCATIONSERVICESOAPBINDINGQSSERVICE_EXCEPTION != null) {
            throw LOCATIONSERVICESOAPBINDINGQSSERVICE_EXCEPTION;
        }
        return LOCATIONSERVICESOAPBINDINGQSSERVICE_WSDL_LOCATION;
    }

}

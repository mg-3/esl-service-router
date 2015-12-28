package com.blackbean.cable.esl.router.client.soap;

import com.blackbean.cable.esl.router.model.jaxb14_08.LocationServicePort;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * @author Mike Garcia
 *         Date: 12/3/2015
 *         esl-service-router
 */
public abstract class SoapClient<R> {

    private final static Logger log = LoggerFactory.getLogger(SoapClient.class);

    protected final static String WSDL14_08 = "com.blackbean.cable.esl.router.model.jaxb14_08";
    protected JAXBContext jaxbContext;
    protected LocationServicePort port;

    protected SoapClient(LocationServicePort locationServicePort) {
        try {
            this.jaxbContext = JAXBContext.newInstance(WSDL14_08);
        } catch (JAXBException e) {
            log.error("Unable to create JAXBj context", e);
        }
        this.port = locationServicePort;
    }

    protected static final String OASIS_XSD = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    protected static final String HTTP_XML_DOMAIN_TYPES = "http://xml.blackbean.com/types";
    protected static final String REQUEST_HEADER = "requestHeader";
    protected static final String TIMESTAMP = "timestamp";
    protected static final String SOURCE_SYSTEM_ID = "sourceSystemId";
    protected static final String SOURCE_SERVER_ID = "sourceServerId";
    protected static final String TRACKING_ID = "trackingId";
    protected static final String NS_1 = "ns1";

    @Async
    public abstract Future<R> performOperation(Map<String, String> params, final String u, final String p) throws Exception;

    protected void setHeaders(String u, String p) throws SOAPException {
        ((WSBindingProvider) port).setOutboundHeaders(
                soapSecurityHeader(u, p), soapRequestHeader()
        );
    }

    protected Header soapSecurityHeader(final String u, final String p) throws SOAPException {
        SOAPFactory soapFactory = SOAPFactory.newInstance();
        String SECURITY_NAMESPACE = OASIS_XSD;
        QName securityQName = new QName(SECURITY_NAMESPACE, "Security");
        SOAPElement security = soapFactory.createElement(securityQName);
        QName usernameTokenQName = new QName(SECURITY_NAMESPACE, "UsernameToken");
        SOAPElement usernameToken = soapFactory.createElement(usernameTokenQName);
        QName usernameQName = new QName(SECURITY_NAMESPACE, "Username");
        SOAPElement username = soapFactory.createElement(usernameQName);
        username.addTextNode(u);
        QName passwordQName = new QName(SECURITY_NAMESPACE, "Password");
        SOAPElement password = soapFactory.createElement(passwordQName);
        password.addTextNode(p);
        usernameToken.addChildElement(username);
        usernameToken.addChildElement(password);
        security.addChildElement(usernameToken);
        return Headers.create(security);
    }

    protected Header soapRequestHeader() throws SOAPException {
        LocalDateTime dateTime = LocalDateTime.now();
        SOAPFactory soapFactory = SOAPFactory.newInstance();
        SOAPElement reqHdr = soapFactory.createElement(new QName(HTTP_XML_DOMAIN_TYPES, REQUEST_HEADER, NS_1));
        SOAPElement timestamp = soapFactory.createElement(new QName(HTTP_XML_DOMAIN_TYPES, TIMESTAMP, NS_1));
        timestamp.addTextNode(dateTime.toString());
        SOAPElement sourceSystemId = soapFactory.createElement(new QName(HTTP_XML_DOMAIN_TYPES, SOURCE_SYSTEM_ID, NS_1));
        sourceSystemId.addTextNode("asdcfv");
        SOAPElement sourceServerId = soapFactory.createElement(new QName(HTTP_XML_DOMAIN_TYPES, SOURCE_SERVER_ID, NS_1));
        sourceServerId.addTextNode("sdf");
        SOAPElement trackingId = soapFactory.createElement(new QName(HTTP_XML_DOMAIN_TYPES, TRACKING_ID, NS_1));
        trackingId.addTextNode("QLX_TC1");

        reqHdr.addChildElement(sourceServerId);
        reqHdr.addChildElement(sourceSystemId);
        reqHdr.addChildElement(timestamp);
        reqHdr.addChildElement(trackingId);
        return Headers.create(reqHdr);
    }
}

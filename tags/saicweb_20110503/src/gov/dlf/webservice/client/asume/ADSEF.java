
package gov.dlf.webservice.client.asume;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "ADSEF", targetNamespace = "http://serviciosenlinea.asume.gobierno.pr/WebServiceADSEF/", wsdlLocation = "http://serviciosenlinea.asume.gobierno.pr/WebServiceADSEF/ADSEF.asmx?WSDL")
public class ADSEF
    extends Service
{

    private final static URL ADSEF_WSDL_LOCATION;
    private final static WebServiceException ADSEF_EXCEPTION;
    private final static QName ADSEF_QNAME = new QName("http://serviciosenlinea.asume.gobierno.pr/WebServiceADSEF/", "ADSEF");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://serviciosenlinea.asume.gobierno.pr/WebServiceADSEF/ADSEF.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADSEF_WSDL_LOCATION = url;
        ADSEF_EXCEPTION = e;
    }

    public ADSEF() {
        super(__getWsdlLocation(), ADSEF_QNAME);
    }

    public ADSEF(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADSEF_QNAME);
    }

    public ADSEF(URL wsdlLocation) {
        super(wsdlLocation, ADSEF_QNAME);
    }

    public ADSEF(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADSEF_QNAME);
    }

    public ADSEF(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ADSEF(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     *
     * @return
     *     returns ADSEFSoap
     */
    @WebEndpoint(name = "ADSEFSoap")
    public ADSEFSoap getADSEFSoap() {
        return super.getPort(new QName("http://serviciosenlinea.asume.gobierno.pr/WebServiceADSEF/", "ADSEFSoap"), ADSEFSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ADSEFSoap
     */
    @WebEndpoint(name = "ADSEFSoap")
    public ADSEFSoap getADSEFSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviciosenlinea.asume.gobierno.pr/WebServiceADSEF/", "ADSEFSoap"), ADSEFSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADSEF_EXCEPTION!= null) {
            throw ADSEF_EXCEPTION;
        }
        return ADSEF_WSDL_LOCATION;
    }

}

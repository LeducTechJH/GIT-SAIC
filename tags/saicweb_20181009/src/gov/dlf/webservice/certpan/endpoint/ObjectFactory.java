
package gov.dlf.webservice.certpan.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.dlf.webservice.certpan.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckIfExists_QNAME = new QName("http://endpoint.certpan.webservice.dlf.gov/", "CheckIfExists");
    private final static QName _CheckIfExistsResponse_QNAME = new QName("http://endpoint.certpan.webservice.dlf.gov/", "CheckIfExistsResponse");
    private final static QName _GetCertificacion_QNAME = new QName("http://endpoint.certpan.webservice.dlf.gov/", "GetCertificacion");
    private final static QName _GetCertificacionResponse_QNAME = new QName("http://endpoint.certpan.webservice.dlf.gov/", "GetCertificacionResponse");
    private final static QName _GetPDFCert_QNAME = new QName("http://endpoint.certpan.webservice.dlf.gov/", "GetPDFCert");
    private final static QName _GetPDFCertResponse_QNAME = new QName("http://endpoint.certpan.webservice.dlf.gov/", "GetPDFCertResponse");
    private final static QName _GetValidation_QNAME = new QName("http://endpoint.certpan.webservice.dlf.gov/", "GetValidation");
    private final static QName _GetValidationResponse_QNAME = new QName("http://endpoint.certpan.webservice.dlf.gov/", "GetValidationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.dlf.webservice.certpan.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckIfExists }
     * 
     */
    public CheckIfExists createCheckIfExists() {
        return new CheckIfExists();
    }

    /**
     * Create an instance of {@link CheckIfExistsResponse }
     * 
     */
    public CheckIfExistsResponse createCheckIfExistsResponse() {
        return new CheckIfExistsResponse();
    }

    /**
     * Create an instance of {@link GetCertificacion }
     * 
     */
    public GetCertificacion createGetCertificacion() {
        return new GetCertificacion();
    }

    /**
     * Create an instance of {@link GetCertificacionResponse }
     * 
     */
    public GetCertificacionResponse createGetCertificacionResponse() {
        return new GetCertificacionResponse();
    }

    /**
     * Create an instance of {@link GetPDFCert }
     * 
     */
    public GetPDFCert createGetPDFCert() {
        return new GetPDFCert();
    }

    /**
     * Create an instance of {@link GetPDFCertResponse }
     * 
     */
    public GetPDFCertResponse createGetPDFCertResponse() {
        return new GetPDFCertResponse();
    }

    /**
     * Create an instance of {@link GetValidation }
     * 
     */
    public GetValidation createGetValidation() {
        return new GetValidation();
    }

    /**
     * Create an instance of {@link GetValidationResponse }
     * 
     */
    public GetValidationResponse createGetValidationResponse() {
        return new GetValidationResponse();
    }

    /**
     * Create an instance of {@link Certificacion }
     * 
     */
    public Certificacion createCertificacion() {
        return new Certificacion();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link MiembroFamilia }
     * 
     */
    public MiembroFamilia createMiembroFamilia() {
        return new MiembroFamilia();
    }

    /**
     * Create an instance of {@link CheckIfExistResult }
     * 
     */
    public CheckIfExistResult createCheckIfExistResult() {
        return new CheckIfExistResult();
    }

    /**
     * Create an instance of {@link Validacion }
     * 
     */
    public Validacion createValidacion() {
        return new Validacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.certpan.webservice.dlf.gov/", name = "CheckIfExists")
    public JAXBElement<CheckIfExists> createCheckIfExists(CheckIfExists value) {
        return new JAXBElement<CheckIfExists>(_CheckIfExists_QNAME, CheckIfExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.certpan.webservice.dlf.gov/", name = "CheckIfExistsResponse")
    public JAXBElement<CheckIfExistsResponse> createCheckIfExistsResponse(CheckIfExistsResponse value) {
        return new JAXBElement<CheckIfExistsResponse>(_CheckIfExistsResponse_QNAME, CheckIfExistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.certpan.webservice.dlf.gov/", name = "GetCertificacion")
    public JAXBElement<GetCertificacion> createGetCertificacion(GetCertificacion value) {
        return new JAXBElement<GetCertificacion>(_GetCertificacion_QNAME, GetCertificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.certpan.webservice.dlf.gov/", name = "GetCertificacionResponse")
    public JAXBElement<GetCertificacionResponse> createGetCertificacionResponse(GetCertificacionResponse value) {
        return new JAXBElement<GetCertificacionResponse>(_GetCertificacionResponse_QNAME, GetCertificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPDFCert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.certpan.webservice.dlf.gov/", name = "GetPDFCert")
    public JAXBElement<GetPDFCert> createGetPDFCert(GetPDFCert value) {
        return new JAXBElement<GetPDFCert>(_GetPDFCert_QNAME, GetPDFCert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPDFCertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.certpan.webservice.dlf.gov/", name = "GetPDFCertResponse")
    public JAXBElement<GetPDFCertResponse> createGetPDFCertResponse(GetPDFCertResponse value) {
        return new JAXBElement<GetPDFCertResponse>(_GetPDFCertResponse_QNAME, GetPDFCertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.certpan.webservice.dlf.gov/", name = "GetValidation")
    public JAXBElement<GetValidation> createGetValidation(GetValidation value) {
        return new JAXBElement<GetValidation>(_GetValidation_QNAME, GetValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.certpan.webservice.dlf.gov/", name = "GetValidationResponse")
    public JAXBElement<GetValidationResponse> createGetValidationResponse(GetValidationResponse value) {
        return new JAXBElement<GetValidationResponse>(_GetValidationResponse_QNAME, GetValidationResponse.class, null, value);
    }

}

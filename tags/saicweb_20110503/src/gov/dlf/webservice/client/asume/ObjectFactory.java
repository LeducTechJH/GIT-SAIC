
package gov.dlf.webservice.client.asume;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the pr.gobierno.asume.serviciosenlinea.webserviceadsef package.
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pr.gobierno.asume.serviciosenlinea.webserviceadsef
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Adsefresponse.PagosEfectuados }
     *
     */
    public Adsefresponse.PagosEfectuados createAdsefresponsePagosEfectuados() {
        return new Adsefresponse.PagosEfectuados();
    }

    /**
     * Create an instance of {@link Adsefrequest }
     *
     */
    public Adsefrequest createAdsefrequest() {
        return new Adsefrequest();
    }

    /**
     * Create an instance of {@link Adsefresponse }
     *
     */
    public Adsefresponse createAdsefresponse() {
        return new Adsefresponse();
    }

    /**
     * Create an instance of {@link VerificarCasoResponse }
     *
     */
    public VerificarCasoResponse createVerificarCasoResponse() {
        return new VerificarCasoResponse();
    }

    /**
     * Create an instance of {@link VerificarCaso }
     *
     */
    public VerificarCaso createVerificarCaso() {
        return new VerificarCaso();
    }

}

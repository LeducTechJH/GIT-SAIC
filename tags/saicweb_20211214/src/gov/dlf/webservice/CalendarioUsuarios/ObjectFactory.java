
package gov.dlf.webservice.CalendarioUsuarios;

import javax.xml.bind.annotation.XmlRegistry;
import gov.dlf.webservice.CalendarioUsuarios.Version;
import gov.dlf.webservice.CalendarioUsuarios.VersionResponse;;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VersionResponse }
     * 
     */
    public VersionResponse createVersionResponse() {
        return new VersionResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link CrearTokenXUsuario }
     * 
     */
    public CrearTokenXUsuario createCrearTokenXUsuario() {
        return new CrearTokenXUsuario();
    }

    /**
     * Create an instance of {@link CrearTokenXUsuarioResponse }
     * 
     */
    public CrearTokenXUsuarioResponse createCrearTokenXUsuarioResponse() {
        return new CrearTokenXUsuarioResponse();
    }

}

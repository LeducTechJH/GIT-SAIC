
package gov.dlf.webservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pr.familia.acsi package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pr.familia.acsi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebServiceVersion }
     * 
     */
    public WebServiceVersion createWebServiceVersion() {
        return new WebServiceVersion();
    }

    /**
     * Create an instance of {@link ValidateTokenUserResponse }
     * 
     */
    public ValidateTokenUserResponse createValidateTokenUserResponse() {
        return new ValidateTokenUserResponse();
    }

    /**
     * Create an instance of {@link WebServiceVersionResponse }
     * 
     */
    public WebServiceVersionResponse createWebServiceVersionResponse() {
        return new WebServiceVersionResponse();
    }

    /**
     * Create an instance of {@link GenerateTokenUser }
     * 
     */
    public GenerateTokenUser createGenerateTokenUser() {
        return new GenerateTokenUser();
    }

    /**
     * Create an instance of {@link ValidateTokenUser }
     * 
     */
    public ValidateTokenUser createValidateTokenUser() {
        return new ValidateTokenUser();
    }

    /**
     * Create an instance of {@link GenerateTokenUserResponse }
     * 
     */
    public GenerateTokenUserResponse createGenerateTokenUserResponse() {
        return new GenerateTokenUserResponse();
    }

}

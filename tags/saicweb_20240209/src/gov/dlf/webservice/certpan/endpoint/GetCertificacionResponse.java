
package gov.dlf.webservice.certpan.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCertificacionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCertificacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Certificacion" type="{http://endpoint.certpan.webservice.dlf.gov/}Certificacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCertificacionResponse", propOrder = {
    "certificacion"
})
public class GetCertificacionResponse {

    @XmlElement(name = "Certificacion")
    protected Certificacion certificacion;

    /**
     * Gets the value of the certificacion property.
     * 
     * @return
     *     possible object is
     *     {@link Certificacion }
     *     
     */
    public Certificacion getCertificacion() {
        return certificacion;
    }

    /**
     * Sets the value of the certificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificacion }
     *     
     */
    public void setCertificacion(Certificacion value) {
        this.certificacion = value;
    }

}

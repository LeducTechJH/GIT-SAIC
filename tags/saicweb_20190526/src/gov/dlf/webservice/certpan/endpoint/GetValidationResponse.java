
package gov.dlf.webservice.certpan.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetValidationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Validacion" type="{http://endpoint.certpan.webservice.dlf.gov/}Validacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetValidationResponse", propOrder = {
    "validacion"
})
public class GetValidationResponse {

    @XmlElement(name = "Validacion")
    protected Validacion validacion;

    /**
     * Gets the value of the validacion property.
     * 
     * @return
     *     possible object is
     *     {@link Validacion }
     *     
     */
    public Validacion getValidacion() {
        return validacion;
    }

    /**
     * Sets the value of the validacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validacion }
     *     
     */
    public void setValidacion(Validacion value) {
        this.validacion = value;
    }

}

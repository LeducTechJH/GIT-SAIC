
package gov.dlf.webservice.certpan.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetValidation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetValidation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Last4SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetValidation", propOrder = {
    "last4SSN",
    "id"
})
public class GetValidation {

    @XmlElement(name = "Last4SSN")
    protected String last4SSN;
    @XmlElement(name = "Id")
    protected long id;

    /**
     * Gets the value of the last4SSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast4SSN() {
        return last4SSN;
    }

    /**
     * Sets the value of the last4SSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast4SSN(String value) {
        this.last4SSN = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

}

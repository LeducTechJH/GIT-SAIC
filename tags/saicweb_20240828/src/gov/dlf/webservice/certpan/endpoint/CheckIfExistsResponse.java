
package gov.dlf.webservice.certpan.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckIfExistsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckIfExistsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExistsResult" type="{http://endpoint.certpan.webservice.dlf.gov/}CheckIfExistResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckIfExistsResponse", propOrder = {
    "existsResult"
})
public class CheckIfExistsResponse {

    @XmlElement(name = "ExistsResult")
    protected CheckIfExistResult existsResult;

    /**
     * Gets the value of the existsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckIfExistResult }
     *     
     */
    public CheckIfExistResult getExistsResult() {
        return existsResult;
    }

    /**
     * Sets the value of the existsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckIfExistResult }
     *     
     */
    public void setExistsResult(CheckIfExistResult value) {
        this.existsResult = value;
    }

}


package gov.dlf.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strUser",
    "strToken"
})
@XmlRootElement(name = "ValidateTokenUser")
public class ValidateTokenUser {

    protected String strUser;
    protected String strToken;

    /**
     * Gets the value of the strUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUser() {
        return strUser;
    }

    /**
     * Sets the value of the strUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUser(String value) {
        this.strUser = value;
    }

    /**
     * Gets the value of the strToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrToken() {
        return strToken;
    }

    /**
     * Sets the value of the strToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrToken(String value) {
        this.strToken = value;
    }

}

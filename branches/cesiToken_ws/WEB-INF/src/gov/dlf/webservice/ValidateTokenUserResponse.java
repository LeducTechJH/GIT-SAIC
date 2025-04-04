
package gov.dlf.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ValidateTokenUserResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "validateTokenUserResult"
})
@XmlRootElement(name = "ValidateTokenUserResponse")
public class ValidateTokenUserResponse {

    @XmlElement(name = "ValidateTokenUserResult")
    protected boolean validateTokenUserResult;

    /**
     * Gets the value of the validateTokenUserResult property.
     * 
     */
    public boolean isValidateTokenUserResult() {
        return validateTokenUserResult;
    }

    /**
     * Sets the value of the validateTokenUserResult property.
     * 
     */
    public void setValidateTokenUserResult(boolean value) {
        this.validateTokenUserResult = value;
    }

}

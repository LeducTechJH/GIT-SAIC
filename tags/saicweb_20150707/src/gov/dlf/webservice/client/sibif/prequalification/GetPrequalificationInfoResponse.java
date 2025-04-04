
package gov.dlf.webservice.client.sibif.prequalification;

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
 *         &lt;element name="GetPrequalificationInfoResult" type="{http://adsef.pr.gov/}PreQualificationInfo" minOccurs="0"/>
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
    "getPrequalificationInfoResult"
})
@XmlRootElement(name = "GetPrequalificationInfoResponse")
public class GetPrequalificationInfoResponse {

    @XmlElement(name = "GetPrequalificationInfoResult")
    protected PreQualificationInfo getPrequalificationInfoResult;

    /**
     * Gets the value of the getPrequalificationInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link PreQualificationInfo }
     *     
     */
    public PreQualificationInfo getGetPrequalificationInfoResult() {
        return getPrequalificationInfoResult;
    }

    /**
     * Sets the value of the getPrequalificationInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreQualificationInfo }
     *     
     */
    public void setGetPrequalificationInfoResult(PreQualificationInfo value) {
        this.getPrequalificationInfoResult = value;
    }

}

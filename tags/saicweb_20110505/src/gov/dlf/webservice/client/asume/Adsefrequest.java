
package gov.dlf.webservice.client.asume;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adsefrequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Adsefrequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segurosocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adsefrequest", propOrder = {
    "segurosocial"
})
public class Adsefrequest {

    protected String segurosocial;

    /**
     * Gets the value of the segurosocial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSegurosocial() {
        return segurosocial;
    }

    /**
     * Sets the value of the segurosocial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSegurosocial(String value) {
        this.segurosocial = value;
    }

}

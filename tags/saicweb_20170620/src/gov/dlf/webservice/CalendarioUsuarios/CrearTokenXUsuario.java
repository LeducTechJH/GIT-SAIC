
package gov.dlf.webservice.CalendarioUsuarios;

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
 *         &lt;element name="strUsuarioID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strUsuarioID"
})
@XmlRootElement(name = "CrearTokenXUsuario")
public class CrearTokenXUsuario {

    protected String strUsuarioID;

    /**
     * Gets the value of the strUsuarioID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUsuarioID() {
        return strUsuarioID;
    }

    /**
     * Sets the value of the strUsuarioID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUsuarioID(String value) {
        this.strUsuarioID = value;
    }

}

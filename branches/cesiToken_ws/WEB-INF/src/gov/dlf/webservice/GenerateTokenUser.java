
package gov.dlf.webservice;

import java.math.BigDecimal;
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
 *         &lt;element name="strNombreAplicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodigoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intUsuarioID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="intAplicacionID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "strNombreAplicacion",
    "strCodigoUsuario",
    "intUsuarioID",
    "intAplicacionID"
})
@XmlRootElement(name = "GenerateTokenUser")
public class GenerateTokenUser {

    protected String strNombreAplicacion;
    protected String strCodigoUsuario;
    @XmlElement(required = true)
    protected BigDecimal intUsuarioID;
    @XmlElement(required = true)
    protected BigDecimal intAplicacionID;

    /**
     * Gets the value of the strNombreAplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNombreAplicacion() {
        return strNombreAplicacion;
    }

    /**
     * Sets the value of the strNombreAplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNombreAplicacion(String value) {
        this.strNombreAplicacion = value;
    }

    /**
     * Gets the value of the strCodigoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigoUsuario() {
        return strCodigoUsuario;
    }

    /**
     * Sets the value of the strCodigoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigoUsuario(String value) {
        this.strCodigoUsuario = value;
    }

    /**
     * Gets the value of the intUsuarioID property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntUsuarioID() {
        return intUsuarioID;
    }

    /**
     * Sets the value of the intUsuarioID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntUsuarioID(BigDecimal value) {
        this.intUsuarioID = value;
    }

    /**
     * Gets the value of the intAplicacionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntAplicacionID() {
        return intAplicacionID;
    }

    /**
     * Sets the value of the intAplicacionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntAplicacionID(BigDecimal value) {
        this.intAplicacionID = value;
    }

}

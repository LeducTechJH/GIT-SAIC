
package gov.pr.adsef;

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
 *         &lt;element name="strTecnicoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodigoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strFechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strFechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strTecnicoID",
    "strCodigoTransaccion",
    "strFechaDesde",
    "strFechaHasta"
})
@XmlRootElement(name = "BuscarPeriodos")
public class BuscarPeriodos {

    protected String strTecnicoID;
    protected String strCodigoTransaccion;
    protected String strFechaDesde;
    protected String strFechaHasta;

    /**
     * Gets the value of the strTecnicoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTecnicoID() {
        return strTecnicoID;
    }

    /**
     * Sets the value of the strTecnicoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTecnicoID(String value) {
        this.strTecnicoID = value;
    }

    /**
     * Gets the value of the strCodigoTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigoTransaccion() {
        return strCodigoTransaccion;
    }

    /**
     * Sets the value of the strCodigoTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigoTransaccion(String value) {
        this.strCodigoTransaccion = value;
    }

    /**
     * Gets the value of the strFechaDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFechaDesde() {
        return strFechaDesde;
    }

    /**
     * Sets the value of the strFechaDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFechaDesde(String value) {
        this.strFechaDesde = value;
    }

    /**
     * Gets the value of the strFechaHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFechaHasta() {
        return strFechaHasta;
    }

    /**
     * Sets the value of the strFechaHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFechaHasta(String value) {
        this.strFechaHasta = value;
    }

}

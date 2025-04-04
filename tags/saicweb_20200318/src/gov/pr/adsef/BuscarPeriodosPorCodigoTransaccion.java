
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
 *         &lt;element name="strCodigoEtapa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strCodigoEtapa",
    "strCodigoTransaccion",
    "strFechaDesde",
    "strFechaHasta"
})
@XmlRootElement(name = "BuscarPeriodosPorCodigoTransaccion")
public class BuscarPeriodosPorCodigoTransaccion {

    protected String strCodigoEtapa;
    protected String strCodigoTransaccion;
    protected String strFechaDesde;
    protected String strFechaHasta;

    /**
     * Gets the value of the strCodigoEtapa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigoEtapa() {
        return strCodigoEtapa;
    }

    /**
     * Sets the value of the strCodigoEtapa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigoEtapa(String value) {
        this.strCodigoEtapa = value;
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

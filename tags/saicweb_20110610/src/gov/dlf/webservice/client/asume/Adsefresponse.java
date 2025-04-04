
package gov.dlf.webservice.client.asume;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Adsefresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adsefresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PagosEfectuados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace='urn:schemas-microsoft-com:xml-diffgram-v1'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adsefresponse", propOrder = {
    "estatus",
    "pagosEfectuados"
})
public class Adsefresponse {

    @XmlElement(name = "Estatus")
    protected int estatus;
    @XmlElement(name = "PagosEfectuados")
    protected Adsefresponse.PagosEfectuados pagosEfectuados;

    /**
     * Gets the value of the estatus property.
     * 
     */
    public int getEstatus() {
        return estatus;
    }

    /**
     * Sets the value of the estatus property.
     * 
     */
    public void setEstatus(int value) {
        this.estatus = value;
    }

    /**
     * Gets the value of the pagosEfectuados property.
     * 
     * @return
     *     possible object is
     *     {@link Adsefresponse.PagosEfectuados }
     *     
     */
    public Adsefresponse.PagosEfectuados getPagosEfectuados() {
        return pagosEfectuados;
    }

    /**
     * Sets the value of the pagosEfectuados property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adsefresponse.PagosEfectuados }
     *     
     */
    public void setPagosEfectuados(Adsefresponse.PagosEfectuados value) {
        this.pagosEfectuados = value;
    }


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
     *         &lt;any processContents='lax' namespace='urn:schemas-microsoft-com:xml-diffgram-v1'/>
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
        "any"
    })
    public static class PagosEfectuados {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}

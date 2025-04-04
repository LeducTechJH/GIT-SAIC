
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
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ViolenceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Commentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pagosEfectuados",
    "violenceIndicator",
    "commentarios",
    "usuario",
    "mensaje"
})
public class Adsefresponse {

    @XmlElement(name = "Estatus")
    protected int estatus;
    @XmlElement(name = "PagosEfectuados")
    protected Adsefresponse.PagosEfectuados pagosEfectuados;
    @XmlElement(name = "ViolenceIndicator")
    protected boolean violenceIndicator;
    @XmlElement(name = "Commentarios")
    protected String commentarios;
    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Mensaje")
    protected String mensaje;

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
     * Gets the value of the violenceIndicator property.
     * 
     */
    public boolean isViolenceIndicator() {
        return violenceIndicator;
    }

    /**
     * Sets the value of the violenceIndicator property.
     * 
     */
    public void setViolenceIndicator(boolean value) {
        this.violenceIndicator = value;
    }

    /**
     * Gets the value of the commentarios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentarios() {
        return commentarios;
    }

    /**
     * Sets the value of the commentarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentarios(String value) {
        this.commentarios = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
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
     *         &lt;any/>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public Object getAny() {
            if (any == null) {
                any = new Object();
            }
            return this.any;
        }

    }

}

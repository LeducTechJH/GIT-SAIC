
package gov.pr.adsef;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodosCitas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodosCitas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaComienzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaFinalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraComienzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraFinalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoEtapa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EtapaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActividadDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duracion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UsuarioID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CodigoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodosCitas", propOrder = {
    "fechaComienzo",
    "fechaFinalizacion",
    "horaComienzo",
    "horaFinalizacion",
    "codigoEtapa",
    "etapaDescripcion",
    "codigoActividad",
    "actividadDescripcion",
    "codigoOficina",
    "duracion",
    "usuarioID"
})
public class PeriodosCitas {

    @XmlElement(name = "FechaComienzo")
    protected String fechaComienzo;
    @XmlElement(name = "FechaFinalizacion")
    protected String fechaFinalizacion;
    @XmlElement(name = "HoraComienzo")
    protected String horaComienzo;
    @XmlElement(name = "HoraFinalizacion")
    protected String horaFinalizacion;
    @XmlElement(name = "CodigoEtapa")
    protected String codigoEtapa;
    @XmlElement(name = "EtapaDescripcion")
    protected String etapaDescripcion;
    @XmlElement(name = "CodigoActividad")
    protected String codigoActividad;
    @XmlElement(name = "ActividadDescripcion")
    protected String actividadDescripcion;
    @XmlElement(name = "CodigoOficina")
    protected String codigoOficina;
    @XmlElement(name = "Duracion", required = true)
    protected BigDecimal duracion;
    @XmlElement(name = "UsuarioID")
    protected String usuarioID;
    @XmlAttribute(name = "CodigoTransaccion")
    protected String codigoTransaccion;

    /**
     * Gets the value of the fechaComienzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaComienzo() {
        return fechaComienzo;
    }

    /**
     * Sets the value of the fechaComienzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaComienzo(String value) {
        this.fechaComienzo = value;
    }

    /**
     * Gets the value of the fechaFinalizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    /**
     * Sets the value of the fechaFinalizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinalizacion(String value) {
        this.fechaFinalizacion = value;
    }

    /**
     * Gets the value of the horaComienzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraComienzo() {
        return horaComienzo;
    }

    /**
     * Sets the value of the horaComienzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraComienzo(String value) {
        this.horaComienzo = value;
    }

    /**
     * Gets the value of the horaFinalizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFinalizacion() {
        return horaFinalizacion;
    }

    /**
     * Sets the value of the horaFinalizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFinalizacion(String value) {
        this.horaFinalizacion = value;
    }

    /**
     * Gets the value of the codigoEtapa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEtapa() {
        return codigoEtapa;
    }

    /**
     * Sets the value of the codigoEtapa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEtapa(String value) {
        this.codigoEtapa = value;
    }

    /**
     * Gets the value of the etapaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtapaDescripcion() {
        return etapaDescripcion;
    }

    /**
     * Sets the value of the etapaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtapaDescripcion(String value) {
        this.etapaDescripcion = value;
    }

    /**
     * Gets the value of the codigoActividad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoActividad() {
        return codigoActividad;
    }

    /**
     * Sets the value of the codigoActividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoActividad(String value) {
        this.codigoActividad = value;
    }

    /**
     * Gets the value of the actividadDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadDescripcion() {
        return actividadDescripcion;
    }

    /**
     * Sets the value of the actividadDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadDescripcion(String value) {
        this.actividadDescripcion = value;
    }

    /**
     * Gets the value of the codigoOficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOficina() {
        return codigoOficina;
    }

    /**
     * Sets the value of the codigoOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOficina(String value) {
        this.codigoOficina = value;
    }

    /**
     * Gets the value of the duracion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDuracion() {
        return duracion;
    }

    /**
     * Sets the value of the duracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDuracion(BigDecimal value) {
        this.duracion = value;
    }

    /**
     * Gets the value of the usuarioID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioID() {
        return usuarioID;
    }

    /**
     * Sets the value of the usuarioID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioID(String value) {
        this.usuarioID = value;
    }

    /**
     * Gets the value of the codigoTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    /**
     * Sets the value of the codigoTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTransaccion(String value) {
        this.codigoTransaccion = value;
    }

}

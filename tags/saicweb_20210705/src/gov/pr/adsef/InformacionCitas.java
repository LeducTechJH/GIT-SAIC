
package gov.pr.adsef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformacionCitas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformacionCitas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CitasPeriodos" type="{http://adsef.pr.gov/}ArrayOfPeriodosCitas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionCitas", propOrder = {
    "citasPeriodos"
})
public class InformacionCitas {

    @XmlElement(name = "CitasPeriodos")
    protected ArrayOfPeriodosCitas citasPeriodos;

    /**
     * Gets the value of the citasPeriodos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeriodosCitas }
     *     
     */
    public ArrayOfPeriodosCitas getCitasPeriodos() {
        return citasPeriodos;
    }

    /**
     * Sets the value of the citasPeriodos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeriodosCitas }
     *     
     */
    public void setCitasPeriodos(ArrayOfPeriodosCitas value) {
        this.citasPeriodos = value;
    }

}

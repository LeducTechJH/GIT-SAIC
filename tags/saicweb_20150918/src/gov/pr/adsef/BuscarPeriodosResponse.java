
package gov.pr.adsef;

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
 *         &lt;element name="BuscarPeriodosResult" type="{http://adsef.pr.gov/}InformacionCitas" minOccurs="0"/>
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
    "buscarPeriodosResult"
})
@XmlRootElement(name = "BuscarPeriodosResponse")
public class BuscarPeriodosResponse {

    @XmlElement(name = "BuscarPeriodosResult")
    protected InformacionCitas buscarPeriodosResult;

    /**
     * Gets the value of the buscarPeriodosResult property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionCitas }
     *     
     */
    public InformacionCitas getBuscarPeriodosResult() {
        return buscarPeriodosResult;
    }

    /**
     * Sets the value of the buscarPeriodosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionCitas }
     *     
     */
    public void setBuscarPeriodosResult(InformacionCitas value) {
        this.buscarPeriodosResult = value;
    }

}

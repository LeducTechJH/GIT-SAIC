
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
 *         &lt;element name="BuscarPeriodosPorCodigoTransaccionResult" type="{http://adsef.pr.gov/}InformacionCitas" minOccurs="0"/>
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
    "buscarPeriodosPorCodigoTransaccionResult"
})
@XmlRootElement(name = "BuscarPeriodosPorCodigoTransaccionResponse")
public class BuscarPeriodosPorCodigoTransaccionResponse {

    @XmlElement(name = "BuscarPeriodosPorCodigoTransaccionResult")
    protected InformacionCitas buscarPeriodosPorCodigoTransaccionResult;

    /**
     * Gets the value of the buscarPeriodosPorCodigoTransaccionResult property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionCitas }
     *     
     */
    public InformacionCitas getBuscarPeriodosPorCodigoTransaccionResult() {
        return buscarPeriodosPorCodigoTransaccionResult;
    }

    /**
     * Sets the value of the buscarPeriodosPorCodigoTransaccionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionCitas }
     *     
     */
    public void setBuscarPeriodosPorCodigoTransaccionResult(InformacionCitas value) {
        this.buscarPeriodosPorCodigoTransaccionResult = value;
    }

}

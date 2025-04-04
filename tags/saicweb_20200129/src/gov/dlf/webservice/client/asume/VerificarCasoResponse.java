
package gov.dlf.webservice.client.asume;

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
 *         &lt;element name="verificar_casoResult" type="{https://serviciosenlinea.asume.pr.gov/WebServiceADSEF/}Adsefresponse" minOccurs="0"/>
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
    "verificarCasoResult"
})
@XmlRootElement(name = "verificar_casoResponse")
public class VerificarCasoResponse {

    @XmlElement(name = "verificar_casoResult")
    protected Adsefresponse verificarCasoResult;

    /**
     * Gets the value of the verificarCasoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Adsefresponse }
     *     
     */
    public Adsefresponse getVerificarCasoResult() {
        return verificarCasoResult;
    }

    /**
     * Sets the value of the verificarCasoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adsefresponse }
     *     
     */
    public void setVerificarCasoResult(Adsefresponse value) {
        this.verificarCasoResult = value;
    }

}


package gov.dlf.webservice.certpan.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPDFCertResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPDFCertResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PDFCert" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPDFCertResponse", propOrder = {
    "pdfCert"
})
public class GetPDFCertResponse {

    @XmlElement(name = "PDFCert")
    protected byte[] pdfCert;

    /**
     * Gets the value of the pdfCert property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPDFCert() {
        return pdfCert;
    }

    /**
     * Sets the value of the pdfCert property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPDFCert(byte[] value) {
        this.pdfCert = value;
    }

}

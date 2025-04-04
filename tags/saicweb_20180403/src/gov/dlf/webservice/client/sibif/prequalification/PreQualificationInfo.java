
package gov.dlf.webservice.client.sibif.prequalification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreQualificationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreQualificationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{http://adsef.pr.gov/}Response" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://adsef.pr.gov/}Person" minOccurs="0"/>
 *         &lt;element name="Dependents" type="{http://adsef.pr.gov/}ArrayOfPerson" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="control" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rmo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreQualificationInfo", propOrder = {
    "response",
    "customer",
    "dependents"
})
public class PreQualificationInfo {

    @XmlElement(name = "Response")
    protected Response response;
    @XmlElement(name = "Customer")
    protected Person customer;
    @XmlElement(name = "Dependents")
    protected ArrayOfPerson dependents;
    @XmlAttribute(name = "control")
    protected String control;
    @XmlAttribute(name = "rmo", required = true)
    protected int rmo;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setCustomer(Person value) {
        this.customer = value;
    }

    /**
     * Gets the value of the dependents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerson }
     *     
     */
    public ArrayOfPerson getDependents() {
        return dependents;
    }

    /**
     * Sets the value of the dependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerson }
     *     
     */
    public void setDependents(ArrayOfPerson value) {
        this.dependents = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControl(String value) {
        this.control = value;
    }

    /**
     * Gets the value of the rmo property.
     * 
     */
    public int getRmo() {
        return rmo;
    }

    /**
     * Sets the value of the rmo property.
     * 
     */
    public void setRmo(int value) {
        this.rmo = value;
    }

}

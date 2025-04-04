
package gov.pr.adsef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Disability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Disability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertifyingAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicalExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TakingCareExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TakingCareExpensesAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disability", propOrder = {
    "code",
    "certifyingAgencyCode",
    "medicalExpenses",
    "takingCareExpenses",
    "takingCareExpensesAmount"
})
public class Disability {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "CertifyingAgencyCode")
    protected String certifyingAgencyCode;
    @XmlElement(name = "MedicalExpenses")
    protected boolean medicalExpenses;
    @XmlElement(name = "TakingCareExpenses")
    protected boolean takingCareExpenses;
    @XmlElement(name = "TakingCareExpensesAmount")
    protected float takingCareExpensesAmount;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the certifyingAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifyingAgencyCode() {
        return certifyingAgencyCode;
    }

    /**
     * Sets the value of the certifyingAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifyingAgencyCode(String value) {
        this.certifyingAgencyCode = value;
    }

    /**
     * Gets the value of the medicalExpenses property.
     * 
     */
    public boolean isMedicalExpenses() {
        return medicalExpenses;
    }

    /**
     * Sets the value of the medicalExpenses property.
     * 
     */
    public void setMedicalExpenses(boolean value) {
        this.medicalExpenses = value;
    }

    /**
     * Gets the value of the takingCareExpenses property.
     * 
     */
    public boolean isTakingCareExpenses() {
        return takingCareExpenses;
    }

    /**
     * Sets the value of the takingCareExpenses property.
     * 
     */
    public void setTakingCareExpenses(boolean value) {
        this.takingCareExpenses = value;
    }

    /**
     * Gets the value of the takingCareExpensesAmount property.
     * 
     */
    public float getTakingCareExpensesAmount() {
        return takingCareExpensesAmount;
    }

    /**
     * Sets the value of the takingCareExpensesAmount property.
     * 
     */
    public void setTakingCareExpensesAmount(float value) {
        this.takingCareExpensesAmount = value;
    }

}

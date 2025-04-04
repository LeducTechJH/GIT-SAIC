
package gov.dlf.webservice.AEE;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lastPayDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lastBillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastBillDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lastBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lastBillDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="payoffBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nextBillDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="cashOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billRouteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="delinquentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="activeCollProcFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activeSevProcFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiplePremise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allServInActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activePa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CMWSSPaymentHistory" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="numOfMonths" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="payList" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="payEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="payId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="payStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="payAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="faultStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="wsdl" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="premList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="saId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="saStatusFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="premiseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="premiseInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountId",
    "ssn",
    "primaryName",
    "primaryPhone",
    "secondaryPhone",
    "lastPayAmount",
    "lastPayDate",
    "lastBillId",
    "lastBillDate",
    "lastBillAmount",
    "lastBillDueDate",
    "currentBalance",
    "payoffBalance",
    "nextBillDate",
    "cashOnlyFlag",
    "languageCode",
    "billRouteType",
    "delinquentAmount",
    "activeCollProcFlag",
    "activeSevProcFlag",
    "multiplePremise",
    "allServInActive",
    "activePa",
    "cmwssPaymentHistory",
    "premList"
})
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    protected String accountId;
    protected String ssn;
    protected String primaryName;
    protected String primaryPhone;
    protected String secondaryPhone;
    protected BigDecimal lastPayAmount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPayDate;
    protected String lastBillId;
    protected String lastBillDate;
    protected BigDecimal lastBillAmount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastBillDueDate;
    protected BigDecimal currentBalance;
    protected BigDecimal payoffBalance;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextBillDate;
    protected String cashOnlyFlag;
    protected String languageCode;
    protected String billRouteType;
    protected BigDecimal delinquentAmount;
    protected String activeCollProcFlag;
    protected String activeSevProcFlag;
    protected String multiplePremise;
    protected String allServInActive;
    protected String activePa;
    @XmlElement(name = "CMWSSPaymentHistory")
    protected List<ProcessResponse.CMWSSPaymentHistory> cmwssPaymentHistory;
    protected List<ProcessResponse.PremList> premList;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the primaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryName() {
        return primaryName;
    }

    /**
     * Sets the value of the primaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryName(String value) {
        this.primaryName = value;
    }

    /**
     * Gets the value of the primaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Sets the value of the primaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhone(String value) {
        this.primaryPhone = value;
    }

    /**
     * Gets the value of the secondaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    /**
     * Sets the value of the secondaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryPhone(String value) {
        this.secondaryPhone = value;
    }

    /**
     * Gets the value of the lastPayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPayAmount() {
        return lastPayAmount;
    }

    /**
     * Sets the value of the lastPayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPayAmount(BigDecimal value) {
        this.lastPayAmount = value;
    }

    /**
     * Gets the value of the lastPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPayDate() {
        return lastPayDate;
    }

    /**
     * Sets the value of the lastPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPayDate(XMLGregorianCalendar value) {
        this.lastPayDate = value;
    }

    /**
     * Gets the value of the lastBillId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBillId() {
        return lastBillId;
    }

    /**
     * Sets the value of the lastBillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBillId(String value) {
        this.lastBillId = value;
    }

    /**
     * Gets the value of the lastBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getLastBillDate() {
        return lastBillDate;
    }

    /**
     * Sets the value of the lastBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

    /**
     * Gets the value of the lastBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastBillAmount() {
        return lastBillAmount;
    }

    /**
     * Sets the value of the lastBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastBillAmount(BigDecimal value) {
        this.lastBillAmount = value;
    }

    /**
     * Gets the value of the lastBillDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBillDueDate() {
        return lastBillDueDate;
    }

    /**
     * Sets the value of the lastBillDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBillDueDate(XMLGregorianCalendar value) {
        this.lastBillDueDate = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the payoffBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayoffBalance() {
        return payoffBalance;
    }

    /**
     * Sets the value of the payoffBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayoffBalance(BigDecimal value) {
        this.payoffBalance = value;
    }

    /**
     * Gets the value of the nextBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextBillDate() {
        return nextBillDate;
    }

    /**
     * Sets the value of the nextBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextBillDate(XMLGregorianCalendar value) {
        this.nextBillDate = value;
    }

    /**
     * Gets the value of the cashOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashOnlyFlag() {
        return cashOnlyFlag;
    }

    /**
     * Sets the value of the cashOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashOnlyFlag(String value) {
        this.cashOnlyFlag = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the billRouteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRouteType() {
        return billRouteType;
    }

    /**
     * Sets the value of the billRouteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRouteType(String value) {
        this.billRouteType = value;
    }

    /**
     * Gets the value of the delinquentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDelinquentAmount() {
        return delinquentAmount;
    }

    /**
     * Sets the value of the delinquentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDelinquentAmount(BigDecimal value) {
        this.delinquentAmount = value;
    }

    /**
     * Gets the value of the activeCollProcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveCollProcFlag() {
        return activeCollProcFlag;
    }

    /**
     * Sets the value of the activeCollProcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveCollProcFlag(String value) {
        this.activeCollProcFlag = value;
    }

    /**
     * Gets the value of the activeSevProcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveSevProcFlag() {
        return activeSevProcFlag;
    }

    /**
     * Sets the value of the activeSevProcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveSevProcFlag(String value) {
        this.activeSevProcFlag = value;
    }

    /**
     * Gets the value of the multiplePremise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplePremise() {
        return multiplePremise;
    }

    /**
     * Sets the value of the multiplePremise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplePremise(String value) {
        this.multiplePremise = value;
    }

    /**
     * Gets the value of the allServInActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllServInActive() {
        return allServInActive;
    }

    /**
     * Sets the value of the allServInActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllServInActive(String value) {
        this.allServInActive = value;
    }

    /**
     * Gets the value of the activePa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivePa() {
        return activePa;
    }

    /**
     * Sets the value of the activePa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivePa(String value) {
        this.activePa = value;
    }

    /**
     * Gets the value of the cmwssPaymentHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmwssPaymentHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMWSSPaymentHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessResponse.CMWSSPaymentHistory }
     * 
     * 
     */
    public List<ProcessResponse.CMWSSPaymentHistory> getCMWSSPaymentHistory() {
        if (cmwssPaymentHistory == null) {
            cmwssPaymentHistory = new ArrayList<ProcessResponse.CMWSSPaymentHistory>();
        }
        return this.cmwssPaymentHistory;
    }

    /**
     * Gets the value of the premList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessResponse.PremList }
     * 
     * 
     */
    public List<ProcessResponse.PremList> getPremList() {
        if (premList == null) {
            premList = new ArrayList<ProcessResponse.PremList>();
        }
        return this.premList;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="numOfMonths" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="payList" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="payEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="payId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="payStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="payAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="faultStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="wsdl" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountId",
        "numOfMonths",
        "rowCount",
        "payList"
    })
    public static class CMWSSPaymentHistory {

        protected String accountId;
        protected String numOfMonths;
        protected String rowCount;
        protected List<ProcessResponse.CMWSSPaymentHistory.PayList> payList;
        @XmlAttribute(name = "faultStyle", required = true)
        protected String faultStyle;

        /**
         * Gets the value of the accountId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountId() {
            return accountId;
        }

        /**
         * Sets the value of the accountId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountId(String value) {
            this.accountId = value;
        }

        /**
         * Gets the value of the numOfMonths property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumOfMonths() {
            return numOfMonths;
        }

        /**
         * Sets the value of the numOfMonths property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumOfMonths(String value) {
            this.numOfMonths = value;
        }

        /**
         * Gets the value of the rowCount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRowCount() {
            return rowCount;
        }

        /**
         * Sets the value of the rowCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRowCount(String value) {
            this.rowCount = value;
        }

        /**
         * Gets the value of the payList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProcessResponse.CMWSSPaymentHistory.PayList }
         * 
         * 
         */
        public List<ProcessResponse.CMWSSPaymentHistory.PayList> getPayList() {
            if (payList == null) {
                payList = new ArrayList<ProcessResponse.CMWSSPaymentHistory.PayList>();
            }
            return this.payList;
        }

        /**
         * Gets the value of the faultStyle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaultStyle() {
            if (faultStyle == null) {
                return "wsdl";
            } else {
                return faultStyle;
            }
        }

        /**
         * Sets the value of the faultStyle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaultStyle(String value) {
            this.faultStyle = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="payEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="payId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="payStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="payAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "payEventId",
            "payId",
            "payDate",
            "payStatusFlag",
            "payAmount"
        })
        public static class PayList {

            protected String payEventId;
            protected String payId;
            protected String payDate;
            protected String payStatusFlag;
            protected String payAmount;

            /**
             * Gets the value of the payEventId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayEventId() {
                return payEventId;
            }

            /**
             * Sets the value of the payEventId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayEventId(String value) {
                this.payEventId = value;
            }

            /**
             * Gets the value of the payId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayId() {
                return payId;
            }

            /**
             * Sets the value of the payId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayId(String value) {
                this.payId = value;
            }

            /**
             * Gets the value of the payDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayDate() {
                return payDate;
            }

            /**
             * Sets the value of the payDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayDate(String value) {
                this.payDate = value;
            }

            /**
             * Gets the value of the payStatusFlag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayStatusFlag() {
                return payStatusFlag;
            }

            /**
             * Sets the value of the payStatusFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayStatusFlag(String value) {
                this.payStatusFlag = value;
            }

            /**
             * Gets the value of the payAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayAmount() {
                return payAmount;
            }

            /**
             * Sets the value of the payAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayAmount(String value) {
                this.payAmount = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="saId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="saStatusFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="premiseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="premiseInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "saId",
        "saStatusFlg",
        "premiseId",
        "premiseInfo"
    })
    public static class PremList {

        protected String saId;
        protected String saStatusFlg;
        protected String premiseId;
        protected String premiseInfo;

        /**
         * Gets the value of the saId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSaId() {
            return saId;
        }

        /**
         * Sets the value of the saId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSaId(String value) {
            this.saId = value;
        }

        /**
         * Gets the value of the saStatusFlg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSaStatusFlg() {
            return saStatusFlg;
        }

        /**
         * Sets the value of the saStatusFlg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSaStatusFlg(String value) {
            this.saStatusFlg = value;
        }

        /**
         * Gets the value of the premiseId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPremiseId() {
            return premiseId;
        }

        /**
         * Sets the value of the premiseId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPremiseId(String value) {
            this.premiseId = value;
        }

        /**
         * Gets the value of the premiseInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPremiseInfo() {
            return premiseInfo;
        }

        /**
         * Sets the value of the premiseInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPremiseInfo(String value) {
            this.premiseInfo = value;
        }

    }

}

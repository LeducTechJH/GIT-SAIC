
package gov.dlf.webservice.client.sibif.prequalification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Initial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaternalLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaternalLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidentialAddress" type="{http://adsef.pr.gov/}Address" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://adsef.pr.gov/}Address" minOccurs="0"/>
 *         &lt;element name="MainPersonSSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipToMain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Citizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scholarity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CivilStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FulltimeStudent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Pregnant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VocationalRehabilitation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Veteran" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Emancipated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MinorDetails" type="{http://adsef.pr.gov/}Minor" minOccurs="0"/>
 *         &lt;element name="Disability" type="{http://adsef.pr.gov/}Disability" minOccurs="0"/>
 *         &lt;element name="Incomes" type="{http://adsef.pr.gov/}ArrayOfIncome" minOccurs="0"/>
 *         &lt;element name="Resources" type="{http://adsef.pr.gov/}ArrayOfResource" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SSID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "name",
    "initial",
    "paternalLastName",
    "maternalLastName",
    "nickname",
    "birthDate",
    "gender",
    "phoneHome",
    "phoneWork",
    "residentialAddress",
    "mailingAddress",
    "mainPersonSSID",
    "relationshipToMain",
    "citizenship",
    "scholarity",
    "civilStatus",
    "fulltimeStudent",
    "pregnant",
    "vocationalRehabilitation",
    "veteran",
    "emancipated",
    "minor",
    "minorDetails",
    "disability",
    "incomes",
    "resources"
})
public class Person {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Initial")
    protected String initial;
    @XmlElement(name = "PaternalLastName")
    protected String paternalLastName;
    @XmlElement(name = "MaternalLastName")
    protected String maternalLastName;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "BirthDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "PhoneHome")
    protected String phoneHome;
    @XmlElement(name = "PhoneWork")
    protected String phoneWork;
    @XmlElement(name = "ResidentialAddress")
    protected Address residentialAddress;
    @XmlElement(name = "MailingAddress")
    protected Address mailingAddress;
    @XmlElement(name = "MainPersonSSID")
    protected String mainPersonSSID;
    @XmlElement(name = "RelationshipToMain")
    protected String relationshipToMain;
    @XmlElement(name = "Citizenship")
    protected String citizenship;
    @XmlElement(name = "Scholarity")
    protected String scholarity;
    @XmlElement(name = "CivilStatus")
    protected String civilStatus;
    @XmlElement(name = "FulltimeStudent")
    protected boolean fulltimeStudent;
    @XmlElement(name = "Pregnant")
    protected boolean pregnant;
    @XmlElement(name = "VocationalRehabilitation")
    protected boolean vocationalRehabilitation;
    @XmlElement(name = "Veteran")
    protected boolean veteran;
    @XmlElement(name = "Emancipated")
    protected boolean emancipated;
    @XmlElement(name = "Minor")
    protected boolean minor;
    @XmlElement(name = "MinorDetails")
    protected Minor minorDetails;
    @XmlElement(name = "Disability")
    protected Disability disability;
    @XmlElement(name = "Incomes")
    protected ArrayOfIncome incomes;
    @XmlElement(name = "Resources")
    protected ArrayOfResource resources;
    @XmlAttribute(name = "SSID")
    protected String ssid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the initial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitial(String value) {
        this.initial = value;
    }

    /**
     * Gets the value of the paternalLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaternalLastName() {
        return paternalLastName;
    }

    /**
     * Sets the value of the paternalLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaternalLastName(String value) {
        this.paternalLastName = value;
    }

    /**
     * Gets the value of the maternalLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaternalLastName() {
        return maternalLastName;
    }

    /**
     * Sets the value of the maternalLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaternalLastName(String value) {
        this.maternalLastName = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the phoneHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneHome() {
        return phoneHome;
    }

    /**
     * Sets the value of the phoneHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneHome(String value) {
        this.phoneHome = value;
    }

    /**
     * Gets the value of the phoneWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneWork() {
        return phoneWork;
    }

    /**
     * Sets the value of the phoneWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneWork(String value) {
        this.phoneWork = value;
    }

    /**
     * Gets the value of the residentialAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getResidentialAddress() {
        return residentialAddress;
    }

    /**
     * Sets the value of the residentialAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setResidentialAddress(Address value) {
        this.residentialAddress = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMailingAddress(Address value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the mainPersonSSID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPersonSSID() {
        return mainPersonSSID;
    }

    /**
     * Sets the value of the mainPersonSSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPersonSSID(String value) {
        this.mainPersonSSID = value;
    }

    /**
     * Gets the value of the relationshipToMain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipToMain() {
        return relationshipToMain;
    }

    /**
     * Sets the value of the relationshipToMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipToMain(String value) {
        this.relationshipToMain = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the scholarity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScholarity() {
        return scholarity;
    }

    /**
     * Sets the value of the scholarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScholarity(String value) {
        this.scholarity = value;
    }

    /**
     * Gets the value of the civilStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * Sets the value of the civilStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilStatus(String value) {
        this.civilStatus = value;
    }

    /**
     * Gets the value of the fulltimeStudent property.
     * 
     */
    public boolean isFulltimeStudent() {
        return fulltimeStudent;
    }

    /**
     * Sets the value of the fulltimeStudent property.
     * 
     */
    public void setFulltimeStudent(boolean value) {
        this.fulltimeStudent = value;
    }

    /**
     * Gets the value of the pregnant property.
     * 
     */
    public boolean isPregnant() {
        return pregnant;
    }

    /**
     * Sets the value of the pregnant property.
     * 
     */
    public void setPregnant(boolean value) {
        this.pregnant = value;
    }

    /**
     * Gets the value of the vocationalRehabilitation property.
     * 
     */
    public boolean isVocationalRehabilitation() {
        return vocationalRehabilitation;
    }

    /**
     * Sets the value of the vocationalRehabilitation property.
     * 
     */
    public void setVocationalRehabilitation(boolean value) {
        this.vocationalRehabilitation = value;
    }

    /**
     * Gets the value of the veteran property.
     * 
     */
    public boolean isVeteran() {
        return veteran;
    }

    /**
     * Sets the value of the veteran property.
     * 
     */
    public void setVeteran(boolean value) {
        this.veteran = value;
    }

    /**
     * Gets the value of the emancipated property.
     * 
     */
    public boolean isEmancipated() {
        return emancipated;
    }

    /**
     * Sets the value of the emancipated property.
     * 
     */
    public void setEmancipated(boolean value) {
        this.emancipated = value;
    }

    /**
     * Gets the value of the minor property.
     * 
     */
    public boolean isMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     */
    public void setMinor(boolean value) {
        this.minor = value;
    }

    /**
     * Gets the value of the minorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Minor }
     *     
     */
    public Minor getMinorDetails() {
        return minorDetails;
    }

    /**
     * Sets the value of the minorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minor }
     *     
     */
    public void setMinorDetails(Minor value) {
        this.minorDetails = value;
    }

    /**
     * Gets the value of the disability property.
     * 
     * @return
     *     possible object is
     *     {@link Disability }
     *     
     */
    public Disability getDisability() {
        return disability;
    }

    /**
     * Sets the value of the disability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disability }
     *     
     */
    public void setDisability(Disability value) {
        this.disability = value;
    }

    /**
     * Gets the value of the incomes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIncome }
     *     
     */
    public ArrayOfIncome getIncomes() {
        return incomes;
    }

    /**
     * Sets the value of the incomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIncome }
     *     
     */
    public void setIncomes(ArrayOfIncome value) {
        this.incomes = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResource }
     *     
     */
    public ArrayOfResource getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResource }
     *     
     */
    public void setResources(ArrayOfResource value) {
        this.resources = value;
    }

    /**
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSID() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSID(String value) {
        this.ssid = value;
    }

}

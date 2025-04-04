
package gov.pr.adsef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Minor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Minor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TakingCareExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TakingCareExpensesAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="WithoutEconomicWealth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Minor", propOrder = {
    "takingCareExpenses",
    "takingCareExpensesAmount",
    "withoutEconomicWealth"
})
public class Minor {

    @XmlElement(name = "TakingCareExpenses")
    protected boolean takingCareExpenses;
    @XmlElement(name = "TakingCareExpensesAmount")
    protected float takingCareExpensesAmount;
    @XmlElement(name = "WithoutEconomicWealth")
    protected boolean withoutEconomicWealth;

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

    /**
     * Gets the value of the withoutEconomicWealth property.
     * 
     */
    public boolean isWithoutEconomicWealth() {
        return withoutEconomicWealth;
    }

    /**
     * Sets the value of the withoutEconomicWealth property.
     * 
     */
    public void setWithoutEconomicWealth(boolean value) {
        this.withoutEconomicWealth = value;
    }

}

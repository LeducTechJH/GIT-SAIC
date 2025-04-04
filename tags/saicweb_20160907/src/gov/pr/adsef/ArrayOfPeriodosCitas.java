
package gov.pr.adsef;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPeriodosCitas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPeriodosCitas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeriodosCitas" type="{http://adsef.pr.gov/}PeriodosCitas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPeriodosCitas", propOrder = {
    "periodosCitas"
})
public class ArrayOfPeriodosCitas {

    @XmlElement(name = "PeriodosCitas", nillable = true)
    protected List<PeriodosCitas> periodosCitas;

    /**
     * Gets the value of the periodosCitas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodosCitas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodosCitas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodosCitas }
     * 
     * 
     */
    public List<PeriodosCitas> getPeriodosCitas() {
        if (periodosCitas == null) {
            periodosCitas = new ArrayList<PeriodosCitas>();
        }
        return this.periodosCitas;
    }

}

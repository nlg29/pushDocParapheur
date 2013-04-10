
package org.adullact.spring_ws.iparapheur._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeMetaDonnees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeMetaDonnees">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaDonnee" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}MetaDonnee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeMetaDonnees", propOrder = {
    "metaDonnee"
})
public class TypeMetaDonnees {

    @XmlElement(name = "MetaDonnee")
    protected List<MetaDonnee> metaDonnee;

    /**
     * Gets the value of the metaDonnee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDonnee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDonnee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDonnee }
     * 
     * 
     */
    public List<MetaDonnee> getMetaDonnee() {
        if (metaDonnee == null) {
            metaDonnee = new ArrayList<MetaDonnee>();
        }
        return this.metaDonnee;
    }

}

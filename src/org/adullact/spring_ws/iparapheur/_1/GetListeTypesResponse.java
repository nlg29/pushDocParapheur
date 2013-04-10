
package org.adullact.spring_ws.iparapheur._1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="TypeTechnique" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeTechnique" maxOccurs="unbounded" minOccurs="0"/>
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
    "typeTechnique"
})
@XmlRootElement(name = "GetListeTypesResponse")
public class GetListeTypesResponse {

    @XmlElement(name = "TypeTechnique")
    protected List<String> typeTechnique;

    /**
     * Gets the value of the typeTechnique property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeTechnique property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeTechnique().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeTechnique() {
        if (typeTechnique == null) {
            typeTechnique = new ArrayList<String>();
        }
        return this.typeTechnique;
    }

}

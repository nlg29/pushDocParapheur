
package org.adullact.spring_ws.iparapheur._1;

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
 *         &lt;element name="TypeTechnique" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeTechnique" minOccurs="0"/>
 *         &lt;element name="DemanderMiseAJourTdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "typeTechnique",
    "demanderMiseAJourTdt"
})
@XmlRootElement(name = "GetClassificationActesTdtRequest")
public class GetClassificationActesTdtRequest {

    @XmlElement(name = "TypeTechnique")
    protected String typeTechnique;
    @XmlElement(name = "DemanderMiseAJourTdt")
    protected String demanderMiseAJourTdt;

    /**
     * Gets the value of the typeTechnique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTechnique() {
        return typeTechnique;
    }

    /**
     * Sets the value of the typeTechnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTechnique(String value) {
        this.typeTechnique = value;
    }

    /**
     * Gets the value of the demanderMiseAJourTdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemanderMiseAJourTdt() {
        return demanderMiseAJourTdt;
    }

    /**
     * Sets the value of the demanderMiseAJourTdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemanderMiseAJourTdt(String value) {
        this.demanderMiseAJourTdt = value;
    }

}


package org.adullact.spring_ws.iparapheur._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Définition de méta donnée dans le dictionnaire du modèle de contenu dynamique.
 * 
 * <p>Java class for MetaDonneeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaDonneeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomCourt" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeNomCourt"/>
 *         &lt;element name="nomLong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nature" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}NatureMetaDonnee"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDonneeDefinition", propOrder = {
    "nomCourt",
    "nomLong",
    "nature"
})
public class MetaDonneeDefinition {

    @XmlElement(required = true)
    protected String nomCourt;
    @XmlElement(required = true)
    protected String nomLong;
    @XmlElement(required = true)
    protected NatureMetaDonnee nature;

    /**
     * Gets the value of the nomCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCourt() {
        return nomCourt;
    }

    /**
     * Sets the value of the nomCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCourt(String value) {
        this.nomCourt = value;
    }

    /**
     * Gets the value of the nomLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomLong() {
        return nomLong;
    }

    /**
     * Sets the value of the nomLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomLong(String value) {
        this.nomLong = value;
    }

    /**
     * Gets the value of the nature property.
     * 
     * @return
     *     possible object is
     *     {@link NatureMetaDonnee }
     *     
     */
    public NatureMetaDonnee getNature() {
        return nature;
    }

    /**
     * Sets the value of the nature property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureMetaDonnee }
     *     
     */
    public void setNature(NatureMetaDonnee value) {
        this.nature = value;
    }

}

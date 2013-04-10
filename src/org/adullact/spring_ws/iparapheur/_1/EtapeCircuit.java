
package org.adullact.spring_ws.iparapheur._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Role = VISEUR | SIGNATAIRE | TDT | ARCHIVAGE. Dans le futur: EMETTEUR(?), EMAIL,... 
 * 
 * <p>Java class for EtapeCircuit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EtapeCircuit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parapheur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Prenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EtapeCircuit", propOrder = {
    "parapheur",
    "prenom",
    "nom",
    "role"
})
public class EtapeCircuit {

    @XmlElement(name = "Parapheur", required = true)
    protected String parapheur;
    @XmlElement(name = "Prenom", required = true)
    protected String prenom;
    @XmlElement(name = "Nom", required = true)
    protected String nom;
    @XmlElement(name = "Role", required = true)
    protected String role;

    /**
     * Gets the value of the parapheur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParapheur() {
        return parapheur;
    }

    /**
     * Sets the value of the parapheur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParapheur(String value) {
        this.parapheur = value;
    }

    /**
     * Gets the value of the prenom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets the value of the prenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Gets the value of the nom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

}

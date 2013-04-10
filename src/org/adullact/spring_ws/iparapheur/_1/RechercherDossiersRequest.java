
package org.adullact.spring_ws.iparapheur._1;

import java.math.BigInteger;
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
 *         &lt;element name="TypeTechnique" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeTechnique" minOccurs="0"/>
 *         &lt;element name="SousType" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}SousType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreDossiers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DossierID" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}DossierID" maxOccurs="unbounded" minOccurs="0"/>
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
    "sousType",
    "status",
    "nombreDossiers",
    "dossierID"
})
@XmlRootElement(name = "RechercherDossiersRequest")
public class RechercherDossiersRequest {

    @XmlElement(name = "TypeTechnique")
    protected String typeTechnique;
    @XmlElement(name = "SousType")
    protected String sousType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "NombreDossiers")
    protected BigInteger nombreDossiers;
    @XmlElement(name = "DossierID")
    protected List<String> dossierID;

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
     * Gets the value of the sousType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSousType() {
        return sousType;
    }

    /**
     * Sets the value of the sousType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSousType(String value) {
        this.sousType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the nombreDossiers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNombreDossiers() {
        return nombreDossiers;
    }

    /**
     * Sets the value of the nombreDossiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNombreDossiers(BigInteger value) {
        this.nombreDossiers = value;
    }

    /**
     * Gets the value of the dossierID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dossierID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDossierID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDossierID() {
        if (dossierID == null) {
            dossierID = new ArrayList<String>();
        }
        return this.dossierID;
    }

}

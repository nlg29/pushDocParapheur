
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
 *       &lt;all>
 *         &lt;element name="TypeTechnique" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeTechnique"/>
 *         &lt;element name="SousType" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}SousType"/>
 *         &lt;element name="EmailEmetteur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DossierID" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}DossierID"/>
 *         &lt;element name="FichierPES" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeDoc"/>
 *         &lt;element name="VisuelPDF" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeDoc"/>
 *         &lt;element name="XPathPourSignaturePES" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnnotationPublique" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnnotationPrivee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Visibilite" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}Visibilite"/>
 *         &lt;element name="DateLimite" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}date_AAAA-MM-JJ"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "CreerDossierPESRequest")
public class CreerDossierPESRequest {

    @XmlElement(name = "TypeTechnique", required = true)
    protected String typeTechnique;
    @XmlElement(name = "SousType", required = true)
    protected String sousType;
    @XmlElement(name = "EmailEmetteur", required = true)
    protected String emailEmetteur;
    @XmlElement(name = "DossierID", required = true)
    protected String dossierID;
    @XmlElement(name = "FichierPES", required = true)
    protected TypeDoc fichierPES;
    @XmlElement(name = "VisuelPDF", required = true)
    protected TypeDoc visuelPDF;
    @XmlElement(name = "XPathPourSignaturePES", required = true)
    protected String xPathPourSignaturePES;
    @XmlElement(name = "AnnotationPublique", required = true, nillable = true)
    protected String annotationPublique;
    @XmlElement(name = "AnnotationPrivee", required = true, nillable = true)
    protected String annotationPrivee;
    @XmlElement(name = "Visibilite", required = true)
    protected Visibilite visibilite;
    @XmlElement(name = "DateLimite", required = true, nillable = true)
    protected String dateLimite;

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
     * Gets the value of the emailEmetteur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEmetteur() {
        return emailEmetteur;
    }

    /**
     * Sets the value of the emailEmetteur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEmetteur(String value) {
        this.emailEmetteur = value;
    }

    /**
     * Gets the value of the dossierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierID() {
        return dossierID;
    }

    /**
     * Sets the value of the dossierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierID(String value) {
        this.dossierID = value;
    }

    /**
     * Gets the value of the fichierPES property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDoc }
     *     
     */
    public TypeDoc getFichierPES() {
        return fichierPES;
    }

    /**
     * Sets the value of the fichierPES property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDoc }
     *     
     */
    public void setFichierPES(TypeDoc value) {
        this.fichierPES = value;
    }

    /**
     * Gets the value of the visuelPDF property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDoc }
     *     
     */
    public TypeDoc getVisuelPDF() {
        return visuelPDF;
    }

    /**
     * Sets the value of the visuelPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDoc }
     *     
     */
    public void setVisuelPDF(TypeDoc value) {
        this.visuelPDF = value;
    }

    /**
     * Gets the value of the xPathPourSignaturePES property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPathPourSignaturePES() {
        return xPathPourSignaturePES;
    }

    /**
     * Sets the value of the xPathPourSignaturePES property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPathPourSignaturePES(String value) {
        this.xPathPourSignaturePES = value;
    }

    /**
     * Gets the value of the annotationPublique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationPublique() {
        return annotationPublique;
    }

    /**
     * Sets the value of the annotationPublique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationPublique(String value) {
        this.annotationPublique = value;
    }

    /**
     * Gets the value of the annotationPrivee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationPrivee() {
        return annotationPrivee;
    }

    /**
     * Sets the value of the annotationPrivee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationPrivee(String value) {
        this.annotationPrivee = value;
    }

    /**
     * Gets the value of the visibilite property.
     * 
     * @return
     *     possible object is
     *     {@link Visibilite }
     *     
     */
    public Visibilite getVisibilite() {
        return visibilite;
    }

    /**
     * Sets the value of the visibilite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibilite }
     *     
     */
    public void setVisibilite(Visibilite value) {
        this.visibilite = value;
    }

    /**
     * Gets the value of the dateLimite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLimite() {
        return dateLimite;
    }

    /**
     * Sets the value of the dateLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLimite(String value) {
        this.dateLimite = value;
    }

}


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
 *         &lt;element name="DossierID" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}DossierID"/>
 *         &lt;element name="CodeTransition" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}codeRetour"/>
 *         &lt;element name="AnnotationPublique" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnnotationPrivee" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "ForcerEtapeRequest")
public class ForcerEtapeRequest {

    @XmlElement(name = "DossierID", required = true)
    protected String dossierID;
    @XmlElement(name = "CodeTransition", required = true)
    protected String codeTransition;
    @XmlElement(name = "AnnotationPublique", required = true, nillable = true)
    protected String annotationPublique;
    @XmlElement(name = "AnnotationPrivee", required = true, nillable = true)
    protected String annotationPrivee;

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
     * Gets the value of the codeTransition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeTransition() {
        return codeTransition;
    }

    /**
     * Sets the value of the codeTransition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeTransition(String value) {
        this.codeTransition = value;
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

}

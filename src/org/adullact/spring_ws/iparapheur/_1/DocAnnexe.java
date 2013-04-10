
package org.adullact.spring_ws.iparapheur._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * mimetype: par exemple "application/pdf".  encoding: par exemple "UTF-8".
 *             Et maintenant, possibilité d'y definir une signature detachee CMS/PKCS7.
 *            
 * 
 * <p>Java class for DocAnnexe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocAnnexe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}DossierID"/>
 *         &lt;element name="fichier" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeDoc"/>
 *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signature" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}TypeDoc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocAnnexe", propOrder = {
    "nom",
    "fichier",
    "mimetype",
    "encoding",
    "signature"
})
public class DocAnnexe {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected TypeDoc fichier;
    @XmlElement(required = true)
    protected String mimetype;
    @XmlElement(required = true)
    protected String encoding;
    protected TypeDoc signature;

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
     * Gets the value of the fichier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDoc }
     *     
     */
    public TypeDoc getFichier() {
        return fichier;
    }

    /**
     * Sets the value of the fichier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDoc }
     *     
     */
    public void setFichier(TypeDoc value) {
        this.fichier = value;
    }

    /**
     * Gets the value of the mimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDoc }
     *     
     */
    public TypeDoc getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDoc }
     *     
     */
    public void setSignature(TypeDoc value) {
        this.signature = value;
    }

}

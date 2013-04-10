
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
 *         &lt;element name="dossier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rcptTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "dossier",
    "rcptTo",
    "subject",
    "message",
    "password",
    "sendPassword"
})
@XmlRootElement(name = "EnvoyerDossierMailSecuriseRequest")
public class EnvoyerDossierMailSecuriseRequest {

    @XmlElement(required = true)
    protected String dossier;
    @XmlElement(required = true)
    protected String rcptTo;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String message;
    protected String password;
    protected Boolean sendPassword;

    /**
     * Gets the value of the dossier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossier() {
        return dossier;
    }

    /**
     * Sets the value of the dossier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossier(String value) {
        this.dossier = value;
    }

    /**
     * Gets the value of the rcptTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptTo() {
        return rcptTo;
    }

    /**
     * Sets the value of the rcptTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptTo(String value) {
        this.rcptTo = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the sendPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPassword() {
        return sendPassword;
    }

    /**
     * Sets the value of the sendPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPassword(Boolean value) {
        this.sendPassword = value;
    }

}

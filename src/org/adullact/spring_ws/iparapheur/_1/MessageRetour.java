
package org.adullact.spring_ws.iparapheur._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageRetour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageRetour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeRetour" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}codeRetour"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="severite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageRetour", propOrder = {
    "codeRetour",
    "message",
    "severite"
})
public class MessageRetour {

    @XmlElement(required = true)
    protected String codeRetour;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String severite;

    /**
     * Gets the value of the codeRetour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeRetour() {
        return codeRetour;
    }

    /**
     * Sets the value of the codeRetour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeRetour(String value) {
        this.codeRetour = value;
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
     * Gets the value of the severite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverite() {
        return severite;
    }

    /**
     * Sets the value of the severite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverite(String value) {
        this.severite = value;
    }

}

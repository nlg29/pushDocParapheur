
package org.adullact.spring_ws.iparapheur._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageRetour" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}MessageRetour" minOccurs="0"/>
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
    "url",
    "messageRetour"
})
@XmlRootElement(name = "ArchiverDossierResponse")
public class ArchiverDossierResponse {

    @XmlElementRef(name = "URL", namespace = "http://www.adullact.org/spring-ws/iparapheur/1.0", type = JAXBElement.class)
    protected JAXBElement<String> url;
    @XmlElement(name = "MessageRetour")
    protected MessageRetour messageRetour;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURL(JAXBElement<String> value) {
        this.url = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the messageRetour property.
     * 
     * @return
     *     possible object is
     *     {@link MessageRetour }
     *     
     */
    public MessageRetour getMessageRetour() {
        return messageRetour;
    }

    /**
     * Sets the value of the messageRetour property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRetour }
     *     
     */
    public void setMessageRetour(MessageRetour value) {
        this.messageRetour = value;
    }

}

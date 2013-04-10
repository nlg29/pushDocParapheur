
package org.adullact.spring_ws.iparapheur._1;

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
 *         &lt;element name="LogDossier" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}LogDossier" maxOccurs="unbounded" minOccurs="0"/>
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
    "logDossier",
    "messageRetour"
})
@XmlRootElement(name = "GetHistoDossierResponse")
public class GetHistoDossierResponse {

    @XmlElement(name = "LogDossier")
    protected List<LogDossier> logDossier;
    @XmlElement(name = "MessageRetour")
    protected MessageRetour messageRetour;

    /**
     * Gets the value of the logDossier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logDossier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogDossier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogDossier }
     * 
     * 
     */
    public List<LogDossier> getLogDossier() {
        if (logDossier == null) {
            logDossier = new ArrayList<LogDossier>();
        }
        return this.logDossier;
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


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
 *         &lt;element name="ArchivageAction" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}ArchivageAction" minOccurs="0"/>
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
@XmlRootElement(name = "ArchiverDossierRequest")
public class ArchiverDossierRequest {

    @XmlElement(name = "DossierID", required = true)
    protected String dossierID;
    @XmlElement(name = "ArchivageAction")
    protected ArchivageAction archivageAction;

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
     * Gets the value of the archivageAction property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivageAction }
     *     
     */
    public ArchivageAction getArchivageAction() {
        return archivageAction;
    }

    /**
     * Sets the value of the archivageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivageAction }
     *     
     */
    public void setArchivageAction(ArchivageAction value) {
        this.archivageAction = value;
    }

}

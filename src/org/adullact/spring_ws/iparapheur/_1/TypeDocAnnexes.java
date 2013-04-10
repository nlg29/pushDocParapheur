
package org.adullact.spring_ws.iparapheur._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeDocAnnexes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeDocAnnexes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocAnnexe" type="{http://www.adullact.org/spring-ws/iparapheur/1.0}DocAnnexe" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeDocAnnexes", propOrder = {
    "docAnnexe"
})
public class TypeDocAnnexes {

    @XmlElement(name = "DocAnnexe")
    protected List<DocAnnexe> docAnnexe;

    /**
     * Gets the value of the docAnnexe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docAnnexe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocAnnexe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocAnnexe }
     * 
     * 
     */
    public List<DocAnnexe> getDocAnnexe() {
        if (docAnnexe == null) {
            docAnnexe = new ArrayList<DocAnnexe>();
        }
        return this.docAnnexe;
    }

}


package org.adullact.spring_ws.iparapheur._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Visibilite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Visibilite">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="PUBLIC"/>
 *     &lt;enumeration value="SERVICE"/>
 *     &lt;enumeration value="CONFIDENTIEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Visibilite")
@XmlEnum
public enum Visibilite {

    PUBLIC,
    SERVICE,
    CONFIDENTIEL;

    public String value() {
        return name();
    }

    public static Visibilite fromValue(String v) {
        return valueOf(v);
    }

}

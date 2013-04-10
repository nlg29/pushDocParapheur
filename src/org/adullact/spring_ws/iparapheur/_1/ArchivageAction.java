
package org.adullact.spring_ws.iparapheur._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchivageAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArchivageAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="ARCHIVER"/>
 *     &lt;enumeration value="EFFACER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArchivageAction")
@XmlEnum
public enum ArchivageAction {

    ARCHIVER,
    EFFACER;

    public String value() {
        return name();
    }

    public static ArchivageAction fromValue(String v) {
        return valueOf(v);
    }

}

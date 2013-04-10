
package org.adullact.spring_ws.iparapheur._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NatureMetaDonnee.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NatureMetaDonnee">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="DATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NatureMetaDonnee")
@XmlEnum
public enum NatureMetaDonnee {

    STRING,
    INT,
    FLOAT,
    DATE;

    public String value() {
        return name();
    }

    public static NatureMetaDonnee fromValue(String v) {
        return valueOf(v);
    }

}

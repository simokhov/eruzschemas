//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:51:32 PM MSK 
//


package ru.gov.zakupki.eruz.base._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errorLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="WARNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errorLevelType", namespace = "http://zakupki.gov.ru/eruz/base/1")
@XmlEnum
public enum ErrorLevelType {

    ERROR,
    WARNING;

    public String value() {
        return name();
    }

    public static ErrorLevelType fromValue(String v) {
        return valueOf(v);
    }

}

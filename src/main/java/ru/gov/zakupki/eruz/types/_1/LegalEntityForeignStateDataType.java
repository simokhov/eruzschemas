//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:51:32 PM MSK 
//


package ru.gov.zakupki.eruz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.eruz.common._1.OKSMRef;


/**
 * Тип: Регистрационные данные юридического лица иностранного государства
 * 
 * <p>Java class for legalEntityForeignStateDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityForeignStateDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullName" type="{http://zakupki.gov.ru/eruz/base/1}text1000Type"/>
 *         &lt;element name="shortName" type="{http://zakupki.gov.ru/eruz/base/1}text510Type" minOccurs="0"/>
 *         &lt;element name="countryInfo" type="{http://zakupki.gov.ru/eruz/common/1}OKSMRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityForeignStateDataType", propOrder = {
    "fullName",
    "shortName",
    "countryInfo"
})
@XmlSeeAlso({
    ru.gov.zakupki.eruz.types._1.LegalEntityForeignStateNotInRAFPType.LegalEntityForeignStateDataInfo.class
})
public class LegalEntityForeignStateDataType {

    @XmlElement(required = true)
    protected String fullName;
    protected String shortName;
    @XmlElement(required = true)
    protected OKSMRef countryInfo;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the countryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OKSMRef }
     *     
     */
    public OKSMRef getCountryInfo() {
        return countryInfo;
    }

    /**
     * Sets the value of the countryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKSMRef }
     *     
     */
    public void setCountryInfo(OKSMRef value) {
        this.countryInfo = value;
    }

}
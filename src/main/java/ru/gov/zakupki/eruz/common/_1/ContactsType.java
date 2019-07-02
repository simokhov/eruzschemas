//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:51:32 PM MSK 
//


package ru.gov.zakupki.eruz.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Контактная информация
 * 
 * <p>Java class for contactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://zakupki.gov.ru/eruz/base/1}eMailType"/>
 *         &lt;element name="notificationEmail" type="{http://zakupki.gov.ru/eruz/base/1}eMailType"/>
 *         &lt;element name="phone" type="{http://zakupki.gov.ru/eruz/base/1}phoneType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactsType", propOrder = {
    "email",
    "notificationEmail",
    "phone"
})
@XmlSeeAlso({
    ru.gov.zakupki.eruz.types._1.FilialLegalEntityRFType.FilialInfo.FilialContactInfo.class,
    ru.gov.zakupki.eruz.types._1.IndividualPersonRFType.ContactInfo.class,
    ru.gov.zakupki.eruz.types._1.IndividualPersonForeignStateType.ContactInfo.class,
    ru.gov.zakupki.eruz.types._1.LegalEntityForeignStateNotInRAFPType.ContactInfo.class,
    ru.gov.zakupki.eruz.types._1.LegalEntityForeignStateInRAFPType.FilialLegalEntityForeignStateInfo.ContactInfo.class,
    ru.gov.zakupki.eruz.types._1.LegalEntityRFType.ContactInfo.class
})
public class ContactsType {

    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String notificationEmail;
    @XmlElement(required = true)
    protected String phone;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the notificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Sets the value of the notificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 04:14:17 PM MSK 
//


package ru.gov.zakupki.eruz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.eruz.common._1.OKSMRef;


/**
 * Тип: Паспорт иностранного гражданина
 * 
 * <p>Java class for passportForeignType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passportForeignType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://zakupki.gov.ru/eruz/base/1}passportLENumberType"/>
 *         &lt;element name="issuingStateInfo" type="{http://zakupki.gov.ru/eruz/common/1}OKSMRef"/>
 *         &lt;element name="issuedBy" type="{http://zakupki.gov.ru/eruz/base/1}text300Type"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="validityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passportForeignType", propOrder = {
    "number",
    "issuingStateInfo",
    "issuedBy",
    "issueDate",
    "validityDate"
})
public class PassportForeignType {

    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected OKSMRef issuingStateInfo;
    @XmlElement(required = true)
    protected String issuedBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validityDate;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the issuingStateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OKSMRef }
     *     
     */
    public OKSMRef getIssuingStateInfo() {
        return issuingStateInfo;
    }

    /**
     * Sets the value of the issuingStateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKSMRef }
     *     
     */
    public void setIssuingStateInfo(OKSMRef value) {
        this.issuingStateInfo = value;
    }

    /**
     * Gets the value of the issuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * Sets the value of the issuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedBy(String value) {
        this.issuedBy = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the validityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityDate() {
        return validityDate;
    }

    /**
     * Sets the value of the validityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityDate(XMLGregorianCalendar value) {
        this.validityDate = value;
    }

}

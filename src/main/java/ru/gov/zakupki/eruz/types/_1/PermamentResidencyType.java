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
 * Тип: Вид на жительство РФ
 * 
 * <p>Java class for permamentResidencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permamentResidencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="series" type="{http://zakupki.gov.ru/eruz/base/1}permamentResidencySeriesType"/>
 *         &lt;element name="number" type="{http://zakupki.gov.ru/eruz/base/1}permamentResidencyNumberType"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="issuedBy" type="{http://zakupki.gov.ru/eruz/base/1}text300Type"/>
 *         &lt;element name="validityDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="citizenshipInfo" type="{http://zakupki.gov.ru/eruz/common/1}OKSMRef"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="birthPlace" type="{http://zakupki.gov.ru/eruz/base/1}text300Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permamentResidencyType", propOrder = {
    "series",
    "number",
    "issueDate",
    "issuedBy",
    "validityDate",
    "citizenshipInfo",
    "birthDate",
    "birthPlace"
})
public class PermamentResidencyType {

    @XmlElement(required = true)
    protected String series;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(required = true)
    protected String issuedBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validityDate;
    @XmlElement(required = true)
    protected OKSMRef citizenshipInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(required = true)
    protected String birthPlace;

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeries(String value) {
        this.series = value;
    }

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

    /**
     * Gets the value of the citizenshipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OKSMRef }
     *     
     */
    public OKSMRef getCitizenshipInfo() {
        return citizenshipInfo;
    }

    /**
     * Sets the value of the citizenshipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKSMRef }
     *     
     */
    public void setCitizenshipInfo(OKSMRef value) {
        this.citizenshipInfo = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

}

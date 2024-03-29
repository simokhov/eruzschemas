//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 04:14:17 PM MSK 
//


package ru.gov.zakupki.eruz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.eruz.common._1.AttachmentListType;
import ru.gov.zakupki.eruz.common._1.ContractorExcludeReasonRef;
import ru.gov.zakupki.eruz.common._1.ETPRef;
import ru.gov.zakupki.eruz.common._1.ExtPrintFormType;
import ru.gov.zakupki.eruz.common._1.PersonType;
import ru.gov.zakupki.eruz.common._1.PrintFormType;


/**
 * Тип: Информация об исключении участника закупки из ЕРУЗ
 * 
 * <p>Java class for contractorExcludeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractorExcludeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="registryNum" type="{http://zakupki.gov.ru/eruz/base/1}eruzRegistryNumType"/>
 *                   &lt;element name="publishedDT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ETP" type="{http://zakupki.gov.ru/eruz/common/1}ETPRef" minOccurs="0"/>
 *         &lt;element name="excludeReasonText" type="{http://zakupki.gov.ru/eruz/base/1}text500Type" minOccurs="0"/>
 *         &lt;element name="excludeReason" type="{http://zakupki.gov.ru/eruz/common/1}contractorExcludeReasonRef"/>
 *         &lt;element name="attachmentsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="foundingDocsCopyInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/eruz/common/1}printFormType" minOccurs="0"/>
 *         &lt;element name="printFormFieldsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/eruz/base/1}text1000Type" minOccurs="0"/>
 *                   &lt;element name="INNOrganization" type="{http://zakupki.gov.ru/eruz/base/1}innOrganizationType" minOccurs="0"/>
 *                   &lt;element name="INNIndividual" type="{http://zakupki.gov.ru/eruz/base/1}innIndividualType" minOccurs="0"/>
 *                   &lt;element name="nameInfo" type="{http://zakupki.gov.ru/eruz/common/1}personType" minOccurs="0"/>
 *                   &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/eruz/base/1}taxPayerCode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/eruz/common/1}extPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/eruz/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractorExcludeType", propOrder = {
    "id",
    "commonInfo",
    "etp",
    "excludeReasonText",
    "excludeReason",
    "attachmentsInfo",
    "printFormInfo",
    "printFormFieldsInfo",
    "extPrintFormInfo"
})
public class ContractorExcludeType {

    protected Long id;
    @XmlElement(required = true)
    protected ContractorExcludeType.CommonInfo commonInfo;
    @XmlElement(name = "ETP")
    protected ETPRef etp;
    protected String excludeReasonText;
    @XmlElement(required = true)
    protected ContractorExcludeReasonRef excludeReason;
    protected ContractorExcludeType.AttachmentsInfo attachmentsInfo;
    protected PrintFormType printFormInfo;
    protected ContractorExcludeType.PrintFormFieldsInfo printFormFieldsInfo;
    protected ExtPrintFormType extPrintFormInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorExcludeType.CommonInfo }
     *     
     */
    public ContractorExcludeType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorExcludeType.CommonInfo }
     *     
     */
    public void setCommonInfo(ContractorExcludeType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the etp property.
     * 
     * @return
     *     possible object is
     *     {@link ETPRef }
     *     
     */
    public ETPRef getETP() {
        return etp;
    }

    /**
     * Sets the value of the etp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETPRef }
     *     
     */
    public void setETP(ETPRef value) {
        this.etp = value;
    }

    /**
     * Gets the value of the excludeReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeReasonText() {
        return excludeReasonText;
    }

    /**
     * Sets the value of the excludeReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeReasonText(String value) {
        this.excludeReasonText = value;
    }

    /**
     * Gets the value of the excludeReason property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorExcludeReasonRef }
     *     
     */
    public ContractorExcludeReasonRef getExcludeReason() {
        return excludeReason;
    }

    /**
     * Sets the value of the excludeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorExcludeReasonRef }
     *     
     */
    public void setExcludeReason(ContractorExcludeReasonRef value) {
        this.excludeReason = value;
    }

    /**
     * Gets the value of the attachmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorExcludeType.AttachmentsInfo }
     *     
     */
    public ContractorExcludeType.AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }

    /**
     * Sets the value of the attachmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorExcludeType.AttachmentsInfo }
     *     
     */
    public void setAttachmentsInfo(ContractorExcludeType.AttachmentsInfo value) {
        this.attachmentsInfo = value;
    }

    /**
     * Gets the value of the printFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrintFormType }
     *     
     */
    public PrintFormType getPrintFormInfo() {
        return printFormInfo;
    }

    /**
     * Sets the value of the printFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintFormType }
     *     
     */
    public void setPrintFormInfo(PrintFormType value) {
        this.printFormInfo = value;
    }

    /**
     * Gets the value of the printFormFieldsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorExcludeType.PrintFormFieldsInfo }
     *     
     */
    public ContractorExcludeType.PrintFormFieldsInfo getPrintFormFieldsInfo() {
        return printFormFieldsInfo;
    }

    /**
     * Sets the value of the printFormFieldsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorExcludeType.PrintFormFieldsInfo }
     *     
     */
    public void setPrintFormFieldsInfo(ContractorExcludeType.PrintFormFieldsInfo value) {
        this.printFormFieldsInfo = value;
    }

    /**
     * Gets the value of the extPrintFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPrintFormType }
     *     
     */
    public ExtPrintFormType getExtPrintFormInfo() {
        return extPrintFormInfo;
    }

    /**
     * Sets the value of the extPrintFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPrintFormType }
     *     
     */
    public void setExtPrintFormInfo(ExtPrintFormType value) {
        this.extPrintFormInfo = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="foundingDocsCopyInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "foundingDocsCopyInfo"
    })
    public static class AttachmentsInfo {

        @XmlElement(required = true)
        protected AttachmentListType foundingDocsCopyInfo;

        /**
         * Gets the value of the foundingDocsCopyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListType }
         *     
         */
        public AttachmentListType getFoundingDocsCopyInfo() {
            return foundingDocsCopyInfo;
        }

        /**
         * Sets the value of the foundingDocsCopyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListType }
         *     
         */
        public void setFoundingDocsCopyInfo(AttachmentListType value) {
            this.foundingDocsCopyInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="registryNum" type="{http://zakupki.gov.ru/eruz/base/1}eruzRegistryNumType"/>
     *         &lt;element name="publishedDT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "registryNum",
        "publishedDT"
    })
    public static class CommonInfo {

        @XmlElement(required = true)
        protected String registryNum;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishedDT;

        /**
         * Gets the value of the registryNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistryNum() {
            return registryNum;
        }

        /**
         * Sets the value of the registryNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistryNum(String value) {
            this.registryNum = value;
        }

        /**
         * Gets the value of the publishedDT property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublishedDT() {
            return publishedDT;
        }

        /**
         * Sets the value of the publishedDT property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublishedDT(XMLGregorianCalendar value) {
            this.publishedDT = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/eruz/base/1}text1000Type" minOccurs="0"/>
     *         &lt;element name="INNOrganization" type="{http://zakupki.gov.ru/eruz/base/1}innOrganizationType" minOccurs="0"/>
     *         &lt;element name="INNIndividual" type="{http://zakupki.gov.ru/eruz/base/1}innIndividualType" minOccurs="0"/>
     *         &lt;element name="nameInfo" type="{http://zakupki.gov.ru/eruz/common/1}personType" minOccurs="0"/>
     *         &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/eruz/base/1}taxPayerCode" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fullName",
        "innOrganization",
        "innIndividual",
        "nameInfo",
        "taxPayerCode"
    })
    public static class PrintFormFieldsInfo {

        protected String fullName;
        @XmlElement(name = "INNOrganization")
        protected String innOrganization;
        @XmlElement(name = "INNIndividual")
        protected String innIndividual;
        protected PersonType nameInfo;
        protected String taxPayerCode;

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
         * Gets the value of the innOrganization property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINNOrganization() {
            return innOrganization;
        }

        /**
         * Sets the value of the innOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINNOrganization(String value) {
            this.innOrganization = value;
        }

        /**
         * Gets the value of the innIndividual property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINNIndividual() {
            return innIndividual;
        }

        /**
         * Sets the value of the innIndividual property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINNIndividual(String value) {
            this.innIndividual = value;
        }

        /**
         * Gets the value of the nameInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PersonType }
         *     
         */
        public PersonType getNameInfo() {
            return nameInfo;
        }

        /**
         * Sets the value of the nameInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonType }
         *     
         */
        public void setNameInfo(PersonType value) {
            this.nameInfo = value;
        }

        /**
         * Gets the value of the taxPayerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxPayerCode() {
            return taxPayerCode;
        }

        /**
         * Sets the value of the taxPayerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxPayerCode(String value) {
            this.taxPayerCode = value;
        }

    }

}

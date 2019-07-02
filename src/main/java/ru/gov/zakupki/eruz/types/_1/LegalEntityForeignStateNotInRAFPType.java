//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:51:32 PM MSK 
//


package ru.gov.zakupki.eruz.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.eruz.common._1.AttachmentListType;
import ru.gov.zakupki.eruz.common._1.ContactsType;
import ru.gov.zakupki.eruz.common._1.TimeZoneRef;


/**
 * Тип: Юридическое лицо иностранного государства
 * 
 * <p>Java class for legalEntityForeignStateNotInRAFPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityForeignStateNotInRAFPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legalEntityForeignStateDataInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/eruz/types/1}legalEntityForeignStateDataType">
 *                 &lt;sequence>
 *                   &lt;element name="factAdress" type="{http://zakupki.gov.ru/eruz/base/1}text2000Type"/>
 *                   &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/eruz/base/1}taxPayerCode"/>
 *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/eruz/base/1}moneyMaxLengthToPoint21Type"/>
 *                   &lt;element name="timeZoneInfo" type="{http://zakupki.gov.ru/eruz/common/1}timeZoneRef"/>
 *                   &lt;element name="isParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="informationPersons">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="informationPersonInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/eruz/types/1}informationPersonType">
 *                           &lt;sequence>
 *                             &lt;element name="INN" type="{http://zakupki.gov.ru/eruz/base/1}innIndividualType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contactInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/eruz/common/1}contactsType">
 *                 &lt;sequence>
 *                   &lt;element name="postAdress" type="{http://zakupki.gov.ru/eruz/base/1}text2000Type"/>
 *                   &lt;element name="url" type="{http://zakupki.gov.ru/eruz/base/1}hrefType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachmentsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="foundingDocLegalEntityInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
 *                   &lt;element name="consentDecisionInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
 *                   &lt;element name="govRegistrationLegalEntityDocInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
 *                   &lt;element name="registrationAuthorityIPInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityForeignStateNotInRAFPType", propOrder = {
    "legalEntityForeignStateDataInfo",
    "informationPersons",
    "contactInfo",
    "attachmentsInfo"
})
public class LegalEntityForeignStateNotInRAFPType {

    @XmlElement(required = true)
    protected LegalEntityForeignStateNotInRAFPType.LegalEntityForeignStateDataInfo legalEntityForeignStateDataInfo;
    @XmlElement(required = true)
    protected LegalEntityForeignStateNotInRAFPType.InformationPersons informationPersons;
    @XmlElement(required = true)
    protected LegalEntityForeignStateNotInRAFPType.ContactInfo contactInfo;
    @XmlElement(required = true)
    protected LegalEntityForeignStateNotInRAFPType.AttachmentsInfo attachmentsInfo;

    /**
     * Gets the value of the legalEntityForeignStateDataInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityForeignStateNotInRAFPType.LegalEntityForeignStateDataInfo }
     *     
     */
    public LegalEntityForeignStateNotInRAFPType.LegalEntityForeignStateDataInfo getLegalEntityForeignStateDataInfo() {
        return legalEntityForeignStateDataInfo;
    }

    /**
     * Sets the value of the legalEntityForeignStateDataInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityForeignStateNotInRAFPType.LegalEntityForeignStateDataInfo }
     *     
     */
    public void setLegalEntityForeignStateDataInfo(LegalEntityForeignStateNotInRAFPType.LegalEntityForeignStateDataInfo value) {
        this.legalEntityForeignStateDataInfo = value;
    }

    /**
     * Gets the value of the informationPersons property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityForeignStateNotInRAFPType.InformationPersons }
     *     
     */
    public LegalEntityForeignStateNotInRAFPType.InformationPersons getInformationPersons() {
        return informationPersons;
    }

    /**
     * Sets the value of the informationPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityForeignStateNotInRAFPType.InformationPersons }
     *     
     */
    public void setInformationPersons(LegalEntityForeignStateNotInRAFPType.InformationPersons value) {
        this.informationPersons = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityForeignStateNotInRAFPType.ContactInfo }
     *     
     */
    public LegalEntityForeignStateNotInRAFPType.ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityForeignStateNotInRAFPType.ContactInfo }
     *     
     */
    public void setContactInfo(LegalEntityForeignStateNotInRAFPType.ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the attachmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityForeignStateNotInRAFPType.AttachmentsInfo }
     *     
     */
    public LegalEntityForeignStateNotInRAFPType.AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }

    /**
     * Sets the value of the attachmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityForeignStateNotInRAFPType.AttachmentsInfo }
     *     
     */
    public void setAttachmentsInfo(LegalEntityForeignStateNotInRAFPType.AttachmentsInfo value) {
        this.attachmentsInfo = value;
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
     *         &lt;element name="foundingDocLegalEntityInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
     *         &lt;element name="consentDecisionInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
     *         &lt;element name="govRegistrationLegalEntityDocInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
     *         &lt;element name="registrationAuthorityIPInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
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
        "foundingDocLegalEntityInfo",
        "consentDecisionInfo",
        "govRegistrationLegalEntityDocInfo",
        "registrationAuthorityIPInfo"
    })
    public static class AttachmentsInfo {

        @XmlElement(required = true)
        protected AttachmentListType foundingDocLegalEntityInfo;
        @XmlElement(required = true)
        protected AttachmentListType consentDecisionInfo;
        @XmlElement(required = true)
        protected AttachmentListType govRegistrationLegalEntityDocInfo;
        @XmlElement(required = true)
        protected AttachmentListType registrationAuthorityIPInfo;

        /**
         * Gets the value of the foundingDocLegalEntityInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListType }
         *     
         */
        public AttachmentListType getFoundingDocLegalEntityInfo() {
            return foundingDocLegalEntityInfo;
        }

        /**
         * Sets the value of the foundingDocLegalEntityInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListType }
         *     
         */
        public void setFoundingDocLegalEntityInfo(AttachmentListType value) {
            this.foundingDocLegalEntityInfo = value;
        }

        /**
         * Gets the value of the consentDecisionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListType }
         *     
         */
        public AttachmentListType getConsentDecisionInfo() {
            return consentDecisionInfo;
        }

        /**
         * Sets the value of the consentDecisionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListType }
         *     
         */
        public void setConsentDecisionInfo(AttachmentListType value) {
            this.consentDecisionInfo = value;
        }

        /**
         * Gets the value of the govRegistrationLegalEntityDocInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListType }
         *     
         */
        public AttachmentListType getGovRegistrationLegalEntityDocInfo() {
            return govRegistrationLegalEntityDocInfo;
        }

        /**
         * Sets the value of the govRegistrationLegalEntityDocInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListType }
         *     
         */
        public void setGovRegistrationLegalEntityDocInfo(AttachmentListType value) {
            this.govRegistrationLegalEntityDocInfo = value;
        }

        /**
         * Gets the value of the registrationAuthorityIPInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListType }
         *     
         */
        public AttachmentListType getRegistrationAuthorityIPInfo() {
            return registrationAuthorityIPInfo;
        }

        /**
         * Sets the value of the registrationAuthorityIPInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListType }
         *     
         */
        public void setRegistrationAuthorityIPInfo(AttachmentListType value) {
            this.registrationAuthorityIPInfo = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/eruz/common/1}contactsType">
     *       &lt;sequence>
     *         &lt;element name="postAdress" type="{http://zakupki.gov.ru/eruz/base/1}text2000Type"/>
     *         &lt;element name="url" type="{http://zakupki.gov.ru/eruz/base/1}hrefType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "postAdress",
        "url"
    })
    public static class ContactInfo
        extends ContactsType
    {

        @XmlElement(required = true)
        protected String postAdress;
        protected String url;

        /**
         * Gets the value of the postAdress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostAdress() {
            return postAdress;
        }

        /**
         * Sets the value of the postAdress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostAdress(String value) {
            this.postAdress = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
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
     *         &lt;element name="informationPersonInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/eruz/types/1}informationPersonType">
     *                 &lt;sequence>
     *                   &lt;element name="INN" type="{http://zakupki.gov.ru/eruz/base/1}innIndividualType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "informationPersonInfo"
    })
    public static class InformationPersons {

        @XmlElement(required = true)
        protected List<LegalEntityForeignStateNotInRAFPType.InformationPersons.InformationPersonInfo> informationPersonInfo;

        /**
         * Gets the value of the informationPersonInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informationPersonInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformationPersonInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LegalEntityForeignStateNotInRAFPType.InformationPersons.InformationPersonInfo }
         * 
         * 
         */
        public List<LegalEntityForeignStateNotInRAFPType.InformationPersons.InformationPersonInfo> getInformationPersonInfo() {
            if (informationPersonInfo == null) {
                informationPersonInfo = new ArrayList<LegalEntityForeignStateNotInRAFPType.InformationPersons.InformationPersonInfo>();
            }
            return this.informationPersonInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/eruz/types/1}informationPersonType">
         *       &lt;sequence>
         *         &lt;element name="INN" type="{http://zakupki.gov.ru/eruz/base/1}innIndividualType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inn"
        })
        public static class InformationPersonInfo
            extends InformationPersonType
        {

            @XmlElement(name = "INN")
            protected String inn;

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINN() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINN(String value) {
                this.inn = value;
            }

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
     *     &lt;extension base="{http://zakupki.gov.ru/eruz/types/1}legalEntityForeignStateDataType">
     *       &lt;sequence>
     *         &lt;element name="factAdress" type="{http://zakupki.gov.ru/eruz/base/1}text2000Type"/>
     *         &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/eruz/base/1}taxPayerCode"/>
     *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/eruz/base/1}moneyMaxLengthToPoint21Type"/>
     *         &lt;element name="timeZoneInfo" type="{http://zakupki.gov.ru/eruz/common/1}timeZoneRef"/>
     *         &lt;element name="isParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "factAdress",
        "taxPayerCode",
        "maxPrice",
        "timeZoneInfo",
        "isParticipant"
    })
    public static class LegalEntityForeignStateDataInfo
        extends LegalEntityForeignStateDataType
    {

        @XmlElement(required = true)
        protected String factAdress;
        @XmlElement(required = true)
        protected String taxPayerCode;
        @XmlElement(required = true)
        protected String maxPrice;
        @XmlElement(required = true)
        protected TimeZoneRef timeZoneInfo;
        protected boolean isParticipant;

        /**
         * Gets the value of the factAdress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFactAdress() {
            return factAdress;
        }

        /**
         * Sets the value of the factAdress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFactAdress(String value) {
            this.factAdress = value;
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

        /**
         * Gets the value of the maxPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxPrice() {
            return maxPrice;
        }

        /**
         * Sets the value of the maxPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxPrice(String value) {
            this.maxPrice = value;
        }

        /**
         * Gets the value of the timeZoneInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TimeZoneRef }
         *     
         */
        public TimeZoneRef getTimeZoneInfo() {
            return timeZoneInfo;
        }

        /**
         * Sets the value of the timeZoneInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeZoneRef }
         *     
         */
        public void setTimeZoneInfo(TimeZoneRef value) {
            this.timeZoneInfo = value;
        }

        /**
         * Gets the value of the isParticipant property.
         * 
         */
        public boolean isIsParticipant() {
            return isParticipant;
        }

        /**
         * Sets the value of the isParticipant property.
         * 
         */
        public void setIsParticipant(boolean value) {
            this.isParticipant = value;
        }

    }

}

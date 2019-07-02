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
import ru.gov.zakupki.eruz.common._1.AttachmentType;
import ru.gov.zakupki.eruz.common._1.ContactsType;
import ru.gov.zakupki.eruz.common._1.OKOPFRef;
import ru.gov.zakupki.eruz.common._1.TimeZoneRef;


/**
 * Тип: Юридическое лицо РФ
 * 
 * <p>Java class for legalEntityRFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityRFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legalEntityRFDataInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/eruz/types/1}legalEntityRFDataType">
 *                 &lt;sequence>
 *                   &lt;element name="OKOPF" type="{http://zakupki.gov.ru/eruz/common/1}OKOPFRef" minOccurs="0"/>
 *                   &lt;element name="majorTaxPayerKPP" type="{http://zakupki.gov.ru/eruz/base/1}kppType" minOccurs="0"/>
 *                   &lt;element name="timeZoneInfo" type="{http://zakupki.gov.ru/eruz/common/1}timeZoneRef"/>
 *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/eruz/base/1}moneyMaxLengthToPoint21Type"/>
 *                   &lt;element name="EGRULStatementInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentType"/>
 *                   &lt;element name="isParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="isSubcontractor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="managingOrganization" type="{http://zakupki.gov.ru/eruz/types/1}managingOrganizationType" minOccurs="0"/>
 *         &lt;element name="informationPersons" minOccurs="0">
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
 *                   &lt;element name="postAdress" type="{http://zakupki.gov.ru/eruz/base/1}text2000Type" minOccurs="0"/>
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
 *                   &lt;element name="foundingDocsCopyInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
 *                   &lt;element name="consentDecisionsInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
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
@XmlType(name = "legalEntityRFType", propOrder = {
    "legalEntityRFDataInfo",
    "managingOrganization",
    "informationPersons",
    "contactInfo",
    "attachmentsInfo"
})
public class LegalEntityRFType {

    @XmlElement(required = true)
    protected LegalEntityRFType.LegalEntityRFDataInfo legalEntityRFDataInfo;
    protected ManagingOrganizationType managingOrganization;
    protected LegalEntityRFType.InformationPersons informationPersons;
    @XmlElement(required = true)
    protected LegalEntityRFType.ContactInfo contactInfo;
    @XmlElement(required = true)
    protected LegalEntityRFType.AttachmentsInfo attachmentsInfo;

    /**
     * Gets the value of the legalEntityRFDataInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityRFType.LegalEntityRFDataInfo }
     *     
     */
    public LegalEntityRFType.LegalEntityRFDataInfo getLegalEntityRFDataInfo() {
        return legalEntityRFDataInfo;
    }

    /**
     * Sets the value of the legalEntityRFDataInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityRFType.LegalEntityRFDataInfo }
     *     
     */
    public void setLegalEntityRFDataInfo(LegalEntityRFType.LegalEntityRFDataInfo value) {
        this.legalEntityRFDataInfo = value;
    }

    /**
     * Gets the value of the managingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ManagingOrganizationType }
     *     
     */
    public ManagingOrganizationType getManagingOrganization() {
        return managingOrganization;
    }

    /**
     * Sets the value of the managingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagingOrganizationType }
     *     
     */
    public void setManagingOrganization(ManagingOrganizationType value) {
        this.managingOrganization = value;
    }

    /**
     * Gets the value of the informationPersons property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityRFType.InformationPersons }
     *     
     */
    public LegalEntityRFType.InformationPersons getInformationPersons() {
        return informationPersons;
    }

    /**
     * Sets the value of the informationPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityRFType.InformationPersons }
     *     
     */
    public void setInformationPersons(LegalEntityRFType.InformationPersons value) {
        this.informationPersons = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityRFType.ContactInfo }
     *     
     */
    public LegalEntityRFType.ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityRFType.ContactInfo }
     *     
     */
    public void setContactInfo(LegalEntityRFType.ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the attachmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityRFType.AttachmentsInfo }
     *     
     */
    public LegalEntityRFType.AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }

    /**
     * Sets the value of the attachmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityRFType.AttachmentsInfo }
     *     
     */
    public void setAttachmentsInfo(LegalEntityRFType.AttachmentsInfo value) {
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
     *         &lt;element name="foundingDocsCopyInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
     *         &lt;element name="consentDecisionsInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentListType"/>
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
        "foundingDocsCopyInfo",
        "consentDecisionsInfo"
    })
    public static class AttachmentsInfo {

        @XmlElement(required = true)
        protected AttachmentListType foundingDocsCopyInfo;
        @XmlElement(required = true)
        protected AttachmentListType consentDecisionsInfo;

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

        /**
         * Gets the value of the consentDecisionsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListType }
         *     
         */
        public AttachmentListType getConsentDecisionsInfo() {
            return consentDecisionsInfo;
        }

        /**
         * Sets the value of the consentDecisionsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListType }
         *     
         */
        public void setConsentDecisionsInfo(AttachmentListType value) {
            this.consentDecisionsInfo = value;
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
     *         &lt;element name="postAdress" type="{http://zakupki.gov.ru/eruz/base/1}text2000Type" minOccurs="0"/>
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
        protected List<LegalEntityRFType.InformationPersons.InformationPersonInfo> informationPersonInfo;

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
         * {@link LegalEntityRFType.InformationPersons.InformationPersonInfo }
         * 
         * 
         */
        public List<LegalEntityRFType.InformationPersons.InformationPersonInfo> getInformationPersonInfo() {
            if (informationPersonInfo == null) {
                informationPersonInfo = new ArrayList<LegalEntityRFType.InformationPersons.InformationPersonInfo>();
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
     *     &lt;extension base="{http://zakupki.gov.ru/eruz/types/1}legalEntityRFDataType">
     *       &lt;sequence>
     *         &lt;element name="OKOPF" type="{http://zakupki.gov.ru/eruz/common/1}OKOPFRef" minOccurs="0"/>
     *         &lt;element name="majorTaxPayerKPP" type="{http://zakupki.gov.ru/eruz/base/1}kppType" minOccurs="0"/>
     *         &lt;element name="timeZoneInfo" type="{http://zakupki.gov.ru/eruz/common/1}timeZoneRef"/>
     *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/eruz/base/1}moneyMaxLengthToPoint21Type"/>
     *         &lt;element name="EGRULStatementInfo" type="{http://zakupki.gov.ru/eruz/common/1}attachmentType"/>
     *         &lt;element name="isParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="isSubcontractor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "okopf",
        "majorTaxPayerKPP",
        "timeZoneInfo",
        "maxPrice",
        "egrulStatementInfo",
        "isParticipant",
        "isSubcontractor"
    })
    public static class LegalEntityRFDataInfo
        extends LegalEntityRFDataType
    {

        @XmlElement(name = "OKOPF")
        protected OKOPFRef okopf;
        protected String majorTaxPayerKPP;
        @XmlElement(required = true)
        protected TimeZoneRef timeZoneInfo;
        @XmlElement(required = true)
        protected String maxPrice;
        @XmlElement(name = "EGRULStatementInfo", required = true)
        protected AttachmentType egrulStatementInfo;
        protected boolean isParticipant;
        protected boolean isSubcontractor;

        /**
         * Gets the value of the okopf property.
         * 
         * @return
         *     possible object is
         *     {@link OKOPFRef }
         *     
         */
        public OKOPFRef getOKOPF() {
            return okopf;
        }

        /**
         * Sets the value of the okopf property.
         * 
         * @param value
         *     allowed object is
         *     {@link OKOPFRef }
         *     
         */
        public void setOKOPF(OKOPFRef value) {
            this.okopf = value;
        }

        /**
         * Gets the value of the majorTaxPayerKPP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMajorTaxPayerKPP() {
            return majorTaxPayerKPP;
        }

        /**
         * Sets the value of the majorTaxPayerKPP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMajorTaxPayerKPP(String value) {
            this.majorTaxPayerKPP = value;
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
         * Gets the value of the egrulStatementInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentType }
         *     
         */
        public AttachmentType getEGRULStatementInfo() {
            return egrulStatementInfo;
        }

        /**
         * Sets the value of the egrulStatementInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentType }
         *     
         */
        public void setEGRULStatementInfo(AttachmentType value) {
            this.egrulStatementInfo = value;
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

        /**
         * Gets the value of the isSubcontractor property.
         * 
         */
        public boolean isIsSubcontractor() {
            return isSubcontractor;
        }

        /**
         * Sets the value of the isSubcontractor property.
         * 
         */
        public void setIsSubcontractor(boolean value) {
            this.isSubcontractor = value;
        }

    }

}

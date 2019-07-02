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
import ru.gov.zakupki.eruz.common._1.InternationalPassportRFType;
import ru.gov.zakupki.eruz.common._1.PassportRFType;
import ru.gov.zakupki.eruz.common._1.PersonType;


/**
 * Тип: Сведения о лицах, имеющих право без доверенности действовать от имени юридического лица
 * 
 * <p>Java class for informationPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informationPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameInfo" type="{http://zakupki.gov.ru/eruz/common/1}personType"/>
 *         &lt;element name="position" type="{http://zakupki.gov.ru/eruz/base/1}positionType"/>
 *         &lt;element name="identityDocInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="passportRFInfo" type="{http://zakupki.gov.ru/eruz/common/1}passportRFType"/>
 *                   &lt;element name="internationalPassportRFInfo" type="{http://zakupki.gov.ru/eruz/common/1}internationalPassportRFType"/>
 *                   &lt;element name="passportForeignInfo" type="{http://zakupki.gov.ru/eruz/types/1}passportForeignType"/>
 *                   &lt;element name="sojournPermitInfo" type="{http://zakupki.gov.ru/eruz/types/1}sojournPermitType"/>
 *                   &lt;element name="permamentResidencyInfo" type="{http://zakupki.gov.ru/eruz/types/1}permamentResidencyType"/>
 *                 &lt;/choice>
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
@XmlType(name = "informationPersonType", propOrder = {
    "nameInfo",
    "position",
    "identityDocInfo"
})
@XmlSeeAlso({
    ru.gov.zakupki.eruz.types._1.LegalEntityForeignStateNotInRAFPType.InformationPersons.InformationPersonInfo.class,
    ru.gov.zakupki.eruz.types._1.LegalEntityRFType.InformationPersons.InformationPersonInfo.class
})
public class InformationPersonType {

    @XmlElement(required = true)
    protected PersonType nameInfo;
    @XmlElement(required = true)
    protected String position;
    @XmlElement(required = true)
    protected InformationPersonType.IdentityDocInfo identityDocInfo;

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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the identityDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InformationPersonType.IdentityDocInfo }
     *     
     */
    public InformationPersonType.IdentityDocInfo getIdentityDocInfo() {
        return identityDocInfo;
    }

    /**
     * Sets the value of the identityDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationPersonType.IdentityDocInfo }
     *     
     */
    public void setIdentityDocInfo(InformationPersonType.IdentityDocInfo value) {
        this.identityDocInfo = value;
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
     *       &lt;choice>
     *         &lt;element name="passportRFInfo" type="{http://zakupki.gov.ru/eruz/common/1}passportRFType"/>
     *         &lt;element name="internationalPassportRFInfo" type="{http://zakupki.gov.ru/eruz/common/1}internationalPassportRFType"/>
     *         &lt;element name="passportForeignInfo" type="{http://zakupki.gov.ru/eruz/types/1}passportForeignType"/>
     *         &lt;element name="sojournPermitInfo" type="{http://zakupki.gov.ru/eruz/types/1}sojournPermitType"/>
     *         &lt;element name="permamentResidencyInfo" type="{http://zakupki.gov.ru/eruz/types/1}permamentResidencyType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passportRFInfo",
        "internationalPassportRFInfo",
        "passportForeignInfo",
        "sojournPermitInfo",
        "permamentResidencyInfo"
    })
    public static class IdentityDocInfo {

        protected PassportRFType passportRFInfo;
        protected InternationalPassportRFType internationalPassportRFInfo;
        protected PassportForeignType passportForeignInfo;
        protected SojournPermitType sojournPermitInfo;
        protected PermamentResidencyType permamentResidencyInfo;

        /**
         * Gets the value of the passportRFInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PassportRFType }
         *     
         */
        public PassportRFType getPassportRFInfo() {
            return passportRFInfo;
        }

        /**
         * Sets the value of the passportRFInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassportRFType }
         *     
         */
        public void setPassportRFInfo(PassportRFType value) {
            this.passportRFInfo = value;
        }

        /**
         * Gets the value of the internationalPassportRFInfo property.
         * 
         * @return
         *     possible object is
         *     {@link InternationalPassportRFType }
         *     
         */
        public InternationalPassportRFType getInternationalPassportRFInfo() {
            return internationalPassportRFInfo;
        }

        /**
         * Sets the value of the internationalPassportRFInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link InternationalPassportRFType }
         *     
         */
        public void setInternationalPassportRFInfo(InternationalPassportRFType value) {
            this.internationalPassportRFInfo = value;
        }

        /**
         * Gets the value of the passportForeignInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PassportForeignType }
         *     
         */
        public PassportForeignType getPassportForeignInfo() {
            return passportForeignInfo;
        }

        /**
         * Sets the value of the passportForeignInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassportForeignType }
         *     
         */
        public void setPassportForeignInfo(PassportForeignType value) {
            this.passportForeignInfo = value;
        }

        /**
         * Gets the value of the sojournPermitInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SojournPermitType }
         *     
         */
        public SojournPermitType getSojournPermitInfo() {
            return sojournPermitInfo;
        }

        /**
         * Sets the value of the sojournPermitInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SojournPermitType }
         *     
         */
        public void setSojournPermitInfo(SojournPermitType value) {
            this.sojournPermitInfo = value;
        }

        /**
         * Gets the value of the permamentResidencyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PermamentResidencyType }
         *     
         */
        public PermamentResidencyType getPermamentResidencyInfo() {
            return permamentResidencyInfo;
        }

        /**
         * Sets the value of the permamentResidencyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PermamentResidencyType }
         *     
         */
        public void setPermamentResidencyInfo(PermamentResidencyType value) {
            this.permamentResidencyInfo = value;
        }

    }

}

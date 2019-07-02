//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 04:13:19 PM MSK 
//


package ru.gov.zakupki.oos.export._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.eruz.nsi._1.NsiUserType;
import ru.gov.zakupki.eruz.types._1.ContractorExcludeType;
import ru.gov.zakupki.eruz.types._1.ContractorType;


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
 *         &lt;choice>
 *           &lt;element name="eruzContractor" type="{http://zakupki.gov.ru/eruz/types/1}contractorType"/>
 *           &lt;element name="eruzContractorExclude" type="{http://zakupki.gov.ru/eruz/types/1}contractorExcludeType"/>
 *           &lt;element name="nsiUserList">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nsiUser" type="{http://zakupki.gov.ru/eruz/nsi/1}nsiUserType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
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
    "eruzContractor",
    "eruzContractorExclude",
    "nsiUserList"
})
@XmlRootElement(name = "export")
public class Export {

    protected ContractorType eruzContractor;
    protected ContractorExcludeType eruzContractorExclude;
    protected Export.NsiUserList nsiUserList;

    /**
     * Gets the value of the eruzContractor property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorType }
     *     
     */
    public ContractorType getEruzContractor() {
        return eruzContractor;
    }

    /**
     * Sets the value of the eruzContractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorType }
     *     
     */
    public void setEruzContractor(ContractorType value) {
        this.eruzContractor = value;
    }

    /**
     * Gets the value of the eruzContractorExclude property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorExcludeType }
     *     
     */
    public ContractorExcludeType getEruzContractorExclude() {
        return eruzContractorExclude;
    }

    /**
     * Sets the value of the eruzContractorExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorExcludeType }
     *     
     */
    public void setEruzContractorExclude(ContractorExcludeType value) {
        this.eruzContractorExclude = value;
    }

    /**
     * Gets the value of the nsiUserList property.
     * 
     * @return
     *     possible object is
     *     {@link Export.NsiUserList }
     *     
     */
    public Export.NsiUserList getNsiUserList() {
        return nsiUserList;
    }

    /**
     * Sets the value of the nsiUserList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export.NsiUserList }
     *     
     */
    public void setNsiUserList(Export.NsiUserList value) {
        this.nsiUserList = value;
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
     *         &lt;element name="nsiUser" type="{http://zakupki.gov.ru/eruz/nsi/1}nsiUserType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nsiUser"
    })
    public static class NsiUserList {

        protected List<NsiUserType> nsiUser;

        /**
         * Gets the value of the nsiUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nsiUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNsiUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NsiUserType }
         * 
         * 
         */
        public List<NsiUserType> getNsiUser() {
            if (nsiUser == null) {
                nsiUser = new ArrayList<NsiUserType>();
            }
            return this.nsiUser;
        }

    }

}

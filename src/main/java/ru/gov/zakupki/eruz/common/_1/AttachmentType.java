//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 04:14:17 PM MSK 
//


package ru.gov.zakupki.eruz.common._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.eruz.base._1.SignatureType;


/**
 * Тип: Прикрепленный документ
 * 
 * <p>Java class for attachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publishedContentId" type="{http://zakupki.gov.ru/eruz/base/1}guidType" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://zakupki.gov.ru/eruz/base/1}fileNameType"/>
 *         &lt;element name="fileSize" type="{http://zakupki.gov.ru/eruz/base/1}fileSizeType" minOccurs="0"/>
 *         &lt;element name="docDescription" type="{http://zakupki.gov.ru/eruz/base/1}text4000Type" minOccurs="0"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="url" type="{http://zakupki.gov.ru/eruz/base/1}hrefType"/>
 *           &lt;element name="contentId" type="{http://zakupki.gov.ru/eruz/base/1}guidType"/>
 *           &lt;element name="content">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                 &lt;minLength value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="cryptoSigns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="signature" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                           &lt;attribute name="type" type="{http://zakupki.gov.ru/eruz/base/1}signatureType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "attachmentType", propOrder = {
    "publishedContentId",
    "fileName",
    "fileSize",
    "docDescription",
    "docDate",
    "url",
    "contentId",
    "content",
    "cryptoSigns"
})
public class AttachmentType {

    protected String publishedContentId;
    @XmlElement(required = true)
    protected String fileName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fileSize;
    protected String docDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    protected String url;
    protected String contentId;
    protected byte[] content;
    protected AttachmentType.CryptoSigns cryptoSigns;

    /**
     * Gets the value of the publishedContentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedContentId() {
        return publishedContentId;
    }

    /**
     * Sets the value of the publishedContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedContentId(String value) {
        this.publishedContentId = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileSize(BigInteger value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the docDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDescription() {
        return docDescription;
    }

    /**
     * Sets the value of the docDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDescription(String value) {
        this.docDescription = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
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

    /**
     * Gets the value of the contentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentId(String value) {
        this.contentId = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Gets the value of the cryptoSigns property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType.CryptoSigns }
     *     
     */
    public AttachmentType.CryptoSigns getCryptoSigns() {
        return cryptoSigns;
    }

    /**
     * Sets the value of the cryptoSigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType.CryptoSigns }
     *     
     */
    public void setCryptoSigns(AttachmentType.CryptoSigns value) {
        this.cryptoSigns = value;
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
     *         &lt;element name="signature" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *                 &lt;attribute name="type" type="{http://zakupki.gov.ru/eruz/base/1}signatureType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "signature"
    })
    public static class CryptoSigns {

        @XmlElement(required = true)
        protected List<AttachmentType.CryptoSigns.Signature> signature;

        /**
         * Gets the value of the signature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSignature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentType.CryptoSigns.Signature }
         * 
         * 
         */
        public List<AttachmentType.CryptoSigns.Signature> getSignature() {
            if (signature == null) {
                signature = new ArrayList<AttachmentType.CryptoSigns.Signature>();
            }
            return this.signature;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
         *       &lt;attribute name="type" type="{http://zakupki.gov.ru/eruz/base/1}signatureType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Signature {

            @XmlValue
            protected byte[] value;
            @XmlAttribute(name = "type")
            protected SignatureType type;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setValue(byte[] value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link SignatureType }
             *     
             */
            public SignatureType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link SignatureType }
             *     
             */
            public void setType(SignatureType value) {
                this.type = value;
            }

        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:51:32 PM MSK 
//


package ru.gov.zakupki.eruz.esmv.printform._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.gov.zakupki.eruz.esmv.types._1.TRequestPA;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gov.zakupki.eruz.esmv.printform._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestPA_QNAME = new QName("http://zakupki.gov.ru/eruz/esmv/printform/1", "requestPA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gov.zakupki.eruz.esmv.printform._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRequestPA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/eruz/esmv/printform/1", name = "requestPA")
    public JAXBElement<TRequestPA> createRequestPA(TRequestPA value) {
        return new JAXBElement<TRequestPA>(_RequestPA_QNAME, TRequestPA.class, null, value);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.05 at 03:11:16 PM CET 
//


package com.rubenlaguna.en4j.jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}timestamp" minOccurs="0"/>
 *         &lt;element ref="{}file-name" minOccurs="0"/>
 *         &lt;element ref="{}attachment" minOccurs="0"/>
 *         &lt;element ref="{}source-url" minOccurs="0"/>
 *         &lt;element ref="{}reco-type" minOccurs="0"/>
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
    "timestamp",
    "fileName",
    "attachment",
    "sourceUrl",
    "recoType"
})
@XmlRootElement(name = "resource-attributes")
public class ResourceAttributes {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String timestamp;
    @XmlElement(name = "file-name")
    protected String fileName;
    protected Boolean attachment;
    @XmlElement(name = "source-url")
    @XmlSchemaType(name = "anyURI")
    protected String sourceUrl;
    @XmlElement(name = "reco-type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String recoType;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
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
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachment(Boolean value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the sourceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Sets the value of the sourceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUrl(String value) {
        this.sourceUrl = value;
    }

    /**
     * Gets the value of the recoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoType() {
        return recoType;
    }

    /**
     * Sets the value of the recoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoType(String value) {
        this.recoType = value;
    }

}

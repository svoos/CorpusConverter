//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.21 at 08:20:56 AM MESZ 
//
// Based on the XML schmema: corpusV1_1.xsd
// Reference: http://framenet.icsi.berkeley.edu
//


package framenet.corpus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sentences"
})
@XmlRootElement(name = "paragraph")
public class Paragraph {

    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String documentOrder;
    @XmlElement(required = true)
    protected Sentences sentences;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the documentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentOrder() {
        return documentOrder;
    }

    /**
     * Sets the value of the documentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentOrder(String value) {
        this.documentOrder = value;
    }

    /**
     * Gets the value of the sentences property.
     * 
     * @return
     *     possible object is
     *     {@link Sentences }
     *     
     */
    public Sentences getSentences() {
    	if (sentences == null) {
    		sentences = new Sentences();
    	}
        return sentences;
    }

    /**
     * Sets the value of the sentences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sentences }
     *     
     */
    public void setSentences(Sentences value) {
        this.sentences = value;
    }

    public void addSentence(Sentence sentence) {
    	this.getSentences().getSentence().add(sentence);
    }
}

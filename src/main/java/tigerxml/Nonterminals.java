//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.15 at 01:54:55 PM MEZ 
//
// Based on the XML schmema: TigerXMLSubcorpus.xsd
// Reference: http://www.coli.uni-saarland.de/projects/salsa/
//


package tigerxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nonterminalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonterminalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nt" type="{}ntType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonterminalsType", propOrder = {
    "nt"
})
public class Nonterminals {

    protected List<Nt> nt;

    /**
     * Gets the value of the nt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nt }
     * 
     * 
     */
    public List<Nt> getNt() {
        if (nt == null) {
            nt = new ArrayList<Nt>();
        }
        return this.nt;
    }

	public void addNonterminal(Nt nonterminal) {
		getNt().add(nonterminal);
	}

}
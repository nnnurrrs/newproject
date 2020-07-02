
package kz.kazpost.webservices.newproject.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="TNS_JDBC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p_iin" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "tnsjdbc",
    "pIin"
})
@XmlRootElement(name = "DelEmployeeInfoRequest", namespace = "http://webservices.kazpost.kz/newproject/schema")
public class DelEmployeeInfoRequest {

    @XmlElement(name = "TNS_JDBC", namespace = "http://webservices.kazpost.kz/newproject/schema", defaultValue = "PREVDAY")
    protected String tnsjdbc;
    @XmlElement(name = "p_iin", namespace = "http://webservices.kazpost.kz/newproject/schema")
    protected int pIin;

    /**
     * Gets the value of the tnsjdbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNSJDBC() {
        return tnsjdbc;
    }

    /**
     * Sets the value of the tnsjdbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNSJDBC(String value) {
        this.tnsjdbc = value;
    }

    /**
     * Gets the value of the pIin property.
     * 
     */
    public int getPIin() {
        return pIin;
    }

    /**
     * Sets the value of the pIin property.
     * 
     */
    public void setPIin(int value) {
        this.pIin = value;
    }

}

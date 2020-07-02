
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
 *         &lt;element name="pId_iin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p_dep_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="p_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p_surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p_department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p_prim" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pIdIin",
    "pDepId",
    "pName",
    "pSurname",
    "pDepartment",
    "pPrim"
})
@XmlRootElement(name = "EmployeeInfoRequest", namespace = "http://webservices.kazpost.kz/newproject/schema")
public class EmployeeInfoRequest {

    @XmlElement(name = "TNS_JDBC", namespace = "http://webservices.kazpost.kz/newproject/schema", defaultValue = "PREVDAY")
    protected String tnsjdbc;
    @XmlElement(name = "pId_iin", namespace = "http://webservices.kazpost.kz/newproject/schema")
    protected int pIdIin;
    @XmlElement(name = "p_dep_id", namespace = "http://webservices.kazpost.kz/newproject/schema")
    protected Integer pDepId;
    @XmlElement(name = "p_name", namespace = "http://webservices.kazpost.kz/newproject/schema", required = true)
    protected String pName;
    @XmlElement(name = "p_surname", namespace = "http://webservices.kazpost.kz/newproject/schema", required = true)
    protected String pSurname;
    @XmlElement(name = "p_department", namespace = "http://webservices.kazpost.kz/newproject/schema", required = true)
    protected String pDepartment;
    @XmlElement(name = "p_prim", namespace = "http://webservices.kazpost.kz/newproject/schema", required = true)
    protected String pPrim;

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
     * Gets the value of the pIdIin property.
     * 
     */
    public int getPIdIin() {
        return pIdIin;
    }

    /**
     * Sets the value of the pIdIin property.
     * 
     */
    public void setPIdIin(int value) {
        this.pIdIin = value;
    }

    /**
     * Gets the value of the pDepId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDepId() {
        return pDepId;
    }

    /**
     * Sets the value of the pDepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDepId(Integer value) {
        this.pDepId = value;
    }

    /**
     * Gets the value of the pName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPName() {
        return pName;
    }

    /**
     * Sets the value of the pName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPName(String value) {
        this.pName = value;
    }

    /**
     * Gets the value of the pSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSurname() {
        return pSurname;
    }

    /**
     * Sets the value of the pSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSurname(String value) {
        this.pSurname = value;
    }

    /**
     * Gets the value of the pDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDepartment() {
        return pDepartment;
    }

    /**
     * Sets the value of the pDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDepartment(String value) {
        this.pDepartment = value;
    }

    /**
     * Gets the value of the pPrim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPrim() {
        return pPrim;
    }

    /**
     * Sets the value of the pPrim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPrim(String value) {
        this.pPrim = value;
    }

}

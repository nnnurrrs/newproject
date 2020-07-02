
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
 *         &lt;element ref="{http://webservices.kazpost.kz/newproject/schema}ResponseInfo"/>
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
    "responseInfo"
})
@XmlRootElement(name = "DelEmployeeInfoResponse", namespace = "http://webservices.kazpost.kz/newproject/schema")
public class DelEmployeeInfoResponse {

    @XmlElement(name = "ResponseInfo", namespace = "http://webservices.kazpost.kz/newproject/schema", required = true)
    protected ResponseInfo responseInfo;

    /**
     * Gets the value of the responseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseInfo }
     *     
     */
    public ResponseInfo getResponseInfo() {
        return responseInfo;
    }

    /**
     * Sets the value of the responseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseInfo }
     *     
     */
    public void setResponseInfo(ResponseInfo value) {
        this.responseInfo = value;
    }

}

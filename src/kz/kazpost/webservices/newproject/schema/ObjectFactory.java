
package kz.kazpost.webservices.newproject.schema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.kazpost.webservices.newproject.schema package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kz.kazpost.webservices.newproject.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseInfo }
     * 
     */
    public ResponseInfo createResponseInfo() {
        return new ResponseInfo();
    }

    /**
     * Create an instance of {@link EmployeeInfoRequest }
     * 
     */
    public EmployeeInfoRequest createEmployeeInfoRequest() {
        return new EmployeeInfoRequest();
    }

    /**
     * Create an instance of {@link DelEmployeeInfoRequest }
     * 
     */
    public DelEmployeeInfoRequest createDelEmployeeInfoRequest() {
        return new DelEmployeeInfoRequest();
    }

    /**
     * Create an instance of {@link EmployeeInfoResponse }
     * 
     */
    public EmployeeInfoResponse createEmployeeInfoResponse() {
        return new EmployeeInfoResponse();
    }

    /**
     * Create an instance of {@link DelEmployeeInfoResponse }
     * 
     */
    public DelEmployeeInfoResponse createDelEmployeeInfoResponse() {
        return new DelEmployeeInfoResponse();
    }

}

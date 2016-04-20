
package com.bizruntime.wsdl.customerservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bizruntime.wsdl.customerservice package. 
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

    private final static QName _LookupCustomer_QNAME = new QName("http://bizruntime.com/wsdl/CustomerService/", "lookupCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://bizruntime.com/wsdl/CustomerService/", "updateCustomerResponse");
    private final static QName _GetCustomerStatus_QNAME = new QName("http://bizruntime.com/wsdl/CustomerService/", "getCustomerStatus");
    private final static QName _GetCustomerStatusResponse_QNAME = new QName("http://bizruntime.com/wsdl/CustomerService/", "getCustomerStatusResponse");
    private final static QName _UpdateCustomer_QNAME = new QName("http://bizruntime.com/wsdl/CustomerService/", "updateCustomer");
    private final static QName _LookupCustomerResponse_QNAME = new QName("http://bizruntime.com/wsdl/CustomerService/", "lookupCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bizruntime.wsdl.customerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LookupCustomer }
     * 
     */
    public LookupCustomer createLookupCustomer() {
        return new LookupCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerStatus }
     * 
     */
    public GetCustomerStatus createGetCustomerStatus() {
        return new GetCustomerStatus();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerStatusResponse }
     * 
     */
    public GetCustomerStatusResponse createGetCustomerStatusResponse() {
        return new GetCustomerStatusResponse();
    }

    /**
     * Create an instance of {@link LookupCustomerResponse }
     * 
     */
    public LookupCustomerResponse createLookupCustomerResponse() {
        return new LookupCustomerResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bizruntime.com/wsdl/CustomerService/", name = "lookupCustomer")
    public JAXBElement<LookupCustomer> createLookupCustomer(LookupCustomer value) {
        return new JAXBElement<LookupCustomer>(_LookupCustomer_QNAME, LookupCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bizruntime.com/wsdl/CustomerService/", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bizruntime.com/wsdl/CustomerService/", name = "getCustomerStatus")
    public JAXBElement<GetCustomerStatus> createGetCustomerStatus(GetCustomerStatus value) {
        return new JAXBElement<GetCustomerStatus>(_GetCustomerStatus_QNAME, GetCustomerStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bizruntime.com/wsdl/CustomerService/", name = "getCustomerStatusResponse")
    public JAXBElement<GetCustomerStatusResponse> createGetCustomerStatusResponse(GetCustomerStatusResponse value) {
        return new JAXBElement<GetCustomerStatusResponse>(_GetCustomerStatusResponse_QNAME, GetCustomerStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bizruntime.com/wsdl/CustomerService/", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bizruntime.com/wsdl/CustomerService/", name = "lookupCustomerResponse")
    public JAXBElement<LookupCustomerResponse> createLookupCustomerResponse(LookupCustomerResponse value) {
        return new JAXBElement<LookupCustomerResponse>(_LookupCustomerResponse_QNAME, LookupCustomerResponse.class, null, value);
    }

}

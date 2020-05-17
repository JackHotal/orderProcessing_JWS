
package opjwsclient.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the opjwsclient.service package. 
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

    private final static QName _Purchase_QNAME = new QName("http://opjws/", "Purchase");
    private final static QName _GetCustomerOrdersResponse_QNAME = new QName("http://opjws/", "getCustomerOrdersResponse");
    private final static QName _GetProductIds_QNAME = new QName("http://opjws/", "getProductIds");
    private final static QName _GetCustomerResponse_QNAME = new QName("http://opjws/", "getCustomerResponse");
    private final static QName _GetProductIdsResponse_QNAME = new QName("http://opjws/", "getProductIdsResponse");
    private final static QName _GetProductDetailResponse_QNAME = new QName("http://opjws/", "getProductDetailResponse");
    private final static QName _SayHelloWorldFromResponse_QNAME = new QName("http://opjws/", "sayHelloWorldFromResponse");
    private final static QName _GetCustomer_QNAME = new QName("http://opjws/", "getCustomer");
    private final static QName _GetProductDetail_QNAME = new QName("http://opjws/", "getProductDetail");
    private final static QName _PurchaseResponse_QNAME = new QName("http://opjws/", "PurchaseResponse");
    private final static QName _SayHelloWorldFrom_QNAME = new QName("http://opjws/", "sayHelloWorldFrom");
    private final static QName _GetOrderDetails_QNAME = new QName("http://opjws/", "getOrderDetails");
    private final static QName _GetCustomerOrders_QNAME = new QName("http://opjws/", "getCustomerOrders");
    private final static QName _GetOrderDetailsResponse_QNAME = new QName("http://opjws/", "getOrderDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: opjwsclient.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link Purchase }
     * 
     */
    public Purchase createPurchase() {
        return new Purchase();
    }

    /**
     * Create an instance of {@link GetCustomerOrdersResponse }
     * 
     */
    public GetCustomerOrdersResponse createGetCustomerOrdersResponse() {
        return new GetCustomerOrdersResponse();
    }

    /**
     * Create an instance of {@link GetProductIds }
     * 
     */
    public GetProductIds createGetProductIds() {
        return new GetProductIds();
    }

    /**
     * Create an instance of {@link GetProductDetailResponse }
     * 
     */
    public GetProductDetailResponse createGetProductDetailResponse() {
        return new GetProductDetailResponse();
    }

    /**
     * Create an instance of {@link GetProductIdsResponse }
     * 
     */
    public GetProductIdsResponse createGetProductIdsResponse() {
        return new GetProductIdsResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFromResponse }
     * 
     */
    public SayHelloWorldFromResponse createSayHelloWorldFromResponse() {
        return new SayHelloWorldFromResponse();
    }

    /**
     * Create an instance of {@link PurchaseResponse }
     * 
     */
    public PurchaseResponse createPurchaseResponse() {
        return new PurchaseResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFrom }
     * 
     */
    public SayHelloWorldFrom createSayHelloWorldFrom() {
        return new SayHelloWorldFrom();
    }

    /**
     * Create an instance of {@link GetProductDetail }
     * 
     */
    public GetProductDetail createGetProductDetail() {
        return new GetProductDetail();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerOrders }
     * 
     */
    public GetCustomerOrders createGetCustomerOrders() {
        return new GetCustomerOrders();
    }

    /**
     * Create an instance of {@link GetOrderDetails }
     * 
     */
    public GetOrderDetails createGetOrderDetails() {
        return new GetOrderDetails();
    }

    /**
     * Create an instance of {@link GetOrderDetailsResponse }
     * 
     */
    public GetOrderDetailsResponse createGetOrderDetailsResponse() {
        return new GetOrderDetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Purchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "Purchase")
    public JAXBElement<Purchase> createPurchase(Purchase value) {
        return new JAXBElement<Purchase>(_Purchase_QNAME, Purchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getCustomerOrdersResponse")
    public JAXBElement<GetCustomerOrdersResponse> createGetCustomerOrdersResponse(GetCustomerOrdersResponse value) {
        return new JAXBElement<GetCustomerOrdersResponse>(_GetCustomerOrdersResponse_QNAME, GetCustomerOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getProductIds")
    public JAXBElement<GetProductIds> createGetProductIds(GetProductIds value) {
        return new JAXBElement<GetProductIds>(_GetProductIds_QNAME, GetProductIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getProductIdsResponse")
    public JAXBElement<GetProductIdsResponse> createGetProductIdsResponse(GetProductIdsResponse value) {
        return new JAXBElement<GetProductIdsResponse>(_GetProductIdsResponse_QNAME, GetProductIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getProductDetailResponse")
    public JAXBElement<GetProductDetailResponse> createGetProductDetailResponse(GetProductDetailResponse value) {
        return new JAXBElement<GetProductDetailResponse>(_GetProductDetailResponse_QNAME, GetProductDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "sayHelloWorldFromResponse")
    public JAXBElement<SayHelloWorldFromResponse> createSayHelloWorldFromResponse(SayHelloWorldFromResponse value) {
        return new JAXBElement<SayHelloWorldFromResponse>(_SayHelloWorldFromResponse_QNAME, SayHelloWorldFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getCustomer")
    public JAXBElement<GetCustomer> createGetCustomer(GetCustomer value) {
        return new JAXBElement<GetCustomer>(_GetCustomer_QNAME, GetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getProductDetail")
    public JAXBElement<GetProductDetail> createGetProductDetail(GetProductDetail value) {
        return new JAXBElement<GetProductDetail>(_GetProductDetail_QNAME, GetProductDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "PurchaseResponse")
    public JAXBElement<PurchaseResponse> createPurchaseResponse(PurchaseResponse value) {
        return new JAXBElement<PurchaseResponse>(_PurchaseResponse_QNAME, PurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "sayHelloWorldFrom")
    public JAXBElement<SayHelloWorldFrom> createSayHelloWorldFrom(SayHelloWorldFrom value) {
        return new JAXBElement<SayHelloWorldFrom>(_SayHelloWorldFrom_QNAME, SayHelloWorldFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getOrderDetails")
    public JAXBElement<GetOrderDetails> createGetOrderDetails(GetOrderDetails value) {
        return new JAXBElement<GetOrderDetails>(_GetOrderDetails_QNAME, GetOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getCustomerOrders")
    public JAXBElement<GetCustomerOrders> createGetCustomerOrders(GetCustomerOrders value) {
        return new JAXBElement<GetCustomerOrders>(_GetCustomerOrders_QNAME, GetCustomerOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opjws/", name = "getOrderDetailsResponse")
    public JAXBElement<GetOrderDetailsResponse> createGetOrderDetailsResponse(GetOrderDetailsResponse value) {
        return new JAXBElement<GetOrderDetailsResponse>(_GetOrderDetailsResponse_QNAME, GetOrderDetailsResponse.class, null, value);
    }

}

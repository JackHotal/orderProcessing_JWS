package opjws;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import oplib.Order;
import java.util.List;



@WebService()
public class OPService {

    Order mdb;

    public OPService() {  mdb = new Order("ism6236","ism6236bo");  }

  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

    @WebMethod
    public int Purchase(String cid, List<String> od) {
        return mdb.Purchase(cid, od);
    }
    @WebMethod
    public List<String> getOrderDetails(String oid)  {
        return mdb.getOrderDetails(oid);
    }
    @WebMethod
    public List<String> getCustomerOrders(String id)  {
        return mdb.getCustomerOrders(id);
    }
    @WebMethod
    public String getCustomer(String id)  {
        return mdb.getCustomer(id);
    }
    @WebMethod
    public List<String> getProductIds()  {
        return mdb.getProductIds();
    }
    @WebMethod
    public String getProductDetail(String id) {
        return mdb.getProductDetail(id);
    }



  public static void main(String[] argv) {
    Object implementor = new OPService ();
    String address = "http://localhost:9000/OPService";
    Endpoint.publish(address, implementor);
  }
}

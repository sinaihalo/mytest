package webservce;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;


@WebService
public class ServceTest {

    public String getMessage(String name) {
        return name+"你过来一下";
    }


    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/MyService", new ServceTest());//发布服务
        System.out.println("ServiceTest已启动");
    }
}

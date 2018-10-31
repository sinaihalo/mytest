package httpclientwebservice;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by garfield on 2016/10/12.
 */
public class TestWebService {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        //拼接xml请求,带有请求头
        String params = "<id>5</id>";//随手举个例子,类似...
        /*String soapRequestData = "<soapenv:Envelope \n" +
                "\txmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" \n" +
                "\txmlns:ser=\"http://service.resource.ws.bd.newland.com/\">\n" +
                "   <soapenv:Header>\n" +
                "\t<serviceCode>serviceCode</serviceCode>\n" +
                "\t<userName>userName</userName>\n" +
                "\t<authCode>authCode</authCode>\n" +
                "   </soapenv:Header>\n" +
                "   <soapenv:Body>\n" +
                "      <ser:function>\n" +
                params +
                "      </ser:function>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>\n";*/
        String soapRequestData = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://webservce/\">"
        +"<soapenv:Header/>"
        +"<soapenv:Body>"
        +"<web:getMessage>"
        +" <!--Optional:-->"
        +"<arg0>hello</arg0>"
        +"</web:getMessage>"
        +"</soapenv:Body>"
        +"</soapenv:Envelope>";
        try {
            String method = "http://localhost:8080/MyService";//比如http://192.177.222.222:8888/services/Service_Name/Function_Name
            PostMethod postMethod = new PostMethod(method);
            byte[] b = soapRequestData.getBytes("utf-8");
            InputStream is = new ByteArrayInputStream(b, 0, b.length);
            RequestEntity re = new InputStreamRequestEntity(is, b.length, "application/soap+xml; charset=utf-8");
            postMethod.setRequestEntity(re);

            HttpClient httpClient = new HttpClient();
            int statusCode = httpClient.executeMethod(postMethod);
            //200说明正常返回数据
            if (statusCode != 200) {
                //internet error
                System.out.println(statusCode);
            }
            soapRequestData = postMethod.getResponseBodyAsString();
            System.out.println(soapRequestData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

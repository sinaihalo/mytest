package webservce;

import webservceclient.ServceTestService;

public class ClientTest {

	public static void main(String[] args) {
		webservceclient.ServceTest serviceTest =  new ServceTestService().getServceTestPort();//初始化对象
        String body = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:q0=\"http://com.wpx\" "
                + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
                + "<soapenv:Body>"
                + "<q0:myMethod>"
                + "<name>wpx</name>"
                + "</q0:myMethod>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";
		String name = serviceTest.getMessage(body);//调用服务端方法
        System.out.println(name);//打印返回结果
	}

}

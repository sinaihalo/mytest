package wbtst;

import qq.QqOnlineWebService;
import qq.QqOnlineWebServiceSoap;

public class QqOnlineTest {

	public static void main(String[] args) {
		//String s = qqCheckOnline();
		QqOnlineWebServiceSoap qol = new QqOnlineWebService().getQqOnlineWebServiceSoap();
		String s = qol.qqCheckOnline("1070274893");
		System.out.println(s);
	}

}

package Exception;

import java.awt.List;

public class PrintStackAndGetMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    		List list = null;
    	    list.add("1");
    		System.out.println("1");
	} catch (Exception e) {
		System.out.println(e);
		System.out.println(e.getLocalizedMessage());
		System.out.println(e.getStackTrace());
		StackTraceElement[] st = e.getStackTrace();
		for(StackTraceElement s:st){
			System.out.println(s.getClassName()+" "+s.getMethodName()+" "+s.getLineNumber());
		}
		System.out.println(e.fillInStackTrace());
		e.printStackTrace();
		System.out.println("空指针："+e.getMessage());
	
	}
	System.out.println(1234);
	}

}

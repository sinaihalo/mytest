package process;

import java.io.IOException;

public class OpenBaidu {
	 public static void main(String[] args) {  
	        try {  
	              
	            String exeFullPathName="C:/Program Files/Internet Explorer/IEXPLORE.EXE";  
	            String message="www.baidu.com";  
	            String []cmd={exeFullPathName,message};  
	            Process proc=Runtime.getRuntime().exec(cmd);  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	  
	    }  
}

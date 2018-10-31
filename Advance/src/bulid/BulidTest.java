package bulid;

import java.util.ArrayList;

public class BulidTest {

	
		  
	    public static void main(String[] args) {  
	  
	        //存放run顺序  
	        ArrayList<String> sequence = new ArrayList<String>();  
	        sequence.add("engine boom");  
	        sequence.add("start");  
	        sequence.add("stop");  
	        //要用这个顺序造一辆奔驰  
	        BenzBuilder benzBuilder = new BenzBuilder();  
	        //把顺序给奔驰组装者  
	        benzBuilder.setSequence(sequence);  
	        //奔驰组装者拿到顺序后就给你生产一辆来  
	        BenzModel benz = (BenzModel) benzBuilder.getCarModel();  
	        benz.run();  
	    }  
	  
	}  


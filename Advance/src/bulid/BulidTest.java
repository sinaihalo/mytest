package bulid;

import java.util.ArrayList;

public class BulidTest {

	
		  
	    public static void main(String[] args) {  
	  
	        //���run˳��  
	        ArrayList<String> sequence = new ArrayList<String>();  
	        sequence.add("engine boom");  
	        sequence.add("start");  
	        sequence.add("stop");  
	        //Ҫ�����˳����һ������  
	        BenzBuilder benzBuilder = new BenzBuilder();  
	        //��˳���������װ��  
	        benzBuilder.setSequence(sequence);  
	        //������װ���õ�˳���͸�������һ����  
	        BenzModel benz = (BenzModel) benzBuilder.getCarModel();  
	        benz.run();  
	    }  
	  
	}  


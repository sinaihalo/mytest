package prototype;

import java.util.ArrayList;

public class Prototype implements Cloneable {
	private ArrayList list = new ArrayList(); 
	public Prototype clone(){
		 Prototype prototype = null;    
	        try{    
	            //Object类的clone方法只会拷贝对象中的基本的数据类型
	        	prototype = (Prototype)super.clone();
	        	//深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝
	            prototype.list = (ArrayList) this.list.clone();
	        }catch(CloneNotSupportedException e){    
	            e.printStackTrace();    
	        }    
	        return prototype;  
		
	}
}

package bulid;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {  
	  
    private BenzModel benz = new BenzModel(); //奔驰车模型  
      
    @Override  
    public void setSequence(ArrayList<String> sequence) {  
        this.benz.setSequence(sequence); //设置奔驰车模型的运行顺序  
    }  
  
    @Override  
    public CarModel getCarModel() {  
        return this.benz; //将这个模型返回  
    }  
}  

package bulid;

import java.util.ArrayList;

public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();  
    private BenzBuilder benzBuilder = new BenzBuilder();  
    //private BWMBuilder bwmBuilder = new BWMBuilder();  
   // private CarBuilder cb =   
    //A顺序的奔驰车  
    public BenzModel getABenzModel() {  
        this.sequence.clear();  
        this.sequence.add("start");  
        this.sequence.add("stop");  
        //返回A顺序的奔驰车  
        this.benzBuilder.setSequence(sequence);  
        return (BenzModel) this.benzBuilder.getCarModel();  
    }  
      
    //B顺序的奔驰车  
    public BenzModel getBBenzModel() {  
        this.sequence.clear();  
        this.sequence.add("engine boom");  
        this.sequence.add("start");  
        this.sequence.add("stop");  
        //返回B顺序的奔驰车  
        this.benzBuilder.setSequence(sequence);  
        return (BenzModel) this.benzBuilder.getCarModel();  
    }  
      
   
  
    
      
    //还有很多其他需求，设计师嘛，想啥需求就给你弄啥需求  
}

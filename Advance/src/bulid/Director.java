package bulid;

import java.util.ArrayList;

public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();  
    private BenzBuilder benzBuilder = new BenzBuilder();  
    //private BWMBuilder bwmBuilder = new BWMBuilder();  
   // private CarBuilder cb =   
    //A˳��ı��۳�  
    public BenzModel getABenzModel() {  
        this.sequence.clear();  
        this.sequence.add("start");  
        this.sequence.add("stop");  
        //����A˳��ı��۳�  
        this.benzBuilder.setSequence(sequence);  
        return (BenzModel) this.benzBuilder.getCarModel();  
    }  
      
    //B˳��ı��۳�  
    public BenzModel getBBenzModel() {  
        this.sequence.clear();  
        this.sequence.add("engine boom");  
        this.sequence.add("start");  
        this.sequence.add("stop");  
        //����B˳��ı��۳�  
        this.benzBuilder.setSequence(sequence);  
        return (BenzModel) this.benzBuilder.getCarModel();  
    }  
      
   
  
    
      
    //���кܶ������������ʦ���ɶ����͸���Ūɶ����  
}

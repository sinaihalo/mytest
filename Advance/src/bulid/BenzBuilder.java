package bulid;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {  
	  
    private BenzModel benz = new BenzModel(); //���۳�ģ��  
      
    @Override  
    public void setSequence(ArrayList<String> sequence) {  
        this.benz.setSequence(sequence); //���ñ��۳�ģ�͵�����˳��  
    }  
  
    @Override  
    public CarModel getCarModel() {  
        return this.benz; //�����ģ�ͷ���  
    }  
}  

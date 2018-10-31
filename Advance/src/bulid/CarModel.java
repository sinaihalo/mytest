package bulid;

import java.util.ArrayList;

public abstract class CarModel {  
    
    private ArrayList<String> sequence = new ArrayList<String>(); //ά��һ��ArrayList����ִ������ؼ���  
      
    protected abstract void start();  
    protected abstract void stop();  
    protected abstract void alarm();  
    protected abstract void engineBoom();  
      
    final public void run() {  
        for(int i = 0; i < this.sequence.size(); i ++) { //����ArrayList�б����˳��ִ����Ӧ�Ķ���  
            String actionName = this.sequence.get(i);  
            if(actionName.equalsIgnoreCase("start")) {  
                this.start(); //��������  
            } else if(actionName.equalsIgnoreCase("stop")) {  
                this.stop(); //ֹͣ����  
            } else if(actionName.equalsIgnoreCase("alarm")) {  
                this.alarm(); //��������  
            } else if(actionName.equalsIgnoreCase("engine boom")) {  
                this.engineBoom(); //��������  
            }  
        }  
    }  
      
    final public void setSequence(ArrayList<String> sequence) { //���ִ��˳��������һ��ArrayList  
        this.sequence = sequence;  
    }  
}  
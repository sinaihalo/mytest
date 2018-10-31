package bulid;

import java.util.ArrayList;

public abstract class CarModel {  
    
    private ArrayList<String> sequence = new ArrayList<String>(); //维护一个ArrayList保存执行命令关键字  
      
    protected abstract void start();  
    protected abstract void stop();  
    protected abstract void alarm();  
    protected abstract void engineBoom();  
      
    final public void run() {  
        for(int i = 0; i < this.sequence.size(); i ++) { //根据ArrayList中保存的顺序执行相应的动作  
            String actionName = this.sequence.get(i);  
            if(actionName.equalsIgnoreCase("start")) {  
                this.start(); //启动汽车  
            } else if(actionName.equalsIgnoreCase("stop")) {  
                this.stop(); //停止汽车  
            } else if(actionName.equalsIgnoreCase("alarm")) {  
                this.alarm(); //汽车鸣笛  
            } else if(actionName.equalsIgnoreCase("engine boom")) {  
                this.engineBoom(); //汽车轰鸣  
            }  
        }  
    }  
      
    final public void setSequence(ArrayList<String> sequence) { //获得执行顺序的命令，即一个ArrayList  
        this.sequence = sequence;  
    }  
}  
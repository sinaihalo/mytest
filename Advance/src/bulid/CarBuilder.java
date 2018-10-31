package bulid;

import java.util.ArrayList;

public abstract class CarBuilder {
	//建造一个模型，你要给我一个顺序要求  
    public abstract void setSequence(ArrayList<String> sequence);  
    //设置完毕顺序后，就可以直接拿到这个车辆模型了  
    public abstract CarModel getCarModel();
}

package bulid;

import java.util.ArrayList;

public abstract class CarBuilder {
	//����һ��ģ�ͣ���Ҫ����һ��˳��Ҫ��  
    public abstract void setSequence(ArrayList<String> sequence);  
    //�������˳��󣬾Ϳ���ֱ���õ��������ģ����  
    public abstract CarModel getCarModel();
}

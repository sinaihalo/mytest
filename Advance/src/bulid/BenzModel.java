package bulid;

public class BenzModel extends CarModel {  
	  
    @Override  
    protected void start() {  
        System.out.println("������������");  
    }  
  
    @Override  
    protected void stop() {  
        System.out.println("����ֹͣ����");  
    }  
  
    @Override  
    protected void alarm() {  
        System.out.println("�������ѡ���");  
    }  
  
    @Override  
    protected void engineBoom() {  
        System.out.println("���ۺ���");  
    }  
  
}  
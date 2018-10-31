package InvocationHandler;

//抽象角色（动态代理只能代理接口）
public interface Subject {
	public void request(String t,String d);  
}

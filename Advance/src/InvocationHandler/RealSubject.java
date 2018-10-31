package InvocationHandler;

public class RealSubject implements Subject{

	@Override
	public void request(String t,String d) {
		// TODO Auto-generated method stub
		System.out.println(t+"From real subject."+d); 
	}

}

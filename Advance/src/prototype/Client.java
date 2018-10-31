package prototype;

public class Client {

	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for(int i=0; i< 10; i++){    
            ConcretePrototype clcp = (ConcretePrototype) cp.clone();
            clcp.show();
        } 
	}

}

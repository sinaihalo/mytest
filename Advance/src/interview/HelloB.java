package interview;
/**
	static A
	static B
	I am A class
	HelloA
	I am B class
	HelloB
	
	1.静态块，加载类
 	2.{}初始化块，创建对象
 	3.构造器
 	4.先父类后子类
 	5.一个类中static可以有多个
 *
 */
public class HelloB extends HelloA{
	public HelloB(){
		System.out.println("HelloB");
	}
	{System.out.println("I am B class");}
	static{System.out.println("static B");}
	static{System.out.println("static B1");}
	public static void main(String[] args) {
		new HelloB();

	}

}

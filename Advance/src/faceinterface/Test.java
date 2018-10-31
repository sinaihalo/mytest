package faceinterface;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<GodClass> list = new ArrayList<>();
		ClassA a = new ClassA();
		a.setA(1);
		ClassB b = new ClassB();
		b.setA(1);
		b.setB(2);
		ClassB b1 = new ClassB();
		b1.setA(11);
		b1.setB(22);
		list.add(b1);
		list.add(b);
		list.add(a);
		for (GodClass godClass : list) {
			if(godClass instanceof  ClassA){
				System.out.println(godClass);
				System.out.println("I am A");
			}
			if(godClass instanceof  ClassB){
				System.out.println(godClass);
				System.out.println("I am B");
			}
		}
	}

}

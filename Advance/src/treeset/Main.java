package treeset;

import java.util.TreeSet;

public class Main {
	/**
	 * 排序10000，10001size,加一个，remove最后一个
	 * @param args
	 */
	public static void main(String[] args) {
		
		  TreeSet<Person> ts = new TreeSet<>();
		  
	        ts.add(new Person("张三", 23));
	        ts.add(new Person("李四", 13));
	        ts.add(new Person("周七", 13));
	        ts.add(new Person("王五", 43));
	        ts.add(new Person("赵六", 33));
	        
	        System.out.println(ts);
	    
	}
}

package interview;
/**
 * a和b都指向了方法区里面的同一个字符串，引用值相等；当相同的字符串被创建多次，内存中只保存一份字符串常量值
 *  true
	true
	false
	true
 *
 */

public class StringTest {

	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(c.equals("hello"));
	}
}

package interview;
/**
 * 
 *  3
	48
	32
	0
 * 十进制转二进制：除2后倒着取0和1
 * & 1 1为1，有0 则 0
 */
public class BinaryAndBitoperation {

	public static void main(String[] args) {
		System.out.println(foo(50));
		System.out.println(50&49);
		System.out.println(48&47);
		System.out.println(32&31);

	}
	public static int foo(int x){
		int count =0;
		while(x>0){
			count++;
			x=x&(x-1);
		}
		return count;
	}

}

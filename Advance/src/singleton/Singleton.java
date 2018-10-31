package singleton;
/**
 * 指令重排序
 * 优化指令，提高程序运行效率。
 * 例如：
 * 分配对象的内存空间、 初始化对象、设置instance指向刚分配的内存地址
 * 后两个可能互换，在多线程下会导致得到未被完全初始化的实例
 *
 */
public class Singleton {
	//1.5 后volatile变量禁止指令重排序
	private static volatile Singleton singleton;
	private Singleton(){}
	//延迟初始化；在方法上加sync会影响性能，只在初始化的时候同步，双重检查加锁（DCL）
	public static Singleton getSingleton(){
		if(singleton==null){
			synchronized (Singleton.class) {
				if(singleton==null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}
}

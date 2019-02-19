package classloadertest;

public class TestClassLoader {

	public static void main(String[] args) {
		//application class loader,sun.misc.Launcher$AppClassLoader@73d16e93
        System.out.println(ClassLoader.getSystemClassLoader());
        //extensions class loader,sun.misc.Launcher$ExtClassLoader@15db9742
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        //bootstrap class loader,null,C++实现,在java中获取不到
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());

	}

}

package thread.threadlocal;

public class Test {
	ThreadLocal<Long> longLocal = new ThreadLocal<Long>();  
	ThreadLocal<String> stringLocal = new ThreadLocal<String>(); 
	 public void set() {  
	        longLocal.set(Thread.currentThread().getId());  
	        stringLocal.set(Thread.currentThread().getName());
	 }
	 public long getLong() {  
	        return longLocal.get();  
	    }  
	 public String getString() {  
	        return stringLocal.get();  
	    } 
	 public static void main(String[] args) throws InterruptedException {  
	        final Test test = new Test();  
	        test.set();  
	        System.out.println("main,long:"+test.getLong());  
	        System.out.println("main,string:"+test.getString()); 
	        Thread thread1 = new Thread() {  
	            public void run() {  
	                test.set();  
	                System.out.println("thread1,long:"+test.getLong());  
	                System.out.println("thread1,string:"+test.getString());  
	            };  
	        };  
	        thread1.start();  
	        //thread1.join();  
	        System.out.println("main,long:"+test.getLong());  
	        System.out.println("main,string:"+test.getString());  
	   }
}

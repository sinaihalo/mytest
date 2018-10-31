package thread;

public class ThreadTest{

	public static void main(String[] args) {
		
		new Thread(){
			public void run(){
				for (int x = 0; x < 5; x++) {
				 System.out.println(Thread.currentThread().getName() + "--" + x);
				 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	              
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (int x = 0; x < 5; x++) {
				 System.out.println(Thread.currentThread().getName() + "--" + x);
				 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	              
				}
			}
		}.start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				for (int x = 0; x < 5; x++) {
					 System.out.println(Thread.currentThread().getName() + "--" + x);
					 try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					 }
			}
			}).start();
	}
	/*控制台输出：
	 * Thread-0--0
	Thread-1--0
	Thread-2--0
	Thread-2--1
	Thread-1--1
	Thread-0--1
	Thread-1--2
	Thread-2--2
	Thread-0--2
	Thread-0--3
	Thread-1--3
	Thread-2--3
	Thread-2--4
	Thread-1--4
	Thread-0--4*/
}

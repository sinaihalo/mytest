package schedulepool;

import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *1.scheduleAtFixedRate如果执行时间小于指定的间隔时间的情况下，callable或runnable每隔period执行一次，如果执行时间大于指定的间隔时间，每隔程序执行时间执行一次。
  2.scheduleWithFixedDelay,不管执行时间怎么样，两次执行时间之间必须间隔delay时间。
 */
public class SchedulePool {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		//scheduleAtFixedRate(service,10000);
        //scheduleAtFixedRate(service,20000);

		scheduleWithFixedDelay(service,1000);
        //scheduleWithFixedDelay(service,6000);
	}
	private static void scheduleAtFixedRate(ScheduledExecutorService service, final int sleepTime){
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                long start = new Date().getTime();
                System.out.println("scheduleAtFixedRate 开始执行时间:" +
                        DateFormat.getTimeInstance().format(new Date()));
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long end = new Date().getTime();
                System.out.println("scheduleAtFixedRate 执行花费时间=" + (end -start)/1000 + "m");
                System.out.println("scheduleAtFixedRate 执行完成时间："
                        + DateFormat.getTimeInstance().format(new Date()));
                System.out.println("======================================");
            }
        },1000,10000,TimeUnit.MILLISECONDS);
    }
	 private static void scheduleWithFixedDelay(ScheduledExecutorService service,final int sleepTime){
	        service.scheduleWithFixedDelay(new Runnable() {
	            @Override
	            public void run() {
	                long start = new Date().getTime();
	                System.out.println("scheduleWithFixedDelay 开始执行时间:" +
	                        DateFormat.getTimeInstance().format(new Date()));
	                try {
	                    Thread.sleep(sleepTime);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                long end = new Date().getTime();
	                System.out.println("scheduleWithFixedDelay执行花费时间=" + (end -start)/1000 + "m");
	                System.out.println("scheduleWithFixedDelay执行完成时间："
	                        + DateFormat.getTimeInstance().format(new Date()));
	                System.out.println("======================================");
	            }
	        },1000,5000,TimeUnit.MILLISECONDS);
	    }
	
}

package quartz;
import java.util.Date;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleExample {

	public static void main(String[] args) throws Exception {

	    SimpleExample example = new SimpleExample();
	    example.run();

	  }

	private void run() throws SchedulerException {
		//Logger log = LoggerFactory.getLogger(SimpleExample.class);

	    System.out.println("------- Initializing ----------------------");

	    // First we must get a reference to a scheduler
	    SchedulerFactory sf = new StdSchedulerFactory();
	    Scheduler sched = sf.getScheduler();

	    System.out.println("------- Initialization Complete -----------");

	    // computer a time that is on the next round minute
	    //Date runTime = evenMinuteDate(new Date());

	    System.out.println("------- Scheduling Job  -------------------");

	    // define the job and tie it to our HelloJob class
	    JobDetail job = newJob(HelloJob.class).withIdentity("job2", "group2").build();

	    // Trigger the job to run on the next round minute
	    Trigger trigger = newTrigger().withIdentity("trigger2", "group2").withSchedule(cronSchedule("*/5 * * * * ?")).build();

	    // Tell quartz to schedule the job using our trigger
	    //sched.scheduleJob(job, trigger);
	    //System.out.println(job.getKey() + " will run at: " + runTime);

	    // Start up the scheduler (nothing can actually run until the
	    // scheduler has been started)
	    sched.resumeJob(job.getKey());
	    sched.start();

	    System.out.println("------- Started Scheduler -----------------");

	    // wait long enough so that the scheduler as an opportunity to
	    // run the job!
	    System.out.println("------- Waiting 65 seconds... -------------");
	    try {
	      // wait 65 seconds to show job
	      Thread.sleep(65L * 1000L);
	      // executing...
	    } catch (Exception e) {
	      //
	    }

	    // shut down the scheduler
	    System.out.println("------- Shutting Down ---------------------");
	    sched.shutdown(true);
	    System.out.println("------- Shutdown Complete -----------------");
		
	}
}

package templatemethod;

public abstract class AbatractTask {
	public void init(){
		System.out.println("------------init-------------");
		execTask();
	}
	public abstract void execTask();
}

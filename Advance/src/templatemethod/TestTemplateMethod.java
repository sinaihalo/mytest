package templatemethod;

public class TestTemplateMethod {

	public static void main(String[] args) {
		AbatractTask at = new IpmiTask();
		at.init();
		AbatractTask at1 = new ShhTask();
		at1.init();
	}

}

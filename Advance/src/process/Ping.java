package process;

import java.io.InputStream;

public class Ping {

	public static void main(String[] args) {
	        Runtime run = Runtime.getRuntime();
	        try {
	            // run.exec("cmd /k shutdown -s -t 3600");www.baidu.com
	            Process process = run.exec("ping 1.2.3.4");
	            InputStream in = process.getInputStream();
	            while (in.read() != -1) {
	                System.out.println(in.read());
	            }
	            in.close();
	            process.waitFor();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}

}

package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessApi {
		 public static void main(String[] args) {
		        String s;
		        StringBuilder sb = new StringBuilder();
		        InputStream fis = null;
		        try {
		            Process process = Runtime.getRuntime().exec("ping localhost");
		            fis = process.getInputStream();
		            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis,"gbk")); 
		            while((s=bufferedReader.readLine()) != null) {
		                sb.append(s);
		                sb.append("\n");
		            }
		            System.out.println(sb.toString());
		            process.waitFor();
		            System.out.println(process.exitValue());
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                fis.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }
	}


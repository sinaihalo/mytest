package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcessTest {

	public static void main(String[] args) throws InterruptedException {
		BufferedReader br=null;   
        StringBuffer sb = new StringBuffer();
		try {   
            //tasklist：打印进程信息
        	Process process=Runtime.getRuntime().exec("ipconfig -all");   
            br=new BufferedReader(new InputStreamReader(process.getInputStream(),"gbk"));   
            @SuppressWarnings("unused")   
            String line=null;   
            System.out.println("打印进程信息");   
            while((line=br.readLine())!=null){   
                sb.append(line);  
                sb.append("\n"); 
            } 
            System.out.println(sb.toString());
            Pattern p = Pattern.compile("以太网适配器 以太网:\\s+\\S+.*\\s+\\S+.*\\s+物理地址. . . . . . . . . . . . . :\\s(\\S+)");
            Matcher match = p.matcher(sb);
            if(match.find()){
            	System.out.println("mac地址："+match.group(1));//mac地址：D4-81-D7-A5-C9-05
            }
            process.waitFor();
            System.out.println(process.exitValue());
        } catch (IOException e) {   
            e.printStackTrace();   
        }finally{   
            if(br!=null){   
                try {   
                    br.close();   
                } catch (Exception e) {   
                    e.printStackTrace();   
                }   
            }   

	}
	}
	}

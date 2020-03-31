package telnet;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.SocketException;

import org.apache.commons.net.telnet.TelnetClient;

public class TelnetClientTest {

    public static void main(String[] args){

        try {
        	TelnetClient tc = new TelnetClient("VT220");
        	tc.connect("192.168.182.212", 2323);
        	InputStream in = tc.getInputStream();
        	OutputStream os = tc.getOutputStream();
            
            System.out.print(readUntil(":", in));
            
            writeUtil("ultra", os);
            System.out.print(readUntil(":", in));
            
            writeUtil("ultra", os);
            System.out.print(readUntil("$", in));
            
            
            writeUtil("pwd", os);
            System.out.print(readUntil("$", in));
            
            writeUtil("cd /", os);
            System.out.print(readUntil("$", in));
            
            writeUtil("ll ", os);
            System.out.print(readUntil("$", in));
            
            writeUtil("\03h", os);
            System.out.print(readUntil("$", in));
            
            writeUtil("\1D", os);
            System.out.print(readUntil("$", in));
            
            
            writeUtil("\004", os);
            System.out.print(readUntil("$", in));
            
            
            
            //System.out.println(0x1d&0x1f);
            tc.disconnect();
            in.close();
            //os.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
        	
        }
        

    }
    
    /**
     * 写入命令方法
     * @param cmd
     * @param os
     */
    public static void writeUtil(String cmd, OutputStream os){
        try {
            cmd = cmd + "\n";
            os.write(cmd.getBytes());
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * 读到指定位置,不在向下读
     * @param endFlag
     * @param in
     * @return
     */
    public static String readUntil(String endFlag, InputStream in) {
        
        InputStreamReader isr = new InputStreamReader(in);
        
        char[] charBytes = new char[1024];
        int n = 0;
        boolean flag = false;
        String str = "";
        try {
            while((n = isr.read(charBytes)) != -1){
                for(int i=0; i< n; i++){
                    char c = (char)charBytes[i];
                    str += c;
                    //当拼接的字符串以指定的字符串结尾时,不在继续读
                    if(str.endsWith(endFlag)){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return str;
    }
}


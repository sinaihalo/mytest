package telnet;

import java.io.IOException;

import de.mud.telnet.TelnetWrapper;

public class Obmtelnet extends TelnetWrapper{

	 byte[] buf = new byte[10 * 1024];
	 String shellPrompt;
	public static void main(String[] args) {
		try {
			Obmtelnet tw = new Obmtelnet();
			tw.connect("9.83.11.100", 23);
			tw.shellPrompt = ":";
			System.out.println(tw.recvResp1());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	 public String recvResp1() throws IOException {
		 String rs = "";
	        while (true) {
	            int n = in.read(buf);
	            if (n < 0)
	                throw new IOException("Recvice data from telnet server " + host + " error.");
	            String s = new String(buf, 0, n);
	            rs += s;
	            if (s.toLowerCase().indexOf("more") != -1) {
	                out.write("                           ".getBytes());
	                out.write("\n".getBytes());
	            }
	            if (isTermianl(s)) {
	                if (rs.toLowerCase().indexOf("more") != -1) {
	                    rs = rs.replaceAll("--[M|m]ore--[^a-zA-Z0-9/\\-\\%_]+", "");
	                }
	                return rs;
	            }
	        }
	    }
	 private boolean isTermianl(String buf) {

	        int promptLen = shellPrompt.length();
	        int bufLen = buf.length();
	        if (promptLen > bufLen)
	            return false;

	        String last = buf.substring(bufLen - promptLen, bufLen);
	        if (shellPrompt.equals(last)) {
	            return true;
	        } else {
	            // 末尾包含一个空格的提示符
	            String spacePrompt = shellPrompt + " ";
	            promptLen = spacePrompt.length();
	            if (promptLen > bufLen)
	                return false;
	            last = buf.substring(bufLen - promptLen, bufLen);
	            if (spacePrompt.equals(last))
	                return true;
	        }

	        return false;
	    }

}

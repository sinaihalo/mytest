package ssh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

//import org.apache.commons.lang.StringUtils;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

public class Ganyredssh {
	private static String DEFAULTCHART = "UTF-8";

private static Connection login(String ip, String username, String password) {
	boolean flag = false;
	Connection connection = null;
	try {
		connection = new Connection(ip);
		connection.connect();// 连接
		flag = connection.authenticateWithPassword(username, password);// 认证
		if (flag) {
			System.out.println("================登录成功==================");
			return connection;
			}
		} catch (IOException e) {
	System.out.println("=========登录失败=========" + e);
	connection.close();
	}
	return connection;
}


private static String execmd(Connection connection, String cmd) {
String result = "";
try{
if (connection != null) {
Session session = connection.openSession();// 打开一个会话
session.execCommand(cmd);// 执行命令
result = processStdout(session.getStdout(), DEFAULTCHART);
System.out.println(result);

connection.close();
session.close();
}
} catch (IOException e) {
System.out.println("执行命令失败,链接conn:" + connection + ",执行的命令：" + cmd + "  " + e);
e.printStackTrace();
}
return result;
}


private static String processStdout(InputStream in, String charset) {
InputStream stdout = new StreamGobbler(in);
StringBuffer buffer = new StringBuffer();

try {
BufferedReader br = new BufferedReader(new InputStreamReader(stdout, charset));
String line = null;
while ((line = br.readLine()) != null) {
buffer.append(line + "\n");
System.out.println(line);
}
br.close();
} catch (UnsupportedEncodingException e) {
System.out.println("解析脚本出错：" + e.getMessage());
e.printStackTrace();
} catch (IOException e) {
System.out.println("解析脚本出错：" + e.getMessage());
e.printStackTrace();
}
return buffer.toString();
}

public static void main(String[] args) {
long currentTimeMillis = System.currentTimeMillis();
String ip = "192.168.95.228";
String username = "user1";
String password = "Ultrapower_123";
String cmd = "show";
Connection connection = login(ip, username, password);
String execmd = execmd(connection, cmd);
System.out.println(execmd);
long currentTimeMillis1 = System.currentTimeMillis();
System.out.println("ganymed-ssh2方式"+(currentTimeMillis1-currentTimeMillis));
}
}

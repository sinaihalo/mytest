package jpython;

import java.util.Properties;

import org.python.util.PythonInterpreter;
/**
 * @version: 
* @Description:  导jar包：Jython  2.7.0
* @author: hxk 
* @date: 2020年4月2日下午2:41:37
 */
public class TestPython {
	 public static void main(String args[]) {
		 Properties props = new Properties();
		 //Jython jar包目录
		 props.put("python.home", "C:\\Users\\dell\\Desktop\\jars\\Lib");
		 props.put("python.console.encoding", "UTF-8");        
		 props.put("python.security.respectJavaAccessibility", "false");        
		 props.put("python.import.site", "false");

		 Properties preprops = System.getProperties();
		 PythonInterpreter.initialize(preprops, props, new String[0]);
		 
        PythonInterpreter interpreter = new PythonInterpreter();
        String script = new String();
        script+="import sys  ;";
        script+=" a = input('Enter a:') ;";
        script+=" b = input('Enter b:') ;";
        script+=" print('%s * %s = %s' %(a, b, a*b))";
        interpreter.exec(script);
	    }
}

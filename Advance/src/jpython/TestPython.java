package jpython;

import java.util.Properties;

import org.python.util.PythonInterpreter;

public class TestPython {
	 public static void main(String args[]) {
		 Properties props = new Properties();
		 props.put("python.home", "C:\\Users\\dell\\Desktop\\jars\\Lib");
		 props.put("python.console.encoding", "UTF-8");        
		         props.put("python.security.respectJavaAccessibility", "false");        
		 props.put("python.import.site", "false");

		 Properties preprops = System.getProperties();
		 PythonInterpreter.initialize(preprops, props, new String[0]);
		 
	        PythonInterpreter interpreter = new PythonInterpreter();
	        String script = new String();
	        script+="import sys  ;";
	        script+=" a = 2 ;";
	        script+=" b = 3 ;";
	        script+=" print('%s * %s = %s' %(a, b, a*b))";
	        interpreter.exec(script);
	    }
}

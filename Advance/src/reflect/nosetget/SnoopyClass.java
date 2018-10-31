package reflect.nosetget;

import java.lang.reflect.Field;

public class SnoopyClass {
	public static void main(String[] args) throws Exception, SecurityException {
		MyBean instance = new MyBean();
		setValue(instance,"message","Don't tell anyone");
		System.out.println("This message is "+getValue(instance,"message"));
	}

	private static Object getValue(MyBean instance, String fieldName) throws Exception, SecurityException {
		Field privateVal = instance.getClass().getDeclaredField(fieldName);
		privateVal.setAccessible(true);
		return privateVal.get(instance);
	}

	private static void setValue(MyBean instance, String fieldName, Object value) throws Exception, SecurityException {
		Field privateVal = instance.getClass().getDeclaredField(fieldName);
		privateVal.setAccessible(true);
		privateVal.set(instance, value);
	}
}

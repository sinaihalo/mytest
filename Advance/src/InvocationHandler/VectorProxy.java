package InvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class VectorProxy implements InvocationHandler {

	private Object obj;//这是动态代理的好处，被封装的对象是Object类型，接受任意类型的对象  
	  
    public VectorProxy()  
    {  
    }  
  
    public VectorProxy(Object obj)  
    {  
        this.obj = obj;  
    }  


    //这个方法不是我们显示的去调用  
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable  
    {  
        System.out.println("before calling " + method);  
  
        method.invoke(obj, args);  
  
        System.out.println("after calling " + method);  
  
        return null;  
    }  
}

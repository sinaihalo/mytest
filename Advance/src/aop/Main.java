package aop;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 通过对比前置 和 后置 拦截器，可以发现 具体协调各种通知 的 逻辑 实际是利用了 递归的思想。
后置拦截器为例: 先执行 递归方法 proceed()。最后从递归方法返回的时候 最后调用 后置方法。
 *
 */
public class Main {

	public static void main(String[] args) throws Throwable {
		new Main().aopchain();

	}
	 public void aopchain() throws Throwable {
	        List<MethodInterceptor> chain = new ArrayList();
	        //拦截器链，穿插这 放入 前置 和 后置 拦截器 。
	        chain.add(new AfterMethodInterceptor("1"));
	        chain.add(new BeforMethodInterceptor("1"));
	        chain.add(new AfterMethodInterceptor("2"));
	        chain.add(new BeforMethodInterceptor("2"));
	        chain.add(new AfterMethodInterceptor("3"));
	        chain.add(new BeforMethodInterceptor("3"));
	        //目标对象
	        TargetObj targetObj = new TargetObj();
	        //目标方法
	        Method method = TargetObj.class.getMethod("targetMethod");
	        DefaultMethodInvacation defaultMethodInvacation = new DefaultMethodInvacation(chain, targetObj, method, null);
	        //执行拦截器链
	        defaultMethodInvacation.process();
	    }
}

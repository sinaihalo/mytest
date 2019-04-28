package aop;

public interface MethodInterceptor {

	Object invoke(MethodInvocation mi) throws Throwable;
}

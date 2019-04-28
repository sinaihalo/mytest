package aop;

public class BeforMethodInterceptor implements MethodInterceptor {

	String identification;
    public BeforMethodInterceptor(String identification){
        this.identification = identification;
    }
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("执行前置通知"+identification);
        return mi.process();
    }

}

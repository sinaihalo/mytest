package aop;

public class AfterMethodInterceptor implements MethodInterceptor {

	String identification;
    public AfterMethodInterceptor(String identification){
        this.identification = identification;
    }
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        try {
            return mi.process();
        }finally {
            System.out.println("执行后置通知"+identification);
        }
    }

}

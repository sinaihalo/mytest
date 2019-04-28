package aop;

import java.lang.reflect.Method;
import java.util.List;

public class DefaultMethodInvacation implements MethodInvocation {

	List<MethodInterceptor> chian;
    Object target; //目标对象
    Method method; //目标方法
    Object[] args; //方法参数
    int currentChianIndex; //记录拦截器链当前执行位置
    public  DefaultMethodInvacation(List<MethodInterceptor> chian,Object target,Method method,Object[] args){
        this.chian = chian;
        this.method = method;
        this.target = target;
        this.args = args;
    }
    @Override
    public Object process() throws Throwable{
        Object value ;
        //如果 拦截器 执行完毕 执行 目标方法
        if(currentChianIndex == chian.size()){
            value = method.invoke(target, args);
            return value;
        }
        //获取下一个 拦截器
        MethodInterceptor methodInterceptor = chian.get(currentChianIndex++);
        //MethodInterceptor si = (MethodInterceptor) this;
        return methodInterceptor.invoke(this);
    }

}

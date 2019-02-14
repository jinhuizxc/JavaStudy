package designpattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        // 设置创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    /**
     * 拦截所有目标类方法的调用
     * @param obj  目标类的实例
     * @param method  目标方法的反射对象
     * @param objects  方法的参数
     * @param methodProxy  代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 代理类调用父类的方法
//        methodProxy.invoke(obj, objects);
        System.out.println("日志开始...");
        methodProxy.invokeSuper(obj, objects);
        System.out.println("日志结束...");
        return null;
    }
}

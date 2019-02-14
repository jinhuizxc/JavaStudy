package designpattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    /**
     *
     *
     * @param proxy  被代理对象
     * @param method   被代理对象的方法
     * @param args  方法的参数
     * @return  object 方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志开始...");
        method.invoke(target);
        System.out.println("日志结束...");
        return null;
    }
}

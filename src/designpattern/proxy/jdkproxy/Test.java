package designpattern.proxy.jdkproxy;

import designpattern.proxy.Car;
import designpattern.proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理测试类
 * <p>
 * 汽车开始行驶...
 * 汽车行驶中...
 * 汽车结束行驶...汽车行驶时间: 209毫秒!
 * <p>
 * // 动态代理记录日志、时间
 * 日志开始...
 * 汽车开始行驶...
 * 汽车行驶中...
 * 汽车结束行驶...汽车行驶时间: 25毫秒!
 * 日志结束...
 */
public class Test {

    public static void main(String[] args) {

        // 普通方法
        Car car = new Car();
        InvocationHandler timeHandler = new TimeHandler(car);
        Class<?> cls = car.getClass();
        /**
         * loader：被代理类的类加载器
         * interfaces：被代理类实现的接口
         * h：事务处理器
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), timeHandler);
        System.out.println("代理类名字: " + m.getClass().getName());
        m.move();

        // 动态代理记录时间、日志
//        SmallCar car = new SmallCar();
//        InvocationHandler timeHandler = new TimeHandler(car);
//        Moveable m = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), timeHandler);
//        InvocationHandler logHandler = new LogHandler(m);
//        Moveable m2 = (Moveable) Proxy.newProxyInstance(m.getClass().getClassLoader(), m.getClass().getInterfaces(), logHandler);
//        m2.move();

//        SmallCar car = new SmallCar();
//        Class carClass = car.getClass();
//        InvocationHandler timeHandler = new TimeHandler(car);
//        Moveable proxy = (Moveable) Proxy.newProxyInstance(carClass.getClassLoader(),
//                carClass.getInterfaces(), timeHandler);
//        InvocationHandler logHandler = new LogHandler(proxy);
//        Moveable proxy2 = (Moveable) Proxy.newProxyInstance(proxy.getClass().getClassLoader(),
//                proxy.getClass().getInterfaces(), logHandler);
//        proxy2.move();




    }
}

package designpattern.proxy;


/**
 * 代理模式
 *
 * 普通做法：
 * 汽车开始行驶...
 * 汽车行驶中...
 * 汽车结束行驶...汽车行驶时间: 692毫秒!
 *
 *  // 聚合方式,
 * // 先记录日志、时间
 * 日志开始...
 * 汽车开始行驶...
 * 汽车行驶中...
 * 汽车结束行驶...汽车行驶时间: 982毫秒!
 * 日志结束...
 *
 *  // 先记录时间、日志
 * 汽车开始行驶...
 * 日志开始...
 * 汽车行驶中...
 * 日志结束...
 * 汽车结束行驶...汽车行驶时间: 710毫秒!
 */
public class Test {

    public static void main(String[] args) {

        // 普通做法：
//        Car car = new Car();
//        car.move();

        // Car2 继承实现静态代理
//        Moveable m = new Car2();
//        m.move();

        // 通过聚合的方式实现静态代理
//        Car car = new Car();
//        Moveable car3 = new Car3(car);
//        car3.move();

        // 聚合方式,
        Car car = new Car();
        // 先记录日志、时间
//        CarTimeProxy ctp = new CarTimeProxy(car);
//        CarLogProxy clp = new CarLogProxy(ctp);
//        clp.move();
        // 先记录时间、日志
        CarLogProxy clp = new CarLogProxy(car);
        CarTimeProxy ctp = new CarTimeProxy(clp);
        ctp.move();


    }
}

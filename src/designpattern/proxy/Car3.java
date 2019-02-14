package designpattern.proxy;

/**
 * 聚合的方式实现静态代理
 * 一个类中调用另一个类
 *
 * 汽车开始行驶...
 * 汽车行驶中...
 * 汽车结束行驶...汽车行驶时间: 424毫秒!
 */
public class Car3 implements Moveable {

    private Car car;

    public Car3(Car car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        car.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...汽车行驶时间: " +(endTime - startTime)+ "毫秒!");
    }
}

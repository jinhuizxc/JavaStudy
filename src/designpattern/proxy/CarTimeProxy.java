package designpattern.proxy;

/**
 * 本类由car3复制而来
 * 汽车时间代理
 *
 * 由于代理类与被代理类实现的是同一接口
 * 所以将构造方法参数改为 Moveable
 */
public class CarTimeProxy implements Moveable {

    private Moveable m;

    public CarTimeProxy(Moveable m) {
        super();
        this.m = m;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        m.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...汽车行驶时间: " +(endTime - startTime)+ "毫秒!");
    }
}

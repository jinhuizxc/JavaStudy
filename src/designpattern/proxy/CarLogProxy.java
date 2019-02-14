package designpattern.proxy;

/**
 * 汽车日志的代理
 */
public class CarLogProxy implements Moveable {

    private Moveable m;

    public CarLogProxy(Moveable m) {
        super();
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("日志开始...");
        m.move();
        System.out.println("日志结束...");
    }
}

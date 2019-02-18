package designpattern.strategy;

import designpattern.strategy.impl.FlyNoWay;

/**
 * 大黄鸭
 */
public class BigYellow extends Duck {

    public BigYellow() {
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }

    /**
     * 一旦不重写该方法，在对象调用父类方法时会执行父类方法，
     * 而子类的行为需要重写该方法才能更改，如果疏忽忘记复写该方法，就会出现问题
     *
     * 为此可以通过定义叫声的接口进行实现（参考飞行行为）
     */
//    @Override
//    public void quack() {
//
//    }


}

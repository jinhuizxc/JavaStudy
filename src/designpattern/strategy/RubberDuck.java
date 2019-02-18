package designpattern.strategy;

import designpattern.strategy.impl.FlyNoWay;

/**
 * 橡胶鸭
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }

    @Override
    public void quack() {
//        super.quack();  实际开发中：通常是删除，不然会执行父类方法
        System.out.println("嘎~嘎~嘎~");
    }
}

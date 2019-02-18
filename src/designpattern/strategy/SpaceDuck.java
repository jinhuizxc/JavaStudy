package designpattern.strategy;

import designpattern.strategy.impl.FlyWithRocket;

/**
 * 太空鸭
 */
public class SpaceDuck extends Duck{

    public SpaceDuck() {
        setFlyingStrategy(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我头戴宇航头盔");
    }

    public void quack() {
        System.out.println("我通过无线电与你通信");
    }
}

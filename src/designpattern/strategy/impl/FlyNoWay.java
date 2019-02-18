package designpattern.strategy.impl;

import designpattern.strategy.FlyingStrategy;

public class FlyNoWay implements FlyingStrategy {

    @Override
    public void performFly() {
        System.out.println("我不会飞行！");
    }
}

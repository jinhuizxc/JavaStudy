package designpattern.strategy.impl;

import designpattern.strategy.FlyingStrategy;

public class FlyWithWin implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("振翅高飞！");
    }
}

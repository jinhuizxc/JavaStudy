package designpattern.strategy.impl;

import designpattern.strategy.FlyingStrategy;

/**
 * 太空鸭不能自主飞行，需要借助外力
 */
public class FlyWithRocket implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("用火箭在太空遨游");
    }
}

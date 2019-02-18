package designpattern.strategy;

import designpattern.strategy.impl.FlyWithWin;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}

package designpattern.strategy;

/**
 * 超类，所有的鸭子都要继承此类
 * 抽象了鸭子的行为：显示和鸣叫
 */
public abstract class Duck {

    /**
     * 方案三：组合
     * 将飞行行为抽象为接口，在父类中持有该接口，并由该接口代理飞行行为。
     */
    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    /**
     * 飞行方法
     */
    public void fly(){
       flyingStrategy.performFly();
    }

    /**
     * 鸭子发出叫声
     * 通用行为，由超类实现
     */
    public void quack(){
        System.out.println("嘎嘎嘎...");
    }

    /**
     * 显示鸭子的外观
     * 鸭子的外观各不相同，声明为abstract, 由子类实现
     */
    public abstract void display();


}

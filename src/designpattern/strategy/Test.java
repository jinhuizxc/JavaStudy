package designpattern.strategy;

/**
 * 测试鸭子程序
 * 我的脖子是绿色的
 * 嘎嘎嘎...
 * 振翅高飞！
 * 测试完毕
 *
 * 测试鸭子程序
 * **********************
 * 我的头是红色的
 * 嘎嘎嘎...
 * 振翅高飞！
 * **********************
 * 测试完毕
 *
 * 测试鸭子程序
 * **********************
 * 我全身发黄，嘴巴很红
 * 嘎~嘎~嘎~
 * 我不会飞行！
 * **********************
 * 测试完毕
 *
 * 测试鸭子程序
 * **********************
 * 我身体很大，全身黄黄
 * 嘎嘎嘎...
 * 我不会飞行！
 * **********************
 * 测试完毕
 *
 * 测试鸭子程序
 * **********************
 * 我头戴宇航头盔
 * 我通过无线电与你通信
 * 用火箭在太空遨游
 * **********************
 * 测试完毕
 *
 */
public class Test {

    private static Duck duck;

    public static void main(String[] args) {
        System.out.println("测试鸭子程序");
        System.out.println("**********************");
//        duck = new MallardDuck();
//        duck = new RedHeadDuck();
//        duck = new RubberDuck();
//        duck = new BigYellow();
        duck = new SpaceDuck();

        duck.display();
        duck.quack();
        duck.fly();
        System.out.println("**********************");
        System.out.println("测试完毕");
    }
}

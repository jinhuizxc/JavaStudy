package designpattern.template;

/**
 * 模板方法模式
 *
 * 制备咖啡...
 * 将水煮沸
 * 用沸水冲泡咖啡
 * 将饮料倒入杯中
 * 加入糖和牛奶
 * 咖啡好了!
 * *********************
 * 制备茶...
 * 将水煮沸
 * 用80°的热水斳浸泡茶叶5分钟
 * 将饮料倒入杯中
 * 加入柠檬
 * 茶好了!
 *
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("制备咖啡...");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("咖啡好了!");

        System.out.println("*********************");
        System.out.println("制备茶...");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("茶好了!");
    }
}

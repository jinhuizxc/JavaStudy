package designpattern.singleton;

/**
 * 饿汉模式
 *
 *
 * 饿汉式是在声明的时候就已经初始化Singleton1,确保了对象的唯一性
 * 声明的时候就初始化对象会浪费不必要的资源
 *
 */
public class Singleton1 {


    // 私有构造函数
    private Singleton1(){

    }

    private static Singleton1 singleton1 = new Singleton1();

    // 通过静态方法或枚举返回单例对象
    public static Singleton1 getInstance(){
        return singleton1;
    };
}

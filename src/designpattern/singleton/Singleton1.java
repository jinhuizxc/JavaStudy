package designpattern.singleton;

/**
 * 饿汉模式
 *
 *
 * 饿汉式是在声明的时候就已经初始化Singleton1,确保了对象的唯一性
 * 声明的时候就初始化对象会浪费不必要的资源
 *
 * 单例模式Singleton
 * 应用场合: 有些对象只需要一个就足够；
 * 作用： 保证整个应用程序中某个实例有且只有一个；
 * 类型： 饿汉模式、懒汉模式
 *
 */
public class Singleton1 {


    // 1.私有构造函数, 将构造方法私有化，不允许外部直接创建对象
    private Singleton1(){

    }

    /**
     * 饿汉式是在声明的时候就已经初始化Singleton1,确保了对象的唯一性
     * 声明的时候就初始化对象会浪费不必要的资源
     */
    // 2. 创建类的唯一实例, 使用private static修饰, 类被加载的时候调用
     private static Singleton1 instance = new Singleton1();

    // 通过静态方法或枚举返回单例对象
    // 3. 提供一个用于获取实例的方法, 使用public static修饰
    public static Singleton1 getInstance(){
        return instance;
    };
}

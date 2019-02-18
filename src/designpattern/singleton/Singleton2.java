package designpattern.singleton;

/**
 * 懒汉模式
 *
 *
 * getInstance 添加了synchronized 关键字,,也就是说 getInstance 是一个同步方法,
 * 这就是懒汉式在多线程中保持唯一性的方式
 * 懒汉式存在的问题是,即是instance已经被创建,每次调用getInstance方法还是会同步,这样就会浪费一些不必要的资源
 *
 */
public class Singleton2 {

    // 1.私有构造函数, 将构造方法私有化，不允许外部直接创建对象
    private Singleton2(){

    }

    // 2.创建类的唯一实例, 使用private static修饰
    private static Singleton2 singleton2;

    /**
     * getInstance 添加了synchronized 关键字,,也就是说 getInstance 是一个同步方法
     * 这就是懒汉式在多线程中保持唯一性的方式
     * 懒汉式存在的问题是,即是instance已经被创建,每次调用getInstance方法还是会同步,这样就会浪费一些不必要的资源
     *
     * @return
     */
    // 3.提供一个用于获取实例的方法, 使用public static修饰
    public static synchronized Singleton2 getInstance(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    };
}

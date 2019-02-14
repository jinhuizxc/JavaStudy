package designpattern.singleton;

/**
 * 静态内部类实现单例模式
 */
public class Singleton4 {


    /*
     *当第一次加载Singleton类时并不会初始化SINGLRTON,只有第一次调用getInstance方法的时候才会初始化SINGLETON
     *第一次调用getInstance 方法的时候虚拟机才会加载SingletonHoder类,这种方式不仅能够保证线程安全,也能够保证对象的唯一,
     *还延迟了单例的实例化,所以推荐使用这种方式
     *
     */
    public static Singleton4 getInstance(){
        return Singleton4.SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton4 instance = new Singleton4();
    }
}

package designpattern;

import designpattern.singleton.*;

/**
 * 关于java的设计模式：
 *
 *
 * 常用的五种单例模式实现方式
 * https://blog.csdn.net/username987654/article/details/79067583
 *
 * 反序列化时会重新生成对象的问题
 *
 * 已上几种方法里面 枚举任何一种情况都是单例,不存在这个问题,容器模式只是承载单例的容器所以它本身也不存在这个问题,只有其他三种方式种存在这个反序列话的问题,怎么解决呢?加入如下代码
 *
 * // 防止反序列化获取多个对象的漏洞
 * // 实现Serializable接口，当从I/O流中读取对象时，readResolve()方法都会被调用到
 * //用readResolve()中返回的对象直接替换在反序列化过程中创建的对象
 * private Singleton4 readResolve() throws ObjectStreamException {
 *     return SingletonHolder.SINGLETON;
 * }
 *
 * 1.单例模式
 *
 *
 * 2.工厂模式
 *
 * 3.适配器模式
 *
 * 4.代理模式
 *
 * 5.策略模式
 */
public class DesignPattern {

    public static void main(String[] args) {
        // 1. 单例模式,饿汉模式
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        if (s1 == s2){
            System.out.println("s1与s2是同一实例");  // s1与s2是同一实例
        }else {
            System.out.println("s1与s2不是同一实例");
        }
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        // 懒汉模式
        if (s3 == s4){
            System.out.println("s3与s4是同一实例");  // s3与s4是同一实例
        }else {
            System.out.println("s3与s4不是同一实例");
        }

        // Double check Lock(DCL模式)
        SingletonDCL singleton3 = SingletonDCL.getInstance();
        System.out.println("单例模式 singleton3 = " + singleton3);
        // 静态内部类实现单例模式
        Singleton4 singleton4 = Singleton4.getInstance();
        System.out.println("单例模式 singleton4 = " + singleton4);

        // 枚举实现单例
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        System.out.println("单例模式--->枚举实现单例 singletonEnum = " + singletonEnum);



        // 2. 适配器模式
        // 3. 代理模式
        // 4. 策略模式

    }
}

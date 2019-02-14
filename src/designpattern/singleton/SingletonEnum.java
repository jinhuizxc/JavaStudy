package designpattern.singleton;

/**
 * 枚举是写法最简单的
 * 默认枚举实例的创建时线程安全的,且在任何一种情况下它都是单例,包括反序列化
 */
public enum  SingletonEnum {

    INSTANCE;
}

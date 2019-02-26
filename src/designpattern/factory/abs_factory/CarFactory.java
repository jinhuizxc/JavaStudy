package designpattern.factory.abs_factory;

/**
 * 汽车工厂接口
 */
public interface CarFactory {

    // 大汽车
    BigCar getBigCar();
    // 小汽车
    SmallCar getSmallCar();
}

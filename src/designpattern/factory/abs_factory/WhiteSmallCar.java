package designpattern.factory.abs_factory;

/**
 * 黄色系的小汽车
 */
public class WhiteSmallCar implements SmallCar {
    @Override
    public void productSmallCar() {
        System.out.println("白色系小汽车");
    }
}

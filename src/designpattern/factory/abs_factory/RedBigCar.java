package designpattern.factory.abs_factory;

/**
 * 红色系的大汽车
 */
public class RedBigCar implements BigCar {
    @Override
    public void productBigCar() {
        System.out.println("红色系大汽车");
    }
}

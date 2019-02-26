package designpattern.factory.abs_factory;

public class RedSmallCar implements SmallCar {
    @Override
    public void productSmallCar() {
        System.out.println("红色系小汽车");
    }
}

package designpattern.factory.abs_factory;

public class WhiteBigCar implements BigCar {
    @Override
    public void productBigCar() {
        System.out.println("白色系大汽车");
    }
}

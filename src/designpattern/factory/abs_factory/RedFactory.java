package designpattern.factory.abs_factory;

public class RedFactory implements CarFactory {
    @Override
    public BigCar getBigCar() {
        return new RedBigCar();
    }

    @Override
    public SmallCar getSmallCar() {
        return new RedSmallCar() ;
    }
}

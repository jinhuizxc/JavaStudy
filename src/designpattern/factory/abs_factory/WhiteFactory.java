package designpattern.factory.abs_factory;

/**
 * 颜料加工厂
 */
public class WhiteFactory implements CarFactory{
    @Override
    public BigCar getBigCar() {
        return new WhiteBigCar();
    }

    @Override
    public SmallCar getSmallCar() {
        return new WhiteSmallCar();
    }
}

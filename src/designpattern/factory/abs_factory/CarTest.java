package designpattern.factory.abs_factory;

public class CarTest {

    public static void main(String[] args) {


        CarFactory white_car = new WhiteFactory();
        BigCar bigCar = white_car.getBigCar();
        bigCar.productBigCar();  // 白色系大汽车

        CarFactory red_car = new RedFactory();
        SmallCar smallCar = red_car.getSmallCar();
        smallCar.productSmallCar(); // 红色系小汽车
    }
}

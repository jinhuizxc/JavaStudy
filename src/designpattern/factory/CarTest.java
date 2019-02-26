package designpattern.factory;

public class CarTest {

    public static void main(String[] args) {
//        SmallCar a_car = new ACar();
//        a_car.run();
//        SmallCar b_car = new BCar();
//        b_car.run();

        // 创建工厂, 实现与客户端分离
        CarFactory carFactory = new CarFactory();
//        SmallCar a = carFactory.getCar("A");
//        a.run();
//        SmallCar b = carFactory.getCar("B");
//        b.run();

        // 通过反射获取类名
//        SmallCar car = carFactory.getCarByClass("designpattern.factory.ACar");
//        car.run();  // 结果：A级汽车, 速度100km/h

        // 通过创建file来找到className
//        SmallCar car = carFactory.getCarByClassKey("C");
//        car.run();  // 输出： C级汽车, 速度120km/h

        // 以上就是工厂方法模式

        // 接下来就是抽象工厂模式


    }
}

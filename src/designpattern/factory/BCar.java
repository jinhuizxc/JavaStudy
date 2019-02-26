package designpattern.factory;

/**
 * 速度中等汽车
 */
public class BCar implements Car {
    @Override
    public void run() {
        System.out.println("B级汽车, 速度150km/h");
    }
}

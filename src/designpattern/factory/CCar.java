package designpattern.factory;

public class CCar implements Car {
    @Override
    public void run() {
        System.out.println("C级汽车, 速度120km/h");
    }
}

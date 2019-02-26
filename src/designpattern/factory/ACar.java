package designpattern.factory;

/**
 * ACar 速度最低
 */
public class ACar implements Car {

    @Override
    public void run() {
        System.out.println("A级汽车, 速度100km/h");
    }
}

package designpattern.proxy;

import java.util.Random;

/**
 * 记录汽车行驶的时间
 *
 * 普通做法：
 * 汽车开始行驶...
 * 汽车行驶中...
 * 汽车结束行驶...汽车行驶时间: 692毫秒!
 *
 */
public class Car implements Moveable {
    @Override
    public void move() {

//        long startTime = System.currentTimeMillis();
//        System.out.println("汽车开始行驶...");
        // 实现开车, 睡眠1s
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        long endTime = System.currentTimeMillis();
//        System.out.println("汽车结束行驶...汽车行驶时间: " +(endTime - startTime)+ "毫秒!");
    }
}

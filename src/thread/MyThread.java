package thread;


public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("创建一个线程 = " + Thread.currentThread().getName());  // 创建一个线程 = Thread-0
    }
}

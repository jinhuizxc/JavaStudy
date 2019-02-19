package thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("创建一个线程 = " + Thread.currentThread().getName());  // 创建一个线程 = Thread-1
    }
}

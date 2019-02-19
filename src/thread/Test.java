package thread;

/**
 * 线程的基本使用
 */
public class Test {

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();  // 创建线程
//        myThread.start();   // 启动启程
//
//        MyRunnable myThread1 = new MyRunnable();
//        Thread thread = new Thread(myThread1);  // 创建线程
//        thread.start();   // 启动启程

        // 创建3个线程，模拟三个窗口卖票
        TicketThread tt1 = new TicketThread("窗口1");
        TicketThread tt2 = new TicketThread("窗口2");
        TicketThread tt3 = new TicketThread("窗口3");
        // 启动3个线程，开始卖票
//        tt1.start();
//        tt2.start();
//        tt3.start();
        // 这种方式结果能卖出15张票，不是想要的结果

        // 测试Runnable卖票, 共享5张票
        TicketRunnable tr = new TicketRunnable();
        // 创建3个窗口来模拟3个售票窗口
        Thread t1 = new Thread(tr, "窗口1");
        Thread t2 = new Thread(tr, "窗口2");
        Thread t3 = new Thread(tr, "窗口3");
        // 启动3个线程，开始卖票
        t1.start();
        t2.start();
        t3.start();
        // 测试Runnable卖票, 都卖5张票
//        TicketRunnable tr1 = new TicketRunnable();
//        TicketRunnable tr2 = new TicketRunnable();
//        TicketRunnable tr3 = new TicketRunnable();
//        // 创建3个窗口来模拟3个售票窗口
//        Thread t1 = new Thread(tr1, "窗口1");
//        Thread t2 = new Thread(tr2, "窗口2");
//        Thread t3 = new Thread(tr3, "窗口3");
//        // 启动3个线程，开始卖票
//        t1.start();
//        t2.start();
//        t3.start();


    }
}

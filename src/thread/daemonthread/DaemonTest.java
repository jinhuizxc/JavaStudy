package thread.daemonthread;

import java.util.Scanner;

/**
 * 进入主线程 main
 * 进入守护线程 Thread-0
 * 守护线程 Thread-0向文件中写入了word0
 * 守护线程 Thread-0向文件中写入了word1
 * 守护线程 Thread-0向文件中写入了word2
 * d
 * 退出主线程 main
 */
public class DaemonTest {

    public static void main(String[] args) {
        System.out.println("进入主线程 " + Thread.currentThread().getName());
        DaemonThread daemonThread = new DaemonThread();
        Thread thread = new Thread(daemonThread);
        thread.setDaemon(true);  // 设置为守护线程
        thread.start();
        
        // 阻塞等待键盘输入
        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("退出主线程 " + Thread.currentThread().getName());
    }
}

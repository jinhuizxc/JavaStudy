package thread;

/**
 * 应用Runnable模拟卖票
 *
 * 结果不对:
 * 窗口1卖了1张票， 剩余票数为: 3
 * 窗口3卖了1张票， 剩余票数为: 2
 * 窗口3卖了1张票， 剩余票数为: 1
 * 窗口2卖了1张票， 剩余票数为: 3
 * 窗口3卖了1张票， 剩余票数为: 0
 */
public class TicketRunnable implements Runnable {

    private int ticketCount = 5;  // 一共有5张火车票


    @Override
    public void run() {
        while (ticketCount > 0){
            ticketCount--;   // 如果还有票，就继续卖
            System.out.println(Thread.currentThread().getName() + "卖了1张票， 剩余票数为: " + ticketCount);
        }
    }
}

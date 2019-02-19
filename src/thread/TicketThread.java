package thread;

/**
 * 应用Thread模拟卖票
 */
public class TicketThread extends Thread{

    private int ticketCount = 5;  // 一共有5张火车票
    private String name;    // 窗口，也即是线程的名字

    public TicketThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        super.run();
        while (ticketCount > 0){
            ticketCount--;   // 如果还有票，就继续卖
            System.out.println(name + "卖了1张票， 剩余票数为: " + ticketCount);
        }
    }
}

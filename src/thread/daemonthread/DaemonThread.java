package thread.daemonthread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 守护线程代码示例
 */
public class DaemonThread implements Runnable{
    @Override
    public void run() {
        System.out.println("进入守护线程 " + Thread.currentThread().getName());
        try {
            writeFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("退出守护线程 " + Thread.currentThread().getName());
    }

    private void writeFile() throws Exception{
        File fileName = new File("E:" + File.separator + "daemon.txt");
        OutputStream os = new FileOutputStream(fileName, true);  // 设置为true说明是追加操作，而不是覆盖操作
        int count = 0;
        while (count < 999){
            os.write(("\r\nword" + count).getBytes());
            System.out.println("守护线程 " + Thread.currentThread().getName()
            + "向文件中写入了word" + count++);
            Thread.sleep(1000);
        }
    }
}

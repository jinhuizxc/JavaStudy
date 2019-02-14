package socket;

import java.io.*;
import java.net.Socket;

/**
 * 服务器端线程处理类
 */
public class ServerThread extends Thread {

    // 和本线程相关的socket
    Socket socket = null;

    public ServerThread (Socket socket){
        this.socket = socket;
    }

    // 线程执行的操作，响应客户端的请求
    @Override
    public void run() {
//        super.run();
        // 3. 数据传输，输入输出流
        InputStream is = null; // 字节输入流
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStream os = null;
        PrintWriter pw = null;
        try {
            // 获取输入流，并读取客户端信息
            is = socket.getInputStream();
            isr = new InputStreamReader(is); // 将字节流转换为字符流
            br = new BufferedReader(isr);  // 为输入流添加缓冲
            String info = null;
            while ((info = br.readLine()) != null){  // 循环读取客户端信息
                System.out.println("我是服务器，客户端说：" + info);
            }
            socket.shutdownInput();  // 关闭输入流

            // 4. 获取输出流，向客户端发送信息
            os =socket.getOutputStream();
            pw = new PrintWriter(os); // 包装为打印流
            pw.write("欢迎您！");
            pw.flush();  //调用flush()方法将缓冲输出

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 5.关闭资源, alt + ctrl + t 异常捕获处理快捷键
            try {
                if(pw != null){
                    pw.close();
                }
                if (os != null){
                    os.close();
                }
                if (br != null){
                    br.close();
                }
                if (isr != null){
                    isr.close();
                }
                if (is != null){
                    is.close();
                }
                if (socket != null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

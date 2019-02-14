package socket;

import java.io.*;
import java.net.Socket;

/**
 * 编程实现基于TCP的Socket通信之客户端
 *
 * 测试:
 * ----------服务器即将启动，等待客户端的连接-------------
 * 客户端的数量: 1
 * 我是服务器，客户端说：用户名: admin; 密码: 123
 *
 * 修改内容再次运行客户端
 * ----------服务器即将启动，等待客户端的连接-------------
 * 客户端的数量: 1
 * 我是服务器，客户端说：用户名: admin; 密码: 123
 * 客户端的数量: 2
 * 我是服务器，客户端说：用户名: tom; 密码: 456
 *
 */
public class Client {

    public static void main(String[] args) {

        try {
            // 1. 创建客户端Socket，指定服务器端地址和端口
            Socket socket = new Socket("localhost", 8888);
            // 2. 获取输出流，向服务器发送信息
            OutputStream os = socket.getOutputStream();  // 字节输出流
            // 打印流
            PrintWriter pw = new PrintWriter(os);  // 将输出流包装成打印流
            pw.write("用户名: tom; 密码: 456");
            pw.flush();  // 刷新缓存，向服务器发送信息
            socket.shutdownOutput();  // 关闭输出流

            // 3. 获取输入流，用于读取服务器端发送的信息
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;
            while ((info = br.readLine()) != null){  // 循环读取客户端信息
                System.out.println("我是客户端，服务器说：" + info);
            }
            // 4.关闭资源
            br.close();
            is.close();
            pw.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

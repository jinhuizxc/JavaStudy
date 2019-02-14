package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 编程实现基于TCP的Socket通信之服务器端
 *
 * 测试结果:
 * ----------服务器即将启动，等待客户端的连接-------------
 * 我是服务器，客户端说：用户名: admin; 密码: 123
 *
 *
 * 快捷键为： Ctrl + Alt +F
 */
public class Server {

    public static void main(String[] args) {
        try {
            // 1. 创建ServerSocket, 指定绑定端口，并监听端口
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket;
            // 记录客户端的数量
            int count = 0;
            //2. 调用accept()方法开始监听，等待客户端连接
            System.out.println("----------服务器即将启动，等待客户端的连接-------------");
            // 循环监听等待客户端的连接
            while (true){
                socket = serverSocket.accept();  // 处于阻塞状态，等待客户端的连接；
                // 创建一个新的线程
                ServerThread serverThread = new ServerThread(socket);
                // 启动线程
                serverThread.start();
                count++; // 统计客户端的数量
                System.out.println("客户端的数量: " + count);
                InetAddress address = socket.getInetAddress();
                System.out.println("当前客户端的IP: " + address.getHostAddress());
            }

            /**
             * 使用多线程实现多客户端的通信，优化操作
             */
//            // 3. 数据传输，输入输出流
//            InputStream is = socket.getInputStream(); // 字节输入流
//            InputStreamReader isr = new InputStreamReader(is); // 将字节流转换为字符流
//            BufferedReader br = new BufferedReader(isr);  // 为输入流添加缓冲
//            String info = null;
//            while ((info = br.readLine()) != null){  // 循环读取客户端信息
//                System.out.println("我是服务器，客户端说：" + info);
//            }
//            socket.shutdownInput();  // 关闭输入流
//
//            // 4. 获取输出流，向客户端发送信息
//            OutputStream os =socket.getOutputStream();
//            PrintWriter pw = new PrintWriter(os); // 包装为打印流
//            pw.write("欢迎您！");
//            pw.flush();  //调用flush()方法将缓冲输出
//
//            // 5.关闭资源
//            pw.close();
//            os.close();
//            br.close();
//            isr.close();
//            is.close();
//            socket.close();

//            serverSocket.close();  // 注释即可
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

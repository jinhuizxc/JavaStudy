package socket.IM;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 服务端代码:接收客户端消息
 *
 * 捕获异常：（光标移到该代码行，或者选中该行代码，Ctrl+Alt+T）：
 */
public class SocketServer {

    BufferedWriter writer = null;
    BufferedReader reader = null;

    public static void main(String[] args) {

        SocketServer socketServer = new SocketServer();
        socketServer.start();
    }

    private void start() {

        ServerSocket serverSocket = null;

        Socket socket = null;
        // 记录客户端的数量
        int count = 0;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("----------服务器启动了, 等待客户端的连接-------------");
            /**
             * 创建ServerSocket对象,参数是端口号,
             * accept方法表示阻塞服务,等待客户端接入
             */
            while (true){
                socket = serverSocket.accept();
                manageConnection(socket);
                count++; // 统计客户端的数量
                System.out.println("客户端的数量: " + count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void manageConnection(Socket socket) {
        //为每个建立连接的Socket建立一个线程,进行管理
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("客户端:" + socket.hashCode() + "已经连接服务器");
                    reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    // 发送信息给客户端
                    writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                    // 定时任务,测试心跳
//                    new Timer().schedule(new TimerTask() {
//                        @Override
//                        public void run() {
//                            try {
//                                System.out.println("heart beat once...");
//                                writer.write("heart beat once..." + "\n");
//                                writer.flush();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }, 3000, 3000);

                    String receiveMsg;
                    while ((receiveMsg = reader.readLine()) != null) {
                        System.out.println("client : " + socket.hashCode() + "发送消息: " + receiveMsg);
                        writer.write("服务端回复: " + receiveMsg + "\n");
                        writer.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        reader.close();
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }

}

package socket.IM;

import java.io.*;
import java.net.Socket;

/**
 * https://blog.csdn.net/xiaobaifeiji/article/details/51175821
 * 见证Android消息推送时刻--笔记---Socket即时通讯机制
 * <p>
 * 消息推送机制客户端代码
 * <p>
 * // 1 IM通讯机制研究
 * // 长连接  短连接
 * // 即时通讯属于长连接,维护一个服务,一直监听消息的到达
 * // 2 实现在控制台输出内容在服务端接收
 */
public class SocketClient {


    public static void main(String[] args) {
        /**
         * 实现用户在命令行输出消息
         */
        SocketClient client = new SocketClient();
        client.start();
    }


    //  创建服务器的Socket连接,参数:IP地址,端口号
    public void start() {

        BufferedReader inputReader = null;
        BufferedReader reader = null;   // 从服务器读取reader
        String inputContent;

        BufferedWriter writer = null;
        Socket socket = null;

        try {
            // 创建socket对象
            socket = new Socket("localhost", 8080);
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            // 读取输入的内容
            inputReader = new BufferedReader(new InputStreamReader(System.in));   // 键盘获取输入流；

            // 客户端创建reader,接收服务端消息
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 创建监听器
            startServerReplyListener(reader);
            System.out.println("请输入要发送的信息:");
            while (!(inputContent = inputReader.readLine()).equals("bye")) {
                // 写入字符输出流，用于向服务器发送数据
                writer.write(inputContent + "\n");
                writer.flush();  // 刷新，提交操作
                System.out.println("客户端输入: " + inputContent);

//                String response = reader.readLine();
//                System.out.println(response);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
                inputReader.close();
                socket.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    // 监听器监听消息发送，因为要监听消息所以是BufferedReader
    public void startServerReplyListener(final BufferedReader reader) {
        //请求网络等耗时操作要放在子线程中运行
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String response;
                    //相当于子线程阻塞,一直监听服务器的消息到达
                    while ((response = reader.readLine()) != null) {
                        System.out.println(response);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

}

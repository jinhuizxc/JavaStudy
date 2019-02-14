package socket;

import java.io.IOException;
import java.net.*;

/**
 * 客户端
 *
 * 响应数据:
 * 我是客户端， 服务器说: 欢迎您！
 */
public class UDPClient {

    public static void main(String[] args) {

        try {
            /**
             * 向服务器端发送数据
             */
            // 1. 定义服务器的地址，端口、数据
            InetAddress address = InetAddress.getByName("localhost");
            int port = 8888;
            String str = "用户名: admin; 密码: 123";
            byte [] data = str.getBytes();
            // 2. 创建数据报， 包含发送的数据信息
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            // 3. 创建DatagramSocket对象
            DatagramSocket socket = new DatagramSocket();
            // 4. 向服务器端发送信息
            socket.send(packet);

            /**
             * 接收服务器响应的数据
             */
            // 1. 创建数据报，用于接收服务器响应的数据
            byte[] data2 = new byte[1024];
            DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
            // 2. 接收服务器数据
            socket.receive(packet2);
            // 3. 读取数据
            String reply = new String(data2, 0, packet2.getLength());
            System.out.println("我是客户端， 服务器说: " + reply);
            // 关闭资源
            socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

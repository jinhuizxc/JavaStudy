package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 服务器端，实现基于UDP的用户登录
 *
 * 结果:
 * -----------服务器端已经启动，等待客户端发送数据------
 * 我是服务器，客户端说: 用户名: admin; 密码: 123
 */
public class UDPServer {

    public static void main(String[] args) {
        // 1. 创建服务器端DatagramSocket，指定端口
        try {
            DatagramSocket socket = new DatagramSocket(8888);
            // 2. 创建数据报包，用于接收客户端发送的数据
            byte[] bytes = new byte[1024]; // 创建字节数组， 指定接收的数据包的大小
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            // 3. 接收客户端发送的消息
            System.out.println("-----------服务器端已经启动，等待客户端发送数据------");
            socket.receive(packet);   // 此方法在接收到数据报之前会一直阻塞
            // 4. 读取数据
            String info = new String(bytes, 0, packet.getLength());
            System.out.println("我是服务器，客户端说: " + info);

            /**
             * 向客户端响应数据
             */
            // 1. 获取客户端的地址，端口、数据
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            String str = "欢迎您！";
            byte[] data2 = str.getBytes();
            // 2. 创建数据报
            DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
            // 3. 响应客户端
            socket.send(packet2);
            // 关闭资源
            socket.close();

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

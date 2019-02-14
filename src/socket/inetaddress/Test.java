package socket.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * InetAddress类
 *
 * 命令行获取: ipconfig
 */
public class Test {

    public static void main(String[] args) {
        // 获取本机的InetAddress实例
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("inetAddress = " + inetAddress);  // 直接输出inetAddress对象: inetAddress = LAPTOP-CK4UA0NV/192.168.0.113
            System.out.println("计算机名：" + inetAddress.getHostName());   // 计算机名：LAPTOP-CK4UA0NV
            System.out.println("IP地址：" + inetAddress.getHostAddress());  // IP地址：192.168.0.113
            byte[] bytes = inetAddress.getAddress();  // 获取字节数组形式的IP地址
            System.out.println("字节数组形式的IP：" + Arrays.toString(bytes));   // 字节数组形式的IP：[-64, -88, 0, 113]

            // 根据机器名获取InetAddress实例
//            InetAddress address = InetAddress.getByName("LAPTOP-CK4UA0NV");
            // 根据ip地址获取InetAddress实例
            InetAddress address1 = InetAddress.getByName("192.168.0.113");
            System.out.println("address 计算机名 = " + address1.getHostName());
            System.out.println("address IP地址：" + address1.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

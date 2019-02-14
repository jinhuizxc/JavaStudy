package socket.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL的常用方法
 */
public class Test {

    public static void main(String[] args) {
        try {
            // 创建一个URL的实例
            URL imooc = new URL("http://www.imooc.com");

            // 关于url参数相关内容在《Java遇见HTML---jsp篇》中，有详细介绍
            // ？后面表示参数，#后面表示锚点
            URL url = new URL(imooc, "/index.html?username=tom#test");
            System.out.println("协议：" + url.getProtocol());  // 协议：http
            System.out.println("主机：" + url.getHost());  // 主机：www.imooc.comb
           // 如果未指定端口号，则使用默认的端口号，此时getPost()方法返回值为-1
            System.out.println("端口：" + url.getPort());   // 端口：-1
            System.out.println("文件路径：" + url.getPath());
            System.out.println("文件名：" + url.getFile());
            System.out.println("相对路径：" + url.getRef());
            System.out.println("查询字符串：" + url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

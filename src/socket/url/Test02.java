package socket.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * 使用URL读取页面内容
 *
 * 输出文件打开html是乱码，关于"浏览器编码解析问题"，后面课程会有详细介绍
 */
public class Test02 {

    public static void main(String[] args) {
        // 创建一个url实例
        URL url = null;
        try {
            url = new URL("http://www.baidu.com");
//            System.out.println(socket.url);   // http://www.baidu.com
            // 通过URL的openStream方法获取url对象所表示的资源的字节输入流
            InputStream is = url.openStream();
            // 字节输入流-->字符输入流
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);  // 这里可以指定编码
            // 为字符输入流添加缓冲，提高读取效率
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine(); // 读取数据
            while (data != null){
                System.out.println(data);  // 输出数据
                data = br.readLine();
            }
            // 关闭流
            br.close();
            isr.close();
            is.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package designpattern.proxy.cglibproxy;

/**
 * cglib动态代理
 *
 * 日志开始...
 * 火车行驶中...
 * 日志结束...
 */
public class Test {

    public static void main(String[] args) {

        CglibProxy cglibProxy = new CglibProxy();
        Train train = (Train) cglibProxy.getProxy(Train.class);
        train.move();
    }
}

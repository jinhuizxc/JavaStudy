package designpattern.proxy.proxy;

import designpattern.proxy.Moveable;

public class Proxy {

    public static Object newProxyInstance(){
        String rt = "\r\n";   // 换行符
        String string =
        "package designpattern.proxy;" + rt +

        "public class $Proxy0 implements Moveable {" + rt +

        "   private Moveable m;" + rt +

        "   public CarTimeProxy(Moveable m) {" + rt +
        "       super();" + rt +
        "       this.m = m;" + rt +
        "   }" + rt +

        "   @Override" + rt +
        "   public void move() {" + rt +
        "       long startTime = System.currentTimeMillis();" + rt +
        "       System.out.println(\"汽车开始行驶...\");" + rt +
        "       m.move();" + rt +
        "       long endTime = System.currentTimeMillis();" + rt +
        "       System.out.println(\"汽车结束行驶... 汽车行驶时间: \" +(endTime - startTime)+ \"毫秒!\");" + rt +
        "   }" + rt +
        "}";


        return null;
    }
}

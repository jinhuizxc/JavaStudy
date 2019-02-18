package designpattern.chainofresponsibility.handler.factory;

import designpattern.chainofresponsibility.handler.*;

/**
 * 简单工厂模式， 不在于是否有参数，而在于返回值
 */
public class PriceHandlerFactory {
    /**
     * 工厂模式，向上转型
     *
     * 创建PriceHandler的工厂方法
     * @return
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler lead = new Lead();
        PriceHandler man = new Manager();
        PriceHandler dir = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        // 后继
        sales.setSuccessor(lead);
        lead.setSuccessor(man);
        man.setSuccessor(dir);
        dir.setSuccessor(vp);
        vp.setSuccessor(ceo);

        return sales;
    }
}

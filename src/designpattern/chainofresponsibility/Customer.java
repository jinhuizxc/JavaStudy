package designpattern.chainofresponsibility;

import designpattern.chainofresponsibility.handler.PriceHandler;
import designpattern.chainofresponsibility.handler.factory.PriceHandlerFactory;

import java.util.Random;

/**
 * 客户， 请求折扣
 *
 * 责任链模式
 *
 *  责任链模式：将接受者对象连成一条链，
 *  并在该链上传递请求，知道有一个接受者对象处理它。
 *  通过让更多的对象有机会处理请求，避免了请求发送者和接受者之间的耦合。
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ":");
            customer.requestDiscount(random.nextFloat());  // random.nextFloat()代表折扣
        }
    }
}

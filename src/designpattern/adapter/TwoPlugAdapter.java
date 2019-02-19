package designpattern.adapter;

/**
 * 二相转三相的插座适配器
 *
 * 适配器中包含： 三相的接口，二相的类，完成转化
 *
 * 使用组合的方式实现插座适配器
 */
public class TwoPlugAdapter implements ThreePlugInterface {

    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
        this.plug = gbTwoPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转化");
        plug.powerWithTwo();
    }
}

package designpattern.adapter;

/**
 * 使用继承的方式实现插座适配器
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugInterface {

    @Override
    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();
    }
}

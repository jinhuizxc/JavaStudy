package designpattern.adapter;

/**
 * 适配器模式
 * <p>
 * 适配器定义：
 * 适配器将一个类的接口，转换成客户需要的另外一个接口。是原本由于接口不兼容而不能一起工作的哪些类可以在一起工作。
 * 目的：解决不兼容不匹配的问题
 * <p>
 * 原本接口 -> 适配器 -> 目标接口
 * <p>
 * <p>
 * 输出结果:
 * 通过转化
 * 使用二相电流供电
 * 使用三相电流给笔记本充电
 */
public class NoteBook {

    // 笔记本内部是三相充电接口
    private ThreePlugInterface threePlugInterface;

    public NoteBook(ThreePlugInterface threePlugInterface) {
        this.threePlugInterface = threePlugInterface;
    }


    // 使用插座充电
    public void charge() {
        threePlugInterface.powerWithThree();
//        System.out.println("使用三相电流给笔记本充电");
    }

    public static void main(String[] args) {

        GBTwoPlug gbTwoPlug = new GBTwoPlug();
        ThreePlugInterface threePlugInterface = new TwoPlugAdapter(gbTwoPlug);
        NoteBook noteBook = new NoteBook(threePlugInterface);
        noteBook.charge();

        //
        System.out.println("***************************");
        threePlugInterface = new TwoPlugAdapterExtends();
        noteBook = new NoteBook(threePlugInterface);
        noteBook.charge();
    }
}

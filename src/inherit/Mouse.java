package inherit;

/**
 *
 */
public class Mouse extends Animal {

    private String name;
    private int id;

    public Mouse(String myName, int myid, String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Mouse(String myName, int myid) {
        System.out.println("调用子类有参构造");
//        this.name = myName;
//        this.id = myid;
    }

    public Mouse() {
        super("super", 1);
        System.out.println("调用子类无参构造");
    }

//    public Mouse(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    public void eat(){
//        System.out.println(name+"正在吃");
//    }
//    public void sleep(){
//        System.out.println(name+"正在睡");
//    }
//    public void introduction() {
//        System.out.println("大家好！我是"         + id + "号" + name + ".");
//    }


    @Override
    public void sleep() {
//        super.sleep();
        System.out.println(name + "正在睡1");
    }

    public void sleepTest(){
        this.sleep();   // this 调用自己的方法
        super.sleep();  // super 调用父类方法
    }

}

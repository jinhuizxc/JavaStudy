package inherit;

public class Animal {

    private String name;
    private int id;

    public Animal() {
        System.out.println("调用父类无参构造");
    }

    public Animal(String myName, int myid) {
        System.out.println("调用父类有参构造");
        name = myName;
        id = myid;
    }

    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }

}

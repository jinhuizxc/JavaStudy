package collections;

public class Employer3 implements Comparable<Employer3>{

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重载了Object类里的toString方法，使之可以按照我们要求的格式打印
    @Override
    public String toString() {
        return "name is " + name + " age is " + age;
    }

    // 重载了Comparable接口里的compareTo方法来实现具体的比较
    @Override
    public int compareTo(Employer3 o) {
        return this.age.compareTo(o.getAge());
    }
}

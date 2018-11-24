import enums.FreshJuice;
import inherit.Animal;
import inherit.Mouse;
import inherit.superclass.SubClass;
import interfaces.MammalInt;
import interfaces.Test;
import overload.Overloading;
import override.Dog;
import polymorphism.Cat;
import polymorphism.virtualmothod.Employee;
import polymorphism.virtualmothod.Salary;

public class JavaStudy {

    public static void main(String[] args) {

        // IntelliJ IDEA创建main函数快捷方法

        System.out.println("Hello world");

        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("size = " + juice.size);  // size = MEDIUM

        // 自动类型转换 必须满足转换前的数据类型的位数要低于转换后的数据类型
        char c1 = 'a'; //定义一个char类型
        int i = c1;    //char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i);
        char c2 = 'A';  //定义一个char类型
        char c3 = 'Z';
        int i2 = c2 + 1;  //char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + c2 + c3 + "--" + i2);

        // 转换过程中可能导致溢出或损失精度
        int t = 128;
        byte t1 = (byte) t;
        System.out.println("t1 = " + t1);  // t1 = -128

        // 数值类型的基本类型的取值范围
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);


        // 强制类型转换
        int i1 = 123;
        byte b = (byte) i1;  // //强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于" + b);  // int强制类型转换为byte后的值等于123


        // Java 变量类型

        // Java继承
        Mouse mouse = new Mouse();  // 调用父类无参构造，调用子类无参构造(默认省略super();但是依然是执行的)
        Mouse mouse1 = new Mouse("tom", 1);
//        mouse.sleep();
//        Mouse mouse1 = new Mouse("tom", 1);
//        mouse1.sleep();

        SubClass sc = new SubClass();
        SubClass sc2 = new SubClass(200);


        // 方法重写
        override.Animal animal_a = new override.Animal(); // Animal 对象
//        override.Animal animal_b = new Dog(); // Dog 对象
//        animal_a.move();// 执行 Animal 类的方法
//
//        animal_b.move(); //执行 Dog 类的方法
//        animal_b.bark();   // 没有这个方法，无法执行，(下方例子，可以执行)

        Dog animal_b = new Dog();  // Dog 对象
        animal_a.move();// 执行 Animal 类的方法

        animal_b.move(); //执行 Dog 类的方法
        animal_b.bark();

        // 重载(Overload)
        Overloading o = new Overloading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1, "test3"));
        System.out.println(o.test("test4", 1));


        // 多态存在的三个必要条件
        //    继承
        //    重写
        //    父类引用指向子类对象

        // 多态实例的演示
        show(new Cat());  // 以 Cat 对象调用 show 方法
        show(new polymorphism.Dog());  // 以 Dog 对象调用 show 方法

        polymorphism.Animal a = new Cat();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        Cat c = (Cat) a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work

        System.out.println("------------虚拟方法调用--------------");
        // 虚方法
        Salary s = new Salary("员工 A", "北京", 3, 3600.00);
        Employee e = new Salary("员工 B", "上海", 2, 2400.00);
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();

        // 抽象类
        System.out.println("-----------抽象类-------------------");
        /* 以下是不允许的，会引发错误 */
        // 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。
        // 只有抽象类的非抽象子类可以创建对象。
//        abstractclass.Employee employee = new abstractclass.Employee("George W.", "Houston, TX", 43);
//        System.out.println("\n Call mailCheck using Employee reference--");
//        employee.mailCheck();

        abstractclass.Salary s1 = new abstractclass.Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        abstractclass.Employee e1 = new abstractclass.Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s1.mailCheck();
        s1.computePay();  // 使用抽象方法

        System.out.println("\n Call mailCheck using Employee reference--");
        e1.mailCheck();


        // 接口
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();

        // 接口的继承
        Test test = new Test();

        test.endOfQuarter(1);
        test.setHomeTeam("12");






    }

    private static void show(polymorphism.Animal a) {
        a.eat();
        // 类型判断
        if (a instanceof Cat) {  // 猫做的事情
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof polymorphism.Dog) { // 狗做的事情
            polymorphism.Dog c = (polymorphism.Dog) a;
            c.work();
        }
    }


}

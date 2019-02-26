import course.Course;
import course.CourseEntity;
import enums.FreshJuice;
import inherit.Mouse;
import inherit.superclass.SubClass;
import interfaces.MammalInt;
import interfaces.Test;
import overload.Overloading;
import override.Dog;
import polymorphism.Cat;
import polymorphism.virtualmothod.Employee;
import polymorphism.virtualmothod.Salary;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
//        com.project.abstractclass.Employee employee = new com.project.abstractclass.Employee("George W.", "Houston, TX", 43);
//        System.out.println("\n Call mailCheck using Employee reference--");
//        employee.mailCheck();

        com.project.abstractclass.Salary s1 = new com.project.abstractclass.Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        com.project.abstractclass.Employee e1 = new com.project.abstractclass.Salary("John Adams", "Boston, MA", 2, 2400.00);

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


        /**
         * https://www.cnblogs.com/gxbk629/p/3587562.html
         * JAVA经典算法40题(供面试所用)
         */
        arithmetic();

        System.out.println("java面试总结");

        /**
         * 面试总结
         *
         *
         */
//        testSleep();

        /**
         *  向list中添加数据
         */
        addList();

        /**
         * Java float保留两位小数或多位小数
         * http://www.cnblogs.com/Dtscal/p/3485405.html
         */
        floatAndDouble();
        floatAndDouble1();


    }

    /**
     * JAVA float double数据类型保留2位小数点5种方法
     * http://www.cnblogs.com/simpledev/p/4765834.html
     */
    private static void floatAndDouble1() {

        System.out.println("JAVA float double数据类型保留2位小数点5种方法:");
        //方法一: 计算小数点的位数：
        System.out.println("1/8 = " + 1 / (float) 8);
        float TT = Math.round(1 / (float) 8);   //返回的是int型。
        System.out.println("四舍五入小数 ：" + TT);
        System.out.println("四舍五入小数2 ：" + Math.round(2.1546));

        //方法2
        DecimalFormat df2 = new DecimalFormat("###.00");
        DecimalFormat df3 = new DecimalFormat("###.000");
        System.out.println("转换2 = " + df2.format(1 / (float) 8));
        System.out.println("转换3 = " + df3.format(1.1256));

        //方法3
        String ss1 = String.format("%10.2f%%", 1.1256);  //1.13f
        String ss2 = String.format("%10.2f", 1.1256);   //       1.13
        String ss3 = String.format("%1.2f", 0.1256);   //1.13
        System.out.println("转换4 1 = " + ss1);
        System.out.println("转换4 2 = " + ss2);
        System.out.println("转换4 3 = " + ss3);

        //方法4
        double x = 23.5455;
        NumberFormat ddf1 = NumberFormat.getNumberInstance();
        ddf1.setMaximumFractionDigits(2);
        String s = ddf1.format(x);
        System.out.println("方法4 数字格式 0 = " + s);   //四舍五入   23.55

        float text = 0.5455f;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        String str = ddf1.format(Double.valueOf(text));
        System.out.println("方法4 数字格式 1 = " + str);   //四舍五入   23.55

        //方法5
        float T = 0.1257f;
        BigDecimal b = new BigDecimal(T);
        T = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        System.out.println("保留2位小数：" + T);

        // 方法6
        DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
        String p = decimalFormat.format(T);//format 返回的是字符串
        System.out.println("方法6 = " + p);

    }

    private static void floatAndDouble() {
//        方法1:用Math.round计算,这里返回的数字格式的
        float price = 89.897788888f;
        int itemNum = 3;
        float totalPrice = price * itemNum;
        float num = (float) (Math.round(totalPrice * 100) / 100);//如果要求精确4位就*10000然后/10000
        System.out.println("floatAndDouble = " + num);
//        方法2: 用DecimalFormat 返回的是String格式的.该类对十进制进行全面的封装.像%号,千分位,小数精度.科学计算.
        float price1 = 60.2888888f;
        DecimalFormat decimalFormat = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
        String p = decimalFormat.format(price1);//format 返回的是字符串
        System.out.println("floatAndDouble 1 = " + p);
//        个人觉得在前台显示金额方面的还是用第二种方式.理由很简单是字符串格式的.

        float price2 = 0.2888888f;
        DecimalFormat decimalFormat1 = new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
        String p1 = decimalFormat1.format(price2);//format 返回的是字符串
        System.out.println("floatAndDouble 1 = " + p1);

    }

    private static void addList() {
        List<CourseEntity> courseList = new ArrayList<>();

        List<Course> courseList1 = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            Course course = new Course(j, "介绍");
            System.out.println("course = " + course);
            courseList1.clear();
            courseList1.add(course);

            System.out.println("courseList1 = " + courseList1);

            CourseEntity courseEntity1 = new CourseEntity(j, courseList1);
            courseList.clear();
            courseList.add(courseEntity1);
            System.out.println("输出测试数据 0 " + courseList.toString());
        }
        System.out.println("输出测试数据 " + courseList.toString());
    }

    /**
     * java中的sleep()和wait()的区别
     * 对于sleep()方法，我们首先要知道该方法是属于Thread类中的。而wait()方法，则是属于Object类中的。
     * <p>
     * sleep()方法导致了程序暂停执行指定的时间，让出cpu该其他线程，但是他的监控状态依然保持者，当指定的时间到了又会自动恢复运行状态。
     * <p>
     * 在调用sleep()方法的过程中，线程不会释放对象锁。
     * <p>
     * 而当调用wait()方法的时候，线程会放弃对象锁，进入等待此对象的等待锁定池，只有针对此对象调用notify()方法后本线程才进入对象锁定池准备
     * <p>
     * 获取对象锁进入运行状态。
     * <p>
     * 运行效果:
     * enter thread1...
     * thread1 is waiting...
     * enter thread2...
     * thread2 is waiting...
     * thread2 is going on....
     * thread2 is over!!!
     * thread1 is going on ....
     * thread1 is over!!!
     * 如果注释掉代码：
     * JavaStudy.class.notify();
     * 运行效果:
     * enter thread1...
     * thread1 is waiting...
     * enter thread2...
     * thread2 is waiting...
     * thread2 is going on....
     * thread2 is over!!!
     * 且程序一直处于挂起状态。
     */
    private static void testSleep() {

        new Thread(new Thread1()).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 开始线程2
        new Thread(new Thread2()).start();
    }


    /**
     * java一些经典算法题
     * https://blog.csdn.net/qq625315759/article/details/51867513
     * <p>
     * 算法
     */
    private static void arithmetic() {
//        arithmetic1();
//        arithmetic2();
//        arithmetic3();
//        arithmetic4();
        arithmetic5();
//        arithmetic6();
        arithmetic7();
//        arithmetic8();
        arithmetic9();
        arithmetic10();
        arithmetic11();

        arithmetic12();
        arithmetic13();
        arithmetic14();
        arithmetic15();
        arithmetic16();
        arithmetic17();
        arithmetic18();
        arithmetic19();
        arithmetic20();
        arithmetic21();
//        arithmetic22();
        arithmetic23();
        arithmetic24();
        arithmetic25();
        arithmetic26();
    }

    /**
     * 冒泡排序
     * int num[] = {1,8, 4, 7, 10, 5};
     * int num[] = {1,8, 4, 7, 10, 5};
     */
    private static void arithmetic26() {

//        int[] arr = {6, 3, 8, 2, 9, 1};
//        System.out.println("排序前数组为：");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
//            for (int j = 1; j < arr.length - i; j++) {//内层循环控制每一趟排序多少次
//                if (arr[j - 1] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("排序后的数组为：");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        // 自己写
        int num[] = {1, 8, 4, 7, 10, 5};
        System.out.print("排序前数组: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        maopao(num);
        System.out.print("排序后数组: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    private static void maopao(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length - i; j++) {
                if (num[j - 1] > num[j]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }
    }

    /**
     * 编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,
     * 当输入n为奇数时，调用函数1/1+1/3+...+1/n
     */
    private static void arithmetic25() {
        int sum;
        int n = 30;
        if (n % 2 == 0) {
            sum = getSumO(n);
            System.out.println("偶数和是 : " + sum);
        } else {
            sum = getSumJ(n);
            System.out.println("奇数和是 : " + sum);
        }
    }

    private static int getSumO(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 1 / (i + 2);
        }
        return sum;

    }

    private static int getSumJ(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 1 / (i + 2);
        }
        return sum;

    }

    /**
     * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
     */
    private static void arithmetic24() {
        System.out.println("----最大的与第一个元素交换，最小的与最后一个元素交换，输出数组----");
        int[] arr = {5, 4, 3, 4, 10, 1, 7, 8, 9, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }//先遍历一遍
        System.out.println();
        change(arr);
    }

    private static void change(int[] arr) {
        huanMax(arr);
        huanMin(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");//交换完成，遍历
        }
    }

    private static void huanMin(int[] arr) {
        int min = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];//求最小值
            }
        }
        for (j = 0; j < arr.length; j++) {
            if (min == arr[j])
                break;//得到最小值的索引
        }

        int c = arr[j];
        arr[j] = arr[arr.length - 1];
        arr[arr.length - 1] = c;//交换

    }

    private static void huanMax(int[] arr) {
        int max = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];//得到最大值
//                System.out.println("得到最大值 " + arr[i] + "," + i);
            }
        }
        for (j = 0; j < arr.length; j++) {
            if (max == arr[j])
                break;//得到最大值对应的索引
        }

        int c = arr[j];
        arr[j] = arr[0];
        arr[0] = c; //交换

    }

    /**
     * 将一个数组逆序输出。
     */
    private static void arithmetic23() {
        System.out.println("----将一个数组逆序输出----");
        int[] arr = {1, 2, 34, 5, 6, 7, 8, 9};
        print1(arr);
    }

    private static void print1(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    /**
     * 求一个3*3矩阵对角线元素之和
     * <p>
     * 1 2 3         00 01 02
     * 4 5 6         10 11 12
     * 7 8 9         20 21 22
     * <p>
     * 1 3 5 5 7 9 和是25
     */
    private static void arithmetic22() {
        int sum = 0;
        int k = 1;
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入9个数组成一个3*3矩阵");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("请输入第" + (k++) + "个数：");
                System.out.println(i + "与" + j + "的值");
                arr[i][j] = scanner.nextInt();
                if (i == j)
                    sum += arr[i][j];
                if (Math.abs(i - j) == 2)
                    sum += arr[i][j];
            }

        }
        System.out.println(sum);

    }

    /**
     * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
     */
    private static void arithmetic21() {
        isHui(32321);
    }

    private static void isHui(int num) {
        int[] arr = new int[5];
        int i = 0;

        while (num != 0) {
            arr[i] = num % 10; // 对相应的下标赋值
            num /= 10;
            i++;
        }
        if (arr[0] == arr[4] && arr[1] == arr[3]) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }

    }

    /**
     * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字
     * <p>
     * 分析:
     * 依次求余，计算位数对应的数字，对应下标的数字 num % 10
     * // num = num / 10;  求商变成低一位的数字
     */
    private static void arithmetic20() {
        getNum(12374);
        System.out.println();
    }

    private static void getNum(int num) {
        int[] arr = new int[5];
        int i = 0;
        if (num > 99999)
            System.out.println("数字太大");

        // 12374， 4 ； 1237，7； 123， 3
        while (num != 0) {
            arr[i] = num % 10;  // 求余对应下标的数字
            num = num / 10;    // 求商变成低一位的数字
            i++;
        }

        System.out.println(i + "位数字");
        for (int j = 0; j <= i - 1; j++)
            System.out.print(arr[j] + " ");

    }


    /**
     * 利用递归方法求5!。
     */
    private static void arithmetic19() {
        int n = 5;
        System.out.println("利用递归方法求5! " + getJC(n));
    }

    private static int getJC(int n) {
        int sum = 0;
        if (n == 1 || n == 0) {
            sum = 1;
        } else if (n > 1) {
            sum = n * getJC(n - 1);
        }
        return sum;
    }

    /**
     * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
     */
    private static void arithmetic18() {


    }

    /**
     * 打印出如下图案（菱形）
     * <p>
     * *
     * **
     * *****
     * *******
     * *****
     * **
     * *
     */
    private static void arithmetic17() {
//        print();

        // 自己的做法是 : n个数，n列，n必定是奇数
    }

    private static void print() {
        for (int i = 1; i <= 4; i++) {
            if (i <= 2) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                for (int j = 0; j < 8 - 2 * i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < 7 - 2 * i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    /**
     * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
     * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
     * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
     */
    private static void arithmetic16() {

        // 方式一, 递归
//        int day = 10;  // 第n天
//        int num = 1;  // 第n天的剩余个数
//        jisuanTaoziNum(day, num);

        // 方式二， for循环
        qiu(3);
    }

    private static void qiu(int day) {
        int i;
        int[] arr = new int[day];
        arr[day - 1] = 1;  // 第10天剩余桃子数
        for (i = day - 2; i >= 0; i--) {
            arr[i] = (arr[i + 1] + 1) * 2;
        }
        System.out.println("第一天共摘了 " + arr[0]);

    }

    private static void jisuanTaoziNum(int day, int num) {
        int taoziNum = num;
        while (day > 1) {
            taoziNum = get(taoziNum);
            day--;
        }
        System.out.println("第一天共摘了 " + taoziNum);
    }

    private static int get(int i) {
        return (i + 1) * 2;
    }

    /**
     * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
     * 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
     */
    private static void arithmetic15() {
        luoDi(100, 8);
    }

    private static void luoDi(int height, int c) {

        int sum = 0;
        for (int i = 1; i <= c; i++) {
            {
                sum += height;        // 经过的高度之和
                height = height / 2;  // 反弹后的高度
            }
        }

        System.out.println("第" + c + "次落地共经过" + sum + "米");
        System.out.println("第" + c + "反弹" + height + "米");

    }

    /**
     * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
     * 例如6=1＋2＋3.编程找出1000以内的所有完数
     */
    private static void arithmetic14() {
        System.out.println("1000以内的所有完数 ");// 6 28 496
        wanShu();
        System.out.println();
    }

    private static void wanShu() {

        for (int i = 1; i < 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i)
                System.out.print(sum + " ");
        }

    }

    /**
     * 输入两个正整数m和n，求其最大公约数和最小公倍数。
     */
    private static void arithmetic13() {
        qiu(11, 7);
    }

    private static void qiu(int a, int b) {
        // 辗转相除法求最大公约数
        int gy;
        int gb;
        if (a > b)
            gy = gongYueShu(a, b);
        else
            gy = gongYueShu(b, a);
        gb = a * b / gy;

        System.out.println("最大公约数:" + gy);
        System.out.println("最小公倍数:" + gb);
    }

    private static int gongYueShu(int a, int b) {
        while (b != 0) {
            a = a % b;
            if (a == 0)
                return b;
            else
                b = b % a;
        }
        return a;
    }

    /**
     * 求1！+2!+3!.....+30!的和 并用方法
     */
    private static void arithmetic12() {
        int a = 1, b = 30;
        sum(a, b);
    }

    // 求和
    private static void sum(int a, int b) {
        long sum = 0;
        for (int i = a; i <= b; i++)
            sum += jieCheng(i);

        System.out.println("1！+2!+3!.....+30!的和 : " + a + "--" + b + "的阶乘和为：" + sum);
    }

    private static long jieCheng(int c) {
        int jiecheng = 1;
        for (int i = c; i >= 1; i--)
            jiecheng *= i;
        return jiecheng;
    }

    /**
     * 使用Java对字符串进行升序排序
     * https://www.cnblogs.com/mugglean/p/9224092.html
     * <p>
     * Java对字符串的很多API和功能是JavaWeb能广泛发展的基础，下面是一道经典的字符串操作题，需要边查JAVASE的API对每个步骤进行操作。
     * <p>
     * 题目：给一个字符串，"34 12 -8 0 3 7 128"对字符串中的数值进行升序排序后，生成一个数值有序的字符串。
     */
    private static void arithmetic11() {
        System.out.println("-------使用Java对字符串进行升序排序------");
        String stringTest = "34 12 -8 0 3 7 128";
        String sortStr = sortNumberString(stringTest);

        System.out.println("使用Java对字符串进行升序排序: " + sortStr);
    }

    /*
     * 对数组进行升序排序的方法
     */
    private static String sortNumberString(String stringTest) {
        // 1.切分字符串
        String[] stringArray = stringTest.split(" ");
//        System.out.println(stringArray[2]);
        // 2.字符串数组转化成整数数组
        int[] intArrays = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArrays[i] = Integer.parseInt(stringArray[i]);
            System.out.println(intArrays[i]);
        }
        // 3.整数数组排序,Arrays工具类自带快排
        Arrays.sort(intArrays);
        // 4.排完顺序转化成字符串，单线程使用StringBuilder好一点
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i < intArrays.length; i++) {
            returnString.append(intArrays[i]);
            if (i != intArrays.length - 1)
                returnString.append(" ");
        }
        return returnString.toString();
    }

    /**
     * 有26个字母a-z, 找出所有字母的组合，a、b、c、ab、abc、a~z都是一个组合（顺序无关）
     */
    private static void arithmetic10() {

    }

    /**
     * 1000个数范围[0,999],有2个相同的数,求这个数
     * https://blog.csdn.net/johnWcheung/article/details/52790248
     */
    private static void arithmetic9() {
        int size = 1000;
        int[] data = new int[size];  //  添加测试数据
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
//            System.out.println(data[i]);
        }
        data[999] = 567;  // 设置重复元素
        result(data);

    }

    /**
     * https://blog.csdn.net/github_38838414/article/details/80642329
     * 深入理解Arrays.sort(）
     *
     * @param data
     */
    private static void result(int[] data) {
        System.out.println("增序排序后顺序");
        Arrays.sort(data);   // 对数组进行排序
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");  // 565 566 567 567 568 569
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            int target = data[i];
            data[i] = 0;   // 这一步不可以省略，具体分析啊
            int result = binaryFind(data, target);
            if (result != -1) {
                System.out.println("相同元素为：" + data[result]);
                break;
            }
        }
    }

    /**
     * 二分搜索算法实现
     *
     * @param data   * 数据集合
     * @param target * 搜索的数据
     * @return 返回找到的数据的位置，返回-1表示没有找到。
     */
    public static int binaryFind(int[] data, int target) {
        int start = 0;
        int end = data.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target == data[middle]) {
                return middle;
            }
            if (target >= data[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }


    /**
     * https://blog.csdn.net/sai739295732/article/details/70767233
     * java 找出小于数字N的所有素数
     * <p>
     * 例如:
     * 请输入数字:
     * 6 2 3 5
     */
    private static void arithmetic8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字:");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    // 素数不小于2
    // 质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数
    private static boolean isPrime(int a) {
        boolean flag = true;
        int Max;
        if (a < 2) {  // 2 3
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                // 若能被整除，则说明不是素数，返回false
                if (a % i == 0) {
//                    System.out.println(a + i);
                    flag = false;
                    break;  // 跳出循环
                }
            }
        }
        return flag;
    }

    /**
     * 题目：取一个整数a从右端开始的4～7位。
     * <p>
     * 程序分析：可以这样考虑：
     * <p>
     * (1)先使a右移4位。
     * <p>
     * (2)设置一个低4位全为1,其余全为0的数。可用~(~0 < <4)
     * <p>
     * (3)将上面二者进行&运算。
     */
    private static void arithmetic7() {
        int a = 0;
        long b = 18745678;
        a = (int) Math.floor(b % Math.pow(10, 7) / Math.pow(10, 3));
        System.out.println(a);
    }

    /**
     * 将一个数组逆序输出
     * https://blog.csdn.net/ytu_lt/article/details/70160682
     * <p>
     * // 请输入十个整数，以回车键分隔：
     * 1 21 3 4 5 6 7 8 9 10
     * [10, 9, 8, 7, 6, 5, 4, 3, 21, 1]
     */
    private static void arithmetic6() {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("请输入十个整数，以回车键分隔：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i] + "]");
        }


    }

    /**
     * 打印出杨辉三角形（要求打印出10行如下图）
     * https://blog.csdn.net/huolei_blog/article/details/23510441
     * <p>
     * 1.程序分析：
     * <p>
     * 1
     * <p>
     * 1   1
     * <p>
     * 1   2   1
     * <p>
     * 1   3   3   1
     * <p>
     * 1   4   6   4   1
     * <p>
     * 1   5   10   10   5   1
     */
    private static void arithmetic5() {

        // 打印的不对
//        int i, j;
//        int a[][];
//        a = new int[8][8];
//        for (i = 0; i < 8; i++) {
//            a[i][i] = 1;
//            a[i][0] = 1;
//        }
//        for (i = 2; i < 8; i++) {
//            for (j = 1; j <= i - 1; j++) {
//                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
//            }
//        }
//        for (i = 0; i < 8; i++) {
//            for (j = 0; j < i; j++) {
//                System.out.print("  " + a[i][j]);
//            }
//            System.out.println();
//        }

        int a[][];
        a = new int[10][10];
        a[0][0] = a[1][0] = a[1][1] = 1;

        for (int k = 1; k < 10; k++)
            a[k][k] = 1;
        for (int f = 0; f < 10; f++)
            a[f][0] = 1;
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }


    }

    /**
     * 题目：输入3个数a,b,c，按大小顺序输出。
     * <p>
     * 1.程序分析：利用指针方法。
     */
    private static void arithmetic4() {
//        int[] arrays = {800, 56, 500};
//        for (int i = arrays.length; --i >= 0; ) {
//            for (int j = 0; j < i; j++) {
//                if (arrays[j] > arrays[j + 1]) {
//                    int temp = arrays[j];
//                    arrays[j] = arrays[j + 1];
//                    arrays[j + 1] = temp;
//                }
//            }
//        }
//        for (int n = 0; n < arrays.length; n++)
//            System.out.println(arrays[n]);

        int[] arrays = new int[]{100, 120, 143};
        int temp[] = new int[3];
        /**
         * 关于数组越界的问题：
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
         * j <= i    arrays[j + 1]
         */
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    temp[j] = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp[j];
                }
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("按大小顺序输出 " + arrays[i]);
            // 按大小顺序输出 100
            // 按大小顺序输出 120
            // 按大小顺序输出 143
        }
    }

    /**
     * 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
     */
    private static void arithmetic3() {
        int i, min, max, n, temp1, temp2;
        int a[];
        System.out.println("输入数组的长度:");
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("输入第" + (i + 1) + "个数据");
            a[i] = keyboard.nextInt();
        }
//以上是输入整个数组
        max = 0;
        min = 0;
//设置两个标志,开始都指向第一个数
        for (i = 1; i < n; i++) {
            if (a[i] > a[max])
                max = i; //遍历数组,如果大于a[max]，就把他的数组下标赋给max
            if (a[i] < a[min])
                min = i; //同上，如果小于a[min],就把他的数组下标赋给min
        }
//以上for循环找到最大值和最小值，max是最大值的下标，min是最小值的下标
        temp1 = a[0];
        temp2 = a[min]; //这两个temp只是为了在交换时使用

        a[0] = a[max];
        a[max] = temp1; //首先交换a[0]和最大值a[max]

        if (min != 0) { //如果最小值不是a[0]，执行下面
            a[min] = a[n - 1];
            a[n - 1] = temp2; //交换a[min]和a[n-1]
        } else {       //如果最小值是a[0],执行下面
            a[max] = a[n - 1];
            a[n - 1] = temp1;
        }

        for (i = 0; i < n; i++) { //输出数组
            System.out.print(a[i]);
        }
    }

    /**
     * java 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
     */
    private static void arithmetic2() {
        int N = 10;
        int[] a = new int[N];
        Scanner s = new Scanner(System.in);
        System.out.println("请输入10个整数：");
        for (int i = 0; i < N; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("你输入的数组为：");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n请输入向后移动的位数：");
        int m = s.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {   // 设置b[i]的数据
            b[i] = a[N - m + i];
        }
        for (int i = N - 1; i >= m; i--) {  // 改后4项数据
            a[i] = a[i - m];
        }
        for (int i = 0; i < m; i++) {  // 改后前项数据
            a[i] = b[i];
        }
        // 上面3个for循环的简便写法
//        System.arraycopy(a, N - m, b, 0, m);
//        System.arraycopy(a, 0, a, m, N - m);
//        System.arraycopy(b, 0, a, 0, m);
        System.out.print("位移后的数组是：");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }

    }

    /**
     * Java 写有n个人围成一圈，顺序排号，从第一个人开始报数（从1~3报数），
     * 凡报到3的人退出圈子，问最后留下的人原来排在第几号。
     */
    private static void arithmetic1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");
        int n = scanner.nextInt();
        boolean arr[] = new boolean[n];

        for (int j = 0; j < n; j++) {
            arr[j] = true;  // 都在圈子里
        }

        int leftCount = n;  // 剩余人数
        int countNum = 0;
        int index = 0;
        while (leftCount > 1) {
            // 报数
            if (arr[index]) {  // 对在圈子的里的人进行报数
                countNum++;
                if (countNum == 3) {
                    arr[index] = false;
                    countNum = 0;
                    leftCount--;  // 剩余人数减一
                }
            }
            index++;
            if (index == n) { //是循环数数，当下标大于n时，说明已经数了一圈，
                index = 0;   //将下标设为零重新开始
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j]) {
                System.out.println("原排在第" + (j + 1) + "位的人留下了。");
            }
        }
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

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            synchronized (JavaStudy.class) {
                System.out.println("enter thread1...");
                System.out.println("thread1 is waiting...");
                //调用wait()方法，线程会放弃对象锁，进入等待此对象的等待锁定池
                try {
                    JavaStudy.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread1 is going on ....");
                System.out.println("thread1 is over!!!");
            }
        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {
            synchronized (JavaStudy.class) {
                System.out.println("enter thread2...");
                System.out.println("thread2 is waiting...");
                //只有针对此对象调用notify()方法后本线程才进入对象锁定池准备获取对象锁进入运行状态。
//                JavaStudy.class.notify();
                //区别
                //如果我们把代码：TestD.class.notify();给注释掉，即TestD.class调用了wait()方法，但是没有调用notify()
                //方法，则线程永远处于挂起状态。
                //sleep()方法导致了程序暂停执行指定的时间，让出cpu该其他线程，
                //但是他的监控状态依然保持者，当指定的时间到了又会自动恢复运行状态。
                //在调用sleep()方法的过程中，线程不会释放对象锁。
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread2 is going on....");
                System.out.println("thread2 is over!!!");

            }
        }
    }


}

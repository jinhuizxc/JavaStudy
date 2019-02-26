package com.project.collections;

import java.util.*;

/**
 * Collections类常用方法总结
 * https://www.cnblogs.com/Eason-S/p/5786066.html
 */
public class SortTest {

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        List<Employer1> list1 = new ArrayList<Employer1>();
        List<Employer2> list2 = new ArrayList<Employer2>();
        List<Employer3> list3 = new ArrayList<Employer3>();

        //一.将String类型的变量插入到lists中并排序
        //lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序
        lists.add("5");
        lists.add("2");
        lists.add("9");
        System.out.println("排序前结果 = " + lists);  // 排序前结果 = [5, 2, 9]
        Collections.sort(lists);
        System.out.println("排序后结果 = " + lists);  // 排序后结果 = [2, 5, 9]

        //二.将Employer1类的对象插入到list1中并排序
        //将已创建的实现了Comparator接口的比较类MyCompare传入Collections的sort方法中即可实现依照MyCompare类中的比较规则。
        Employer1 a1 = new Employer1();
        Employer1 b1 = new Employer1();
        Employer1 c1 = new Employer1();
        a1.setName("a1");
        a1.setAge(44);
        b1.setName("b1");
        b1.setAge(55);
        c1.setName("b1");
        c1.setAge(33);

        list1.add(a1);
        list1.add(b1);
        list1.add(c1);   // Collections类的sort方法要求传入的第二个参数是一个已实现Comparator接口的比较器
        System.out.println("排序前结果 = " + list1);  // 排序前结果 = [name is a1 age is 44, name is b1 age is 55, name is b1 age is 33]
        Collections.sort(list1, new MyCompare());
        System.out.println("排序后结果 = " + list1);  // 排序后结果 = [name is b1 age is 33, name is a1 age is 44, name is b1 age is 55]

        //三.将Employer2类的对象插入到list2中并排序
        //其实原理和上面的二类似，只是没有单独创建MyCompare类，而是用匿名内部类来实现Comparator接口里面的具体比较。

        Employer2 a2 = new Employer2();
        Employer2 b2 = new Employer2();
        Employer2 c2 = new Employer2();
        a2.setName("a2");
        a2.setAge(66);
        b2.setName("b2");
        b2.setAge(33);
        c2.setName("b2");
        c2.setAge(22);
        list2.add(a2);
        list2.add(b2);
        list2.add(c2);    // Collections类的sort方法要求传入的第二个参数是一个已实现Comparator接口的比较

        System.out.println("排序前结果 = " + list2);  // 排序前结果 = [name is a2 age is 66, name is b2 age is 33, name is b2 age is 22]
        Collections.sort(list2, new Comparator<Employer2>() {
            @Override
            public int compare(Employer2 a2, Employer2 b2) {
                return a2.getAge().compareTo(b2.getAge());
            }
        });
        System.out.println("排序后结果 = " + list2);  // 排序后结果 = [name is b2 age is 22, name is b2 age is 33, name is a2 age is 66]

        //四.将Employer3类的对象插入到list3中并排序
        //被排序的类Employer3实现了Comparable接口,在类Employer3中通过重载compareTo方法来实现具体的比较。
        Employer3 a3 = new Employer3();
        Employer3 b3 = new Employer3();
        Employer3 c3 = new Employer3();
        a3.setName("a3");
        a3.setAge(77);
        b3.setName("b3");
        b3.setAge(55);
        c3.setName("b3");
        c3.setAge(99);
        list3.add(a3);
        list3.add(b3);
        list3.add(c3);
        System.out.println("排序前结果 = " + list3);   // 排序前结果 = [name is a3 age is 77, name is b3 age is 55, name is b3 age is 99]
        Collections.sort(list3);   // Collections类的sort方法要求传入的List中的对象是已实现Comparable接口的对象
        System.out.println("排序后结果 = " + list3);   // 排序后结果 = [name is b3 age is 55, name is a3 age is 77, name is b3 age is 99]

        String s1 = "abc";
        String s2 = "abcd";
        String s3 = "abcdfg";
        String s4 = "1bcdfg";
        String s5 = "cdfg";
        System.out.println(s1.compareTo(s2)); // -1 (前面相等,s1长度小1)
        System.out.println(s1.compareTo(s3)); // -3 (前面相等,s1长度小3)
        System.out.println(s1.compareTo(s4)); // 48 ("a"的ASCII码是97,"1"的的ASCII码是49,所以返回48)
        System.out.println(s1.compareTo(s5)); // -2 ("a"的ASCII码是97,"c"的ASCII码是99,所以返回-2)

        // 2. shuffle
        System.out.println("shuffle: 对集合进行随机排序");
        List c = new ArrayList();
        c.add("w");
        c.add("o");
        c.add("r");
        c.add("l");
        c.add("d");
        System.out.println(c);  // [w, o, r, l, d]
        Collections.shuffle(c);
        System.out.println(c);  // [l, d, r, w, o]
        Collections.shuffle(c);
        System.out.println(c);  // [w, l, d, r, o]

        // 3. binarySearch: 查找指定集合中的元素，返回所查找元素的索引
        System.out.println("binarySearch: 查找指定集合中的元素，返回所查找元素的索引");
        List list_binarySearch = new ArrayList();
        list_binarySearch.add("a");
        list_binarySearch.add("f");
        list_binarySearch.add("rg");
        list_binarySearch.add("asd");
        list_binarySearch.add("vb");
        System.out.println(list_binarySearch);
        int m = Collections.binarySearch(list_binarySearch, "vb");
        System.out.println(m);

        // max方法1
        System.out.println("max方法1-------------------");
        List<Student1> list_max = new ArrayList<Student1>();
        list_max.add(new Student1("林青霞", 27));
        list_max.add(new Student1("风清扬", 30));
        list_max.add(new Student1("刘晓曲", 28));
        list_max.add(new Student1("武鑫", 29));
        list_max.add(new Student1("林青霞", 27));

        Student1 min = Collections.min(list_max);
        System.out.println(min.getName() + "---" + min.getAge());
        Student1 max = Collections.max(list_max);
        System.out.println(max.getName() + "---" + max.getAge());
        // max方法2
        System.out.println("max方法2-----------");
        List<Student2> list_max2 = new ArrayList<Student2>();
        list_max2.add(new Student2("林青霞", 27));
        list_max2.add(new Student2("风清扬", 30));
        list_max2.add(new Student2("刘晓曲", 28));
        list_max2.add(new Student2("武鑫", 29));
        list_max2.add(new Student2("林青霞", 27));

        Student2 min2 = Collections.min(list_max2, new MyComparator());
        System.out.println(min2.getName() + "---" + min2.getAge());
        Student2 max2 = Collections.max(list_max2, new MyComparator());
        System.out.println(max2.getName() + "---" + max2.getAge());

        //  6.indexOfSubList: 查找subList在list中首次出现位置的索引
        System.out.println("indexOfSubList: 查找subList在list中首次出现位置的索引");
        List list = Arrays.asList("one two three four five six seven".split(" "));
        System.out.println(list);
        List subList = Arrays.asList("three four five six".split(" "));
        System.out.println(Collections.indexOfSubList(list, subList));

        // 7. lastIndexOfSubList: 使用与上例方法的使用相同，在此就不做介绍了。
        // 8. replaceAll: 替换批定元素为某元素,若要替换的值存在刚返回true,反之返回false
        System.out.println("replaceAll: 替换批定元素为某元素,若要替换的值存在刚返回true,反之返回false");
        List list_replaceAll = Arrays.asList("one two three four five six siven".split(" "));
        System.out.println(list_replaceAll);
        List subList1 = Arrays.asList("three four five six".split(" "));
        System.out.println(Collections.replaceAll(list_replaceAll, "siven", "siven eight"));
        System.out.println(list_replaceAll);

        // 9. reverse(): 反转集合中元素的顺序
        System.out.println("reverse(): 反转集合中元素的顺序");
        List list_reverse = Arrays.asList("one two three four five six siven".split(" "));
        System.out.println(list_reverse);
        Collections.reverse(list_reverse);
        System.out.println(list_reverse);

        // 10. rotate: 集合中的元素向后移m个位置，在后面被遮盖的元素循环到前面来
        System.out.println("rotate: 集合中的元素向后移m个位置，在后面被遮盖的元素循环到前面来");
        List list_rotate = Arrays.asList("one two three four five six siven".split(" "));
        System.out.println(list_rotate);
        Collections.rotate(list_rotate, 2);
        System.out.println(list_rotate);


        // 11. copy: 将集合n中的元素全部复制到m中,并且覆盖相应索引的元素
        System.out.println("copy: 将集合n中的元素全部复制到m中,并且覆盖相应索引的元素");
        List list_copy = Arrays.asList("one two three four five six siven".split(" "));
        System.out.println(list_copy);
        List n = Arrays.asList("我 是 复制过来的哈".split(" "));
        System.out.println(n);
        Collections.copy(list_copy, n);
        System.out.println(list_copy);  // [我, 是, 复制过来的哈, four, five, six, siven]
        // 12. swap：交换集合中指定元素索引的位置
        System.out.println("swap：交换集合中指定元素索引的位置");
        List list_swap = Arrays.asList("one two three four five six siven".split(" "));
        System.out.println(list_swap);  // [one, two, three, four, five, six, siven]
        Collections.swap(list_swap, 2, 5);
        System.out.println(list_swap);   // [one, two, six, four, five, three, siven]
        // 13. fill: 用对象o替换集合list中的所有元素
        System.out.println("fill: 用对象o替换集合list中的所有元素");
        List list_fill = Arrays.asList("one two three four five six siven".split(" "));
        System.out.println(list_fill);
        Collections.fill(list_fill, "替换元素");
        System.out.println(list_fill);
        // 14. nCopies: 返回大小为n的List，List不可改变,其中的所有引用都指向o
        System.out.println("nCopies: 返回大小为n的List，List不可改变,其中的所有引用都指向o");
        System.out.println(Collections.nCopies(5, "haha"));  // [haha, haha, haha, haha, haha]
    }
}

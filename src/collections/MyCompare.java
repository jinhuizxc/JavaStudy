package collections;

import java.util.Comparator;

public class MyCompare implements Comparator<Employer1> {

    // 重载了Comparator接口里面的compare方法实现具体的比较
    @Override
    public int compare(Employer1 o1, Employer1 o2) {
        return o1.getAge().compareTo(o2.getAge());
    }



}

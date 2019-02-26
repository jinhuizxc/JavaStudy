package com.project.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        int num = s1.getAge() - s2.getAge();
        int num1 = (num == 0 ? s1.getName().compareTo(s2.getName()) : num);
        return num1;
    }
}

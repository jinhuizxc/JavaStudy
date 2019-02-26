package com.project.collections;

public class Employer2 {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
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

}

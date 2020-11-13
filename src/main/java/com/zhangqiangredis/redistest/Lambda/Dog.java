package com.zhangqiangredis.redistest.Lambda;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-15 15:21
 */
public class Dog {

    private String name;

    private int age;

    public Dog() {
        System.out.println("无参构造方法");
    }

    public Dog(String name, int age) {
        System.out.println("有参构造方法");
        this.name = name;
        this.age = age;
    }


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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
package com.zhangqiangredis.redistest.Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-15 14:50
 */
public class Program6 {

    public static void main(String[] args) {
        List<Dog> list=new ArrayList<>();
        list.add(new Dog("aa",1));
        list.add(new Dog("bb",4));
        list.add(new Dog("cc",3));
        list.add(new Dog("dd",2));
        list.add(new Dog("ee",5));

        System.out.println("lambda表达式集合排序");
        list.sort((o1,o2)->o1.getAge()-o2.getAge());

        System.out.println("lambda表达式遍历集合");
        list.forEach(System.out::println);

    }

}

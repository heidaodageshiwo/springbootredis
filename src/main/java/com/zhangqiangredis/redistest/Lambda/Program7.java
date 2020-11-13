package com.zhangqiangredis.redistest.Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-15 14:50
 */
public class Program7 {

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


    // 正确的函数式接口
    @FunctionalInterface
    public interface TestInterface {

        // 抽象方法
        public void sub();

        // java.lang.Object中的public方法
        public boolean equals(Object var1);

        // 默认方法
        public default void defaultMethod(){

        }

        // 静态方法
        public static void staticMethod(){

        }
    }

    // 错误的函数式接口(有多个抽象方法)
   @FunctionalInterface
    public interface TestInterface2 {

        void add();

    }
}

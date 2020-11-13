package com.zhangqiangredis.redistest.Lambda;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-15 14:50
 */
public class Program5 {

    public static void main(String[] args) {
        /*DogService dogService=()->new Dog();
        System.out.println(dogService.getDog());*/

        DogService dogService=Dog::new;
        System.out.println(dogService.getDog());

        DogService2 dogService2=Dog::new;
        System.out.println(dogService2.getDog("小花",2));


    }

    interface DogService{
        Dog getDog();

    }

    interface DogService2{
        Dog getDog(String name,int age);
    }

}

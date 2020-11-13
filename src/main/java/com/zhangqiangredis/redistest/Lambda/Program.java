package com.zhangqiangredis.redistest.Lambda;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-15 14:50
 */
public class Program {

    public static void main(String[] args) {
        /*Cal c=new Cal(){

            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };*/

        Cal c=(int a,int b)->{
            return a+b;
        };



        System.out.println(c.add(1,2));
    }

    interface Cal{

        int add(int a,int b);
    }
}

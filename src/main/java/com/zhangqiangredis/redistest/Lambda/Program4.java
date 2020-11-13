package com.zhangqiangredis.redistest.Lambda;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-15 14:50
 */
public class Program4 {

    public static void main(String[] args) {
      /*  Program4 program4=new Program4();
       If5 if5=program4::testA;
        System.out.println(if5.test(3));

        If5 if52=program4::testA;
        System.out.println(if52.test(5));*/

        If5 if5=Program4::testB;
        If5 if52=Program4::testB;

        System.out.println(if5.test(3));
        System.out.println(if52.test(5));

    }

    public int testA(int a){
        return a-2;
    }

    public static int testB(int a){
        return a-2;
    }


    interface If5{


        /**
         * 单个参数有返回值
         * @param a
         * @return
         */
        int test(int a);
    }


}

package com.zhangqiangredis.redistest.Lambda;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-15 14:50
 */
public class Program3 {

    public static void main(String[] args) {
       If1 if1=()->System.out.println(" 无参数无返回值");
       if1.test();

       If2 if2=a->System.out.println("单个参数无返回值 a="+a);
       if2.test(3);

       If3 if3=(a,b)->System.out.println("两个参数无返回值 a+b="+(a+b));
       if3.test(1,5);

       If4 if4=()->4;
       System.out.println("无参数有返回值 "+if4.test());

       If5 if5=a->a;
       System.out.println("单个参数有返回值 "+if5.test(5));

       If6 if6=(a,b)->a-b;
        System.out.println("多个参数有返回值 "+if6.test(7,1));

    }

    interface If1{

        /**
         * 无参数无返回值
         */
        void test();
    }


    interface If2{

        /**
         * 单个参数无返回值
         * @param a
         */
        void test(int a);
    }

    interface If3{

        /**
         * 两个参数无返回值
         * @param a
         * @param b
         */
        void test(int a, int b);
    }


    interface If4{

        /**
         * 无参数有返回值
         * @return
         */
        int test();
    }

    interface If5{

        /**
         * 单个参数有返回值
         * @param a
         * @return
         */
        int test(int a);
    }

    interface If6{

        /**
         * 多个参数有返回值
         * @param a
         * @param b
         * @return
         */
        int test(int a, int b);
    }
}

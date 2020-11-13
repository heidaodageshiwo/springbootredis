package com.zhangqiangredis.redistest.Lambda;

/**
 * java类简单作用描述
 *
 * @ProjectName: redistest
 * @Package: com.zhangqiangredis.redistest.Lambda
 * @ClassName: Test1
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2020-11-05 16:02
 * @UpdateUser: zhangq
 * @UpdateDate: 2020-11-05 16:02
 * @UpdateRemark: The modified content
 * @Version: 1.0 *
 */
public class Test1 {

  public static void main(String[] args) {
    /*Call call = new Call() {
      @Override
      public int add(int a, int b) {
        return a+b;
      }
    };*/
    Call call = (int a, int b)->{
      return a+b;
    };
    System.out.println(call.add(1, 2));
  }

  interface  Call{
    int add(int a,int b);
  }
}

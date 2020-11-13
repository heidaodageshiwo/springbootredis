package com.zhangqiangredis.redistest.Jmeter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java类简单作用描述
 *
 * @ProjectName: redistest
 * @Package: com.zhangqiangredis.redistest.Jmeter
 * @ClassName: Jmeter
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2020-11-12 11:02
 * @UpdateUser: zhangq
 * @UpdateDate: 2020-11-12 11:02
 * @UpdateRemark: The modified content
 * @Version: 1.0 *
 */
@RestController
public class Jmeter {

  @RequestMapping("/test")
  public String test(){

    for(int i=0;i<1;i++){
      System.out.println("第几次运行:"+i);
    }
  return "张强测试";

  }
}

package com.zhangqiangredis.redistest.mybatisplus.service;

import com.zhangqiangredis.redistest.mybatisplus.entity.Users;
import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: redistest
 * @Package: com.zhangqiangredis.redistest.mybatisplus.service
 * @ClassName: UsersService
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2020-11-16 21:34
 * @UpdateUser: zhangq
 * @UpdateDate: 2020-11-16 21:34
 * @UpdateRemark: The modified content
 * @Version: 1.0 *
 */
public interface UsersService {

   List<Users> findAll();

   void save(Users users);

}

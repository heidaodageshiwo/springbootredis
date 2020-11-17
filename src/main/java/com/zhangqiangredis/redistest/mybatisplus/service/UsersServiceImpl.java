package com.zhangqiangredis.redistest.mybatisplus.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.zhangqiangredis.redistest.mybatisplus.dao.UsersDao;
import com.zhangqiangredis.redistest.mybatisplus.entity.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * java类简单作用描述
 *
 * @ProjectName: redistest
 * @Package: com.zhangqiangredis.redistest.mybatisplus.service
 * @ClassName: UsersServiceImpl
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2020-11-16 21:34
 * @UpdateUser: zhangq
 * @UpdateDate: 2020-11-16 21:34
 * @UpdateRemark: The modified content
 * @Version: 1.0 *
 */
@Service
@Transactional
public class UsersServiceImpl implements UsersService{

  @Autowired
  private UsersDao usersDao;


  @Override
  @DS("master")
  public List<Users> findAll() {
    return usersDao.selectList(null);
  }

  @Override
  @DS("slave_1")
  public void save(Users users) {
    usersDao.insert(users);
  }
}

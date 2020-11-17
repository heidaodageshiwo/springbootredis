package com.zhangqiangredis.redistest;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhangqiangredis.redistest.mybatisplus.dao.UsersDao;
import com.zhangqiangredis.redistest.mybatisplus.entity.Users;
import com.zhangqiangredis.redistest.mybatisplus.service.UsersService;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class ServiceTests {

  @Autowired
  private UsersService usersService;
  //查询所有主库
  @Test
  public void testFindAllList(){
    List<Users> all = usersService.findAll();
    all.forEach(usersa->{
      System.out.println("usersa = " + usersa);
    });
  }
  //保存单个到从库
  @Test
  public void testFindone(){
    Users  users=new Users();
    users.setName("bbbb").setAge(3223).setBir(new Date());
     usersService.save(users);

  }

}

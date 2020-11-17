package com.zhangqiangredis.redistest;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhangqiangredis.redistest.mybatisplus.dao.UsersDao;
import com.zhangqiangredis.redistest.mybatisplus.entity.Users;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedistestApplicationTests {
  @Autowired
  private RedisTemplate<String,String> redisTemplate;

  @Autowired
  private UsersDao usersDao;


  @Test
  void contextLoads() {

    redisTemplate.opsForValue().set("myKey","myValue");
    System.out.println(redisTemplate.opsForValue().get("myKey"));
  }



  //查询所有
  @Test
  public void testFindAllList(){
    List<Users> users = usersDao.selectList(null);
    users.forEach(Users->{
      System.out.println("user="+users);
    });
  }
  //查询单个
  @Test
  public void testFindone(){
    Users  users = usersDao.selectById("1");
    System.out.println(users);
  }
  //条件查询
  @Test
  public void testFindlists(){

    QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
    queryWrapper.eq("age","1");
    List<Users> users = usersDao.selectList(queryWrapper);
    users.forEach(us-> System.out.println(us));
  }

  //insert
  @Test
  public void testInsert(){
    Users users=new Users();
    users.setAge(2).setName("fdsa").setBir(new Date());
    usersDao.insert(users);
  }

  //update
  @Test
  public void testUpdate(){
    Users users=new Users();

    Users users1 = usersDao.selectById("2");
    users1.setName("ffff");
    usersDao.updateById(users1);
  }

  //批量修改
  @Test
  public void testUpdateAll(){
    Users users1 = usersDao.selectById("2");
    users1.setName("ffff反反复复付付付付付付付付");
     QueryWrapper<Users> updatewapper=new QueryWrapper<>();
    updatewapper.eq("age","2");
    usersDao.update(users1,updatewapper);
    usersDao.updateById(users1);
  }

  //分页查询
  @Test
  public void testpage(){

    IPage<Users> pages=new Page<>(1,2);
    IPage<Users> usersIPage = usersDao.selectPage(pages, null);
    long total = usersIPage.getTotal();
    System.out.println("总记录数："+total);
    usersIPage.getRecords().forEach(Users->{
      System.out.println("Users = " + Users);
    });

  }
}

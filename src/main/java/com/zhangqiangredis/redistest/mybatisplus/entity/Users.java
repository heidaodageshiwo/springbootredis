package com.zhangqiangredis.redistest.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * java类简单作用描述
 *
 * @ProjectName: redistest
 * @Package: com.zhangqiangredis.redistest.mybatisplus.entity
 * @ClassName: users
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2020-11-16 20:19
 * @UpdateUser: zhangq
 * @UpdateDate: 2020-11-16 20:19
 * @UpdateRemark: The modified content
 * @Version: 1.0 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@TableName(value = "t_users")
public class Users {

  @TableId(value = "id",type = IdType.AUTO)
  private String id;
  @TableField(value = "name")
  private String name;
  private Integer age;
  private Date bir;

  @TableField(exist = false)
  private String aa;

}

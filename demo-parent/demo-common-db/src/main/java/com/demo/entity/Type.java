package com.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Arlen123
 * @since 2020-05-15
 */
@Data
public class Type implements Serializable {

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      private String type;

      @TableField("type_name")
      private String typeName;

      @TableField("creat_time")
      private Date creatTime;


}

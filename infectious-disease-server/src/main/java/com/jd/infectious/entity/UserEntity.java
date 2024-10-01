package com.jd.infectious.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("infection_config")
public class  UserEntity {

    @TableId
    private Long id;

    private String userName;
}

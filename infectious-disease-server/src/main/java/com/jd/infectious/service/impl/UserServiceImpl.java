package com.jd.infectious.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.infectious.entity.UserEntity;
import com.jd.infectious.mapper.UserMapper;
import com.jd.infectious.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    public UserEntity getUser(int userId) {
        LambdaQueryWrapper<UserEntity> wrapper = new LambdaQueryWrapper<UserEntity>();
        // where id=1 or user_name="小陈"
        wrapper.eq(UserEntity::getId, userId);
//        wrapper.eq(UserEntity::getUserName, "小陈");
        //执行查询
        UserEntity user = getOne(wrapper);
        return user;
    }
}

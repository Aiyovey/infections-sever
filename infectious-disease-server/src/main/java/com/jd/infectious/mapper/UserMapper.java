package com.jd.infectious.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jd.infectious.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}

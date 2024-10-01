package com.jd.infectious.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.infectious.entity.NewCaseDataEntity;
import com.jd.infectious.mapper.NewCaseDataMapper;
import com.jd.infectious.mapper.NewCaseDataMapper2;
import com.jd.infectious.service.NewCaseDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (NewCaseData)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service
public class NewCaseDataServiceImpl extends ServiceImpl<NewCaseDataMapper, NewCaseDataEntity> implements NewCaseDataService {

    @Override
    public List<NewCaseDataEntity> getList() {
        LambdaQueryWrapper<NewCaseDataEntity> wrapper = new LambdaQueryWrapper<NewCaseDataEntity>();
        return list(wrapper);
    }

    @Override
    public NewCaseDataEntity getNewCaseDataByAgentId(Integer agentId) {
        LambdaQueryWrapper<NewCaseDataEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(NewCaseDataEntity::getAgentId, agentId);
        return getOne(wrapper);
    }

}

package com.jd.infectious.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.infectious.domain.NewCaseData;
import com.jd.infectious.mapper.NewCaseDataMapper;
import com.jd.infectious.service.NewCaseDataService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * (NewCaseData)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service
public class NewCaseDataServiceImpl extends ServiceImpl<NewCaseDataMapper, NewCaseData> implements NewCaseDataService {

    @Override
    public List<NewCaseData> getList() {
        LambdaQueryWrapper<NewCaseData> wrapper = new LambdaQueryWrapper<NewCaseData>();
        return list(wrapper);
    }

    @Override
    public NewCaseData getNewCaseDataByAgentId(Integer agentId) {
        LambdaQueryWrapper<NewCaseData> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(NewCaseData::getAgentId, agentId);
        return getOne(wrapper);
    }

    @Override
    public long getInfectionNum() {
        return baseMapper.selectCount(new LambdaQueryWrapper<NewCaseData>());
    }

}

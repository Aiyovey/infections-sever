package com.jd.infectious.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.infectious.common.param.agentdynamic.AgentsDynamicStepParam;
import com.jd.infectious.domain.AgentsDynamic;
import com.jd.infectious.mapper.AgentsDynamicMapper;
import com.jd.infectious.mapper.AgentsDynamicMapper2;
import com.jd.infectious.service.AgentsDynamicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AgentsDynamic)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service("agentsDynamicService")
public class AgentsDynamicServiceImpl extends ServiceImpl<AgentsDynamicMapper, AgentsDynamic> implements AgentsDynamicService {

    @Override
    public List<AgentsDynamic> getList(AgentsDynamicStepParam param) {
        LambdaQueryWrapper <AgentsDynamic> wrapper = new LambdaQueryWrapper<>();
        wrapper.ge(AgentsDynamic::getStep, param.getStartStep());
        wrapper.le(AgentsDynamic::getStep, param.getEndStep());
        return list(wrapper);
    }

    @Override
    public boolean insert(AgentsDynamic agentsDynamic) {
        return save(agentsDynamic);
    }

    @Override
    public AgentsDynamic getAgentDynamicByAgent(Integer agent) {
        LambdaQueryWrapper<AgentsDynamic> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(AgentsDynamic::getAgent, agent);
        return getOne(wrapper);
    }
}

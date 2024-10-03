package com.jd.infectious.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.infectious.domain.AgentVisit;
import com.jd.infectious.mapper.AgentVisitMapper;
import com.jd.infectious.service.AgentVisitService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * (AgentVisit)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service("agentVisitService")
public class AgentVisitServiceImpl extends ServiceImpl<AgentVisitMapper, AgentVisit> implements AgentVisitService {

    @Override
    public List<AgentVisit> getList() {
        return list();
    }

    @Override
    public AgentVisit getAgentVisitById(Integer id) {
        LambdaQueryWrapper<AgentVisit> queryWrapper = new LambdaQueryWrapper<AgentVisit>()
                .eq(AgentVisit::getId, id);
        return getOne(queryWrapper);
    }
}

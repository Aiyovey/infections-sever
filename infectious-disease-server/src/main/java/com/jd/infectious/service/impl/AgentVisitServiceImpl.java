package com.jd.infectious.service.impl;

import com.jd.infectious.domain.AgentVisit;
import com.jd.infectious.mapper.AgentVisitMapper;
import com.jd.infectious.service.AgentVisitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AgentVisit)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service("agentVisitService")
public class AgentVisitServiceImpl implements AgentVisitService {
    @Resource
    private AgentVisitMapper agentVisitMapper;

    @Override
    public List<AgentVisit> getList() {
        return agentVisitMapper.getList();
    }

    @Override
    public AgentVisit getAgentVisitById(Integer id) {
        return agentVisitMapper.getAgentVisitById(id);
    }
}

package com.jd.infectious.service.impl;

import com.jd.infectious.domain.AgentsStatic;
import com.jd.infectious.mapper.AgentsStaticMapper;
import com.jd.infectious.service.AgentsStaticService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AgentsStatic)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service("agentsStaticService")
public class AgentsStaticServiceImpl implements AgentsStaticService {
    @Resource
    private AgentsStaticMapper agentsStaticMapper;

    @Override
    public List<AgentsStatic> getList() {
        return agentsStaticMapper.getList();
    }

    @Override
    public int insert(AgentsStatic agentsStatic) {
        return agentsStaticMapper.insert(agentsStatic);
    }

    @Override
    public AgentsStatic getAgentDynamicById(Integer id) {
        return agentsStaticMapper.getAgentDynamicById(id);
    }
}

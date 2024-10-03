package com.jd.infectious.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.infectious.domain.AgentsStatic;
import com.jd.infectious.mapper.AgentsStaticMapper;
import com.jd.infectious.service.AgentsStaticService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * (AgentsStatic)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service("agentsStaticService")
public class AgentsStaticServiceImpl extends ServiceImpl<AgentsStaticMapper, AgentsStatic> implements AgentsStaticService {

    @Override
    public List<AgentsStatic> getList() {
        return list(new LambdaQueryWrapper<AgentsStatic>());
    }

    @Override
    public int insert(AgentsStatic agentsStatic) {
        return save(agentsStatic) ? 1 : 0;
    }

    @Override
    public AgentsStatic getAgentDynamicById(Integer id) {
        LambdaQueryWrapper<AgentsStatic> queryWrapper = new LambdaQueryWrapper<AgentsStatic>()
                .eq(AgentsStatic::getId, id);
        return getOne(queryWrapper);
    }
}

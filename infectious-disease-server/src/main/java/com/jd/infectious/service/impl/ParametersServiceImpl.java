package com.jd.infectious.service.impl;

import com.jd.infectious.domain.Parameters;
import com.jd.infectious.mapper.ParametersMapper;
import com.jd.infectious.service.ParametersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Parameters)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service("parametersService")
public class ParametersServiceImpl implements ParametersService {
    @Resource
    private ParametersMapper parametersMapper;

    @Override
    public List<Parameters> getList() {
        return parametersMapper.getList();
    }

    @Override
    public int insert(Parameters parameters) {
        return parametersMapper.insert(parameters);
    }

    @Override
    public Parameters getAgentDynamicByName(String name) {
        return parametersMapper.getAgentDynamicByName(name);
    }
}

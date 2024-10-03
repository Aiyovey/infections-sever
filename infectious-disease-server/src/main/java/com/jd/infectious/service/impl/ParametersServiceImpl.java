package com.jd.infectious.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.infectious.domain.Parameters;
import com.jd.infectious.mapper.ParametersMapper;
import com.jd.infectious.service.ParametersService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * (Parameters)表服务实现类
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
@Service("parametersService")
public class ParametersServiceImpl extends ServiceImpl<ParametersMapper, Parameters> implements ParametersService {

    @Override
    public List<Parameters> getList() {
        return list();
    }

    @Override
    public int insert(Parameters parameters) {
        return save(parameters) ? 1 : 0;
    }

    @Override
    public Parameters getAgentDynamicByName(String name) {
        LambdaQueryWrapper<Parameters> queryWrapper = new LambdaQueryWrapper<Parameters>()
                .eq(Parameters::getName, name);
        return getOne(queryWrapper);
    }
}

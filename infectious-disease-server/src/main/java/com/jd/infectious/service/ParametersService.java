package com.jd.infectious.service;

import com.jd.infectious.domain.Parameters;

import java.util.List;

/**
 * (Parameters)表服务接口
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
public interface ParametersService {
    List<Parameters> getList();
    int insert(Parameters Parameters);
    Parameters getAgentDynamicByName(String name);

}

package com.jd.infectious.service;

import com.jd.infectious.domain.AgentsStatic;

import java.util.List;

/**
 * (AgentsStatic)表服务接口
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
public interface AgentsStaticService {
    List<AgentsStatic> getList();
    int insert(AgentsStatic agentsStatic);
    AgentsStatic getAgentDynamicById(Integer id);
}

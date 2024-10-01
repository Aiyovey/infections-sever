package com.jd.infectious.service;

import com.jd.infectious.domain.AgentVisit;

import java.util.List;

/**
 * (AgentVisit)表服务接口
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
public interface AgentVisitService {
    List<AgentVisit> getList();
    AgentVisit getAgentVisitById(Integer id);

}

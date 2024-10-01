package com.jd.infectious.service;

import com.jd.infectious.common.param.agentdynamic.AgentsDynamicStepParam;
import com.jd.infectious.domain.AgentsDynamic;

import java.util.List;

/**
 * (AgentsDynamic)表服务接口
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
public interface AgentsDynamicService {
    List<AgentsDynamic> getList(AgentsDynamicStepParam param);

    boolean insert(AgentsDynamic agentsDynamic);

    AgentsDynamic getAgentDynamicByAgent(Integer agent);
}

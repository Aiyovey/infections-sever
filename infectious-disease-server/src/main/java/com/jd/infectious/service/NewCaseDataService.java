package com.jd.infectious.service;


import com.jd.infectious.domain.NewCaseData;

import java.util.List;

/**
 * (NewCaseData)表服务接口
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
public interface NewCaseDataService {
    List<NewCaseData> getList();

    NewCaseData getNewCaseDataByAgentId(Integer agentId);

    long getInfectionNum();

}

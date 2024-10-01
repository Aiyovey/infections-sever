package com.jd.infectious.service;


import com.jd.infectious.entity.NewCaseDataEntity;

import java.util.List;

/**
 * (NewCaseData)表服务接口
 *
 * @author makejava
 * @since 2024-09-03 19:32:08
 */
public interface NewCaseDataService {
    List<NewCaseDataEntity> getList();
    NewCaseDataEntity getNewCaseDataByAgentId(Integer agentId);

}

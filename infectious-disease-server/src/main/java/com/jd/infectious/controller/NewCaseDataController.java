package com.jd.infectious.controller;

import com.jd.infectious.business.newcase.NewCaseBusiness;
import com.jd.infectious.common.result.ResponseResult;
import com.jd.infectious.common.vo.NewCaseDataVO;
import com.jd.infectious.domain.NewCaseData;
import com.jd.infectious.service.NewCaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/newCase")
public class NewCaseDataController {
    @Autowired
    private NewCaseDataService newCaseDataService;

    @Autowired
    private NewCaseBusiness newCaseBusiness;

    @GetMapping("/list")
    public ResponseResult<NewCaseDataVO> list() {
        return ResponseResult.create(200, newCaseBusiness.getNewCaseData());
    }

    @GetMapping("/{agentId}")
    public ResponseResult<NewCaseData> getNewCaseDataByAgentId(@PathVariable("agentId") Integer agentId) {
        return ResponseResult.create(200, newCaseDataService.getNewCaseDataByAgentId(agentId));
    }

    @GetMapping("/infection-res")
    public ResponseResult<Map<String, Object>> getInfectionRes() {
        return ResponseResult.create(200, newCaseBusiness.getInfectionRes());
    }

}

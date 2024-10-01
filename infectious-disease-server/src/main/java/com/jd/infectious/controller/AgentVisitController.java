package com.jd.infectious.controller;

import com.jd.infectious.common.result.ResponseResult;
import com.jd.infectious.domain.AgentVisit;
import com.jd.infectious.domain.AgentsStatic;
import com.jd.infectious.service.AgentVisitService;
import com.jd.infectious.service.AgentsStaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agentVisit")
public class AgentVisitController {
    @Autowired
    private AgentVisitService agentVisitService;

    @GetMapping("/list")
    public ResponseResult list() {
        List<AgentVisit> list = agentVisitService.getList();
        return ResponseResult.create(200, list);
    }

    @GetMapping("/{id}")
    public ResponseResult getAgentVisitById(@PathVariable("id") Integer id) {
        return ResponseResult.create(200, agentVisitService.getAgentVisitById(id));
    }
}

package com.jd.infectious.controller;

import com.jd.infectious.common.param.agentdynamic.AgentsDynamicStepParam;
import com.jd.infectious.common.result.ResponseResult;
import com.jd.infectious.domain.AgentsDynamic;
import com.jd.infectious.mapper.AgentsDynamicMapper;
import com.jd.infectious.service.AgentsDynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agentsDynamic")
public class AgentsDynamicController {
    @Autowired
    private AgentsDynamicService agentsDynamicService;

    @PostMapping("/list")
    public ResponseResult<List<AgentsDynamic>> list(
            @RequestBody AgentsDynamicStepParam param
            ) {
        List<AgentsDynamic> list = agentsDynamicService.getList(param);
        return ResponseResult.create(200, list);
    }

    @PostMapping("/insert")
    public ResponseResult<Boolean> insert(@RequestBody AgentsDynamic agentsDynamic) {
        return ResponseResult.create(200, agentsDynamicService.insert(agentsDynamic));
    }

    @GetMapping("/{agent}")
    public ResponseResult<AgentsDynamic> getAgentDynamicByAgent(@PathVariable("agent") Integer agent) {
        return ResponseResult.create(200, agentsDynamicService.getAgentDynamicByAgent(agent));
    }
}

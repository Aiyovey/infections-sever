package com.jd.infectious.controller;

import com.jd.infectious.common.result.ResponseResult;
import com.jd.infectious.domain.AgentsStatic;
import com.jd.infectious.service.AgentsStaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agentsStatic")
public class AgentsStaticController {
    @Autowired
    private AgentsStaticService agentsStaticService;

    @GetMapping("/list")
    public ResponseResult list() {
        List<AgentsStatic> list = agentsStaticService.getList();
        return ResponseResult.create(200, list);
    }

    @PostMapping("/insert")
    public ResponseResult insert(@RequestBody AgentsStatic agentsStatic) {
        return ResponseResult.create(200, agentsStaticService.insert(agentsStatic));
    }

    @GetMapping("/{id}")
    public ResponseResult getAgentDynamicById(@PathVariable("id") Integer id) {
        return ResponseResult.create(200, agentsStaticService.getAgentDynamicById(id));
    }
}

package com.jd.infectious.controller;

import com.jd.infectious.common.result.ResponseResult;
import com.jd.infectious.domain.Parameters;
import com.jd.infectious.service.ParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameters")
public class ParametersController {
    @Autowired
    private ParametersService parametersService;

    @GetMapping("/list")
    public ResponseResult list() {
        List<Parameters> list = parametersService.getList();
        return ResponseResult.create(200, list);
    }

    @PostMapping("/insert")
    public ResponseResult insert(@RequestBody Parameters parameters) {
        return ResponseResult.create(200,parametersService.insert(parameters));
    }

    @GetMapping()
    public ResponseResult getAgentVisitById(@RequestBody String name) {
        return ResponseResult.create(200, parametersService.getAgentDynamicByName(name));
    }
}

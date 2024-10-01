package com.jd.infectious.controller;

import com.jd.infectious.common.result.ResponseResult;
import com.jd.infectious.entity.UserEntity;
import com.jd.infectious.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 127.0.0.1:8080/user/one
    @GetMapping("/one")
    public ResponseResult<UserEntity> getUser(
            @RequestParam Integer userId
    ){
        return ResponseResult.create(200, "第一次运行", userService.getUser(userId));
    }

}

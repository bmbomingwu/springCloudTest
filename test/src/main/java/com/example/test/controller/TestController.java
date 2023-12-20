package com.example.test.controller;

import com.example.test.service.TestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/19 13:45
 **/
@RestController
public class TestController {

    @Resource
    TestService testService;

    @PostMapping("test")
    private String test(){
        System.out.println("666");
        return testService.test();
    }
}

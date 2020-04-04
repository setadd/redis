package com.ffy.spring.example.test.controller;


import com.ffy.spring.example.test.entity.Test;
import com.ffy.spring.example.test.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ffy
 * @since 2020-04-04
 */
@RestController
@Api(tags="问卷")
@RequestMapping("/test")
public class TestController {
    @Autowired
    ITestService testService;

    @ApiOperation("测试")
    @GetMapping("/test")
    public List<Test> test(){
       return  testService.list();
    }
}

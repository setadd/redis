package com.ffy.spring.example.test.service.impl;

import com.ffy.spring.example.test.entity.Test;
import com.ffy.spring.example.test.mapper.TestMapper;
import com.ffy.spring.example.test.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ffy
 * @since 2020-04-04
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}

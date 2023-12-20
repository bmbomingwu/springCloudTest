package com.example.test.service.impl;

import com.example.test.service.TestService;
import com.example.test.springTest.Father;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/19 13:46
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    @Qualifier("son1")
    Map<String, Father> fatherMap;

/*    @Autowired()
    private Father son2;*/

   /* @Resource(type= Son1.class)
    private Father son2;*/

    /*@Resource(type = Son1.class)
    private Father Son1;*/


    @Override
    public String test() {
        return fatherMap.toString();
    }
}

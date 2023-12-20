package com.example.test.springTest;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/19 13:49
 **/
@Component
@Data
public class Son1 extends Father{

    private String name = "son1";
}

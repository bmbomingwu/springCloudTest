package com.example.test.controller;

import com.example.common.http.ResponseResult;
import com.example.common.model.User;
import com.example.common.annotation.LogRequest;
import com.example.test.model.dto.UserDto;
import com.example.test.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/15 14:45
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("2");
        strings.add("4");
        String s = strings.get(2);
        System.out.println(s);
        System.out.println(strings.indexOf("2"));
        System.out.println(strings.get(4));
        String peek = strings.peek();
        System.out.println(strings.peek());
        System.out.println(strings.peek());
        System.out.println(strings.peek());
        System.out.println(strings.peek());


    }

    @Resource
    UserService userService;

    @GetMapping("findAllUser")
    public ResponseResult<List<User>> findAllUser(){
        log.info("66666666");
        return ResponseResult.success(userService.findAllUser());
    }

    @PostMapping("updateUser")
    @LogRequest("修改用户")
    public ResponseResult<Integer> updateUser(@RequestBody UserDto userDto){
        log.info("66666666");
        return ResponseResult.success(userService.updateUser(userDto));
    }

    /**
     * 验证事务
     * @return
     */
    @GetMapping("testTransaction")
    public boolean testTransaction() throws Exception {
        userService.testTransaction();
        return true;
    }

    @GetMapping("clear")
    public boolean clear(){
        userService.clear();
        return true;
    }

}

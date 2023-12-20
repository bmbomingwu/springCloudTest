package com.example.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.common.model.User;
import com.example.test.exception.ServiceException;
import com.example.test.mapper.UserMapper;
import com.example.test.model.dto.UserDto;
import com.example.test.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/15 15:12
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Resource
    UserService userService;

    @Override
    public List<User> findAllUser() {
        LambdaQueryWrapper<User> objectLambdaQueryWrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper<User> between = objectLambdaQueryWrapper
                .select(User::getName, User::getAge)
                .eq(User::getAge,666)
                .between(true, User::getAge,1, 600)
                .or()
                .eq(User::getAge,666)
                .eq(User::getAge,666)
                .eq(User::getAge,666)
                .or()
                .eq(User::getAge,666);
        List<User> users = userMapper.selectList(between);
      //  System.out.println(users);
        return userMapper.findAllUser();
    }

    private void aa()  {
        throw new ServiceException("我是故意的哈哈哈");
    }

    @Override
    //@Transactional
    public void testTransaction() throws Exception {


        updateB();
        userService.updateA();
    }

    @Transactional
    public void updateA() {

        User user = new User();
        user.setId("311631");
        user.setA("a");
        userMapper.updateById(user);
        updateC();


    }

    @Override
    public Integer updateUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return userMapper.updateById(user);
    }

    private void updateC() {
        User user = new User();
        user.setId("311631");
        user.setC("C");
        userMapper.updateById(user);
        updateD();
    }

    @Transactional
    public void updateD() {
        User user = new User();
        user.setId("311631");
        user.setD("D");
        userMapper.updateById(user);
        int i = 1 / 0;
    }

    private void updateB() {
        User user = new User();
        user.setId("311631");
        user.setB("B");
        userMapper.updateById(user);

    }

    @Override
    public void clear() {
        User user = new User();
        user.setId("311631");
        user.setA("");
        user.setB("");
        user.setC("");
        user.setD("");
        user.setE("");
        userMapper.updateById(user);
    }
}

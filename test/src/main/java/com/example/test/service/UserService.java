package com.example.test.service;

import com.example.common.model.User;
import com.example.test.model.dto.UserDto;

import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/15 15:11
 **/
public interface UserService {
    List<User> findAllUser();

    void testTransaction() throws Exception;

    void clear();

    void updateA();

    Integer updateUser(UserDto userDto);
}

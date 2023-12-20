package com.example.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/18 15:44
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> findAllUser();

}

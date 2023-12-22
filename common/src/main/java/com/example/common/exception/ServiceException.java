package com.example.common.exception;

import lombok.Data;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/19 17:30
 **/
@Data
public class ServiceException extends RuntimeException{

    private Integer code;

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Integer code ,String message) {
        super(message);
        this.code = code;
    }
}

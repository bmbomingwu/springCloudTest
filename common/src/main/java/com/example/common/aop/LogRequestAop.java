package com.example.common.aop;

import com.alibaba.fastjson.JSONObject;
import com.example.common.annotation.LogRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/19 18:10
 **/
@Aspect
@Component
@Slf4j
public class LogRequestAop {

    /**
     * 切点（表示只有加了@CountTime注解的方法，才会有统计接口耗时信息）
     */
    @Pointcut("@annotation(com.example.common.annotation.LogRequest) || execution(* com.example.*.*.controller..*.*(..))")
    public void couTime() {

    }

    /**
     * 通知
     */
    @Around("couTime()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {//环绕通知
        long start = System.currentTimeMillis();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();
        String ipAddr = getIpAddr(request);
        LogRequest annotation = ((MethodSignature) proceedingJoinPoint.getSignature()).getMethod().getAnnotation(LogRequest.class);
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        log.info("请求地址：{}", ipAddr);
        log.info("接口：{}", request.getRequestURI());
        log.info("接口名称：<{}>", annotation == null ? "" : annotation.value());
        log.info("入参：{}", Arrays.stream(proceedingJoinPoint.getArgs()).map(JSONObject::toJSONString).collect(Collectors.toList()));
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Object res = proceedingJoinPoint.proceed();
        long result = System.currentTimeMillis() - start;
        log.info("接口：{}耗时：{}毫秒", request.getRequestURI(), result);
        return res;
    }

    private String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        if (StringUtils.isNotBlank(ip) && ip.contains(",")) {
            ip = ip.split(",")[0];
        }

        return "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : ip;
    }


}

package com.example.test.interceptor;

import com.example.common.annotation.MybatisAnno;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Properties;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/22 17:05
 **/
@Intercepts({@Signature(
        type = Executor.class,
        method = "query",
        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
)})
@Component
public class MybatisInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        String mybatisId = mappedStatement.getId();
        String className = mybatisId.substring(0, mybatisId.lastIndexOf("."));
        String methodName = mybatisId.substring(mybatisId.lastIndexOf(".") + 1);
        Class<?> cls = Class.forName(className);
        Method[] method = cls.getMethods();
        MybatisAnno mybatisAnno = null;
        for (Method me : method) {
            if (me.getName().equals(methodName) && me.isAnnotationPresent(MybatisAnno.class)) {
                mybatisAnno = me.getAnnotation(MybatisAnno.class);
            }
        }
        if (mybatisAnno != null) {
            String limit = mybatisAnno.limit();
            int maxAge = mybatisAnno.maxAge();
            String addSql = "age < " + maxAge + "limit " + limit;
            String finalSql = "";
            String sql = mappedStatement.getBoundSql(invocation.getArgs()[1]).getSql();
            if (!sql.contains("where")) {
                finalSql = " where " + addSql;
            } else {
                finalSql = " and " + addSql;
            }

        }


        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Interceptor.super.plugin(target);
    }

    @Override
    public void setProperties(Properties properties) {
        Interceptor.super.setProperties(properties);
    }
}

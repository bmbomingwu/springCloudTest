package com.example.common.listener;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/21 18:17
 **/
public class AfterConfigListener implements SmartApplicationListener, Ordered {


    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return (ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(aClass) ||
                ApplicationPreparedEvent.class.isAssignableFrom(aClass));
    }

    @Override
    public int getOrder() {
        return (ConfigFileApplicationListener.DEFAULT_ORDER + 1);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        String currentIp = getServerInternetIP();
        if (applicationEvent instanceof ApplicationEnvironmentPreparedEvent) {
            System.setProperty("spring.cloud.nacos.discovery.ip", currentIp);
        }
    }


    private String getServerInternetIP() {
        String internetip = "";
        String url = "https://ip.3322.org";
        internetip = HttpRequest.get(url)
                .header(Header.USER_AGENT, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36")
                .execute().body();
        return internetip.trim();
    }
}

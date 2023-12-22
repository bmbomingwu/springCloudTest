package com.example.gateway;



import com.example.gateway.listener.AfterConfigListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GatewayApplication.class);
        springApplication.addListeners(new AfterConfigListener());
        springApplication.run(args);
        log.info("************ GatewayMain9527服务 启动成功 *************");
    }

}

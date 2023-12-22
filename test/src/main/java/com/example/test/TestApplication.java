package com.example.test;


import com.example.common.listener.AfterConfigListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(TestApplication.class);
        springApplication.addListeners(new AfterConfigListener());
        springApplication.run(args);
    }

}

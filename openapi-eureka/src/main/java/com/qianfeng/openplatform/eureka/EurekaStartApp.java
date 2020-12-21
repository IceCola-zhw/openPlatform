package com.qianfeng.openplatform.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description
 * Created by 31667 on 2020/12/22.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaStartApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStartApp.class,args);
        System.out.println("Eureka server start Successful");
    }
}

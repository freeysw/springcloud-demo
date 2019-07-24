package com.yang.test.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yangshuai
 * @Date: 2019/7/23 16:03
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class JobHandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobHandlerApplication.class, args);
    }

}
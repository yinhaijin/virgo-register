package com.lunzhiyu.virgo.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 项目名称: virgo-register
 * 描述:
 * 作者: hakim
 * 创建日期: 2018-05-24.
 * 创建时间: 上午9:13
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class VirgoRegisterApplication {
    public static void main(String[] args){
        SpringApplication.run(VirgoRegisterApplication.class, args);
    }
}

package com.halation.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : Payment8006  //类名
 * @Description : 启动类  //描述
 * @Author : HTB  //作者
 * @Date: 2020-03-15 13:15  //时间
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Payment8006 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8006.class, args);
    }
}

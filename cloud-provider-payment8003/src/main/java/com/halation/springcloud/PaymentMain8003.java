package com.halation.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : PaymentMain8003  //类名
 * @Description : 启动类  //描述
 * @Author : HTB  //作者
 * @Date: 2020-03-14 12:14  //时间
 */


@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8003 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8003.class, args);
    }
}

package com.halation.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MySelfRule  //类名
 * @Description : ribbon规则类  //描述
 * @Author : HTB  //作者
 * @Date: 2020-03-16 12:33  //时间
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机
    }
}

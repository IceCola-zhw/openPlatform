package com.qianfeng.openplatform.eureka.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Description
 * Created by 31667 on 2020/12/22.
 */

//我们的eureka配置,防止无法注册
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()//禁用掉csrf防攻击,防止我们的服务无法注册
        .authorizeRequests()//所有的请求需要认证
        .mvcMatchers("/eureka/**").permitAll()//注册地址放行
        .mvcMatchers("/actuator/**").permitAll()
                .anyRequest().authenticated().and().httpBasic();
    }
}

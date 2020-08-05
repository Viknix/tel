package com.itluma.tel.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.itluma.tel")
@MapperScan("com.itluma.tel.mapper")
public class SpringConfig {
}

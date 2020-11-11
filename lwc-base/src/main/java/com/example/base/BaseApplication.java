package com.example.base;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.example.base.mapper")
@EnableSwagger2
public class BaseApplication  extends SpringBootServletInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseApplication.class);

    public static void main(String[] args) {

        LOGGER.debug("[class: BaseApplication.java]-[method: main]-[function: {}] [参数/结果]: {}", "项目启动",null);

        SpringApplication.run(BaseApplication.class, args);
    }

}

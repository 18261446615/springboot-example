package com.example.channel;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDubboConfiguration
@EnableSwagger2
public class ChannelApplication extends SpringBootServletInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChannelApplication.class);

    public static void main(String[] args) {

        LOGGER.debug("[class: ChannelApplication.java]-[method: main]-[function: {}] [参数/结果]: {}", "项目启动",null);

        SpringApplication.run(ChannelApplication.class, args);
    }

}

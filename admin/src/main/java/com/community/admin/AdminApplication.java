package com.community.admin;

import org.broadleafcommerce.common.config.EnableBroadleafAdminAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableAutoConfiguration
public class AdminApplication extends SpringBootServletInitializer{

    @Configuration
    @EnableBroadleafAdminAutoConfiguration
    public static class BroadleafFrameworkConfiguration {}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AdminApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
 
}


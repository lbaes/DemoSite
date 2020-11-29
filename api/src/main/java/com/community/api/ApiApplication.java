package com.community.api;

import org.broadleafcommerce.common.config.EnableBroadleafSiteRootAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Elbert Bautista (elbertbautista)
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ApiApplication extends SpringBootServletInitializer{

    @Configuration
    @EnableBroadleafSiteRootAutoConfiguration
    public static class BroadleafFrameworkConfiguration {}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
    
}

package com.qkmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * {@code @ClassName} GatewaySpringApplication
 * {@code @Description} TODO
 * {@code @Author} ZYL
 * {@code @Date} 2023/5/16 9:32
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GatewaySpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewaySpringApplication.class,args);
    }
}

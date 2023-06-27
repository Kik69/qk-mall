package com.qkmall.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * {@code @ClassName} ItemSpringApplication
 * {@code @Description} TODO
 * {@code @Author} ZYL
 * {@code @Date} 2023/5/20 16:44
 */
@SpringBootApplication
@EnableFeignClients
public class ItemSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemSpringApplication.class,args);
    }
}

package com.qkmall.item;

import com.qkmall.item.feign.MemberFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @ClassName} ItemSpringApplication
 * {@code @Description} TODO
 * {@code @Author} ZYL
 * {@code @Date} 2023/5/20 16:44
 */
@SpringBootApplication
@EnableFeignClients
@RestController
public class ItemSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemSpringApplication.class,args);
    }
}

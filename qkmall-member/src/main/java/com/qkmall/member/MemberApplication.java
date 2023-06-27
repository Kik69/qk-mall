package com.qkmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @ClassName} MemberApplication
 * {@code @Description} TODO
 * {@code @Author} ZYL
 * {@code @Date} 2023/5/24 20:32
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
    }
    
    @GetMapping("/member/test")
    public String test(){
        return "1213";
    }
}

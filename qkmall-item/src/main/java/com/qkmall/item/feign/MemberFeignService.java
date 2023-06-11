package com.qkmall.item.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * {@code @ClassName} MemberFeignService
 * {@code @Description} TODO
 * {@code @Author} ZYL
 * {@code @Date} 2023/5/24 20:40
 */
@FeignClient("qkmall-member")
public interface MemberFeignService {
    @GetMapping("/member/test")
    String test();
}

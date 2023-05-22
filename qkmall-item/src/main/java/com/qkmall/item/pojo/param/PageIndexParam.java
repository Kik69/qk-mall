package com.qkmall.item.pojo.param;

import com.qkmall.common.VO;
import lombok.Getter;
import lombok.Setter;

/**
 * {@code @ClassName} PageIndexParam
 * {@code @Description} TODO
 * {@code @Author} ZYL
 * {@code @Date} 2023/5/21 20:00
 */
@Getter
@Setter
public class PageIndexParam implements VO {
    private String index;
    
    private String count;
}

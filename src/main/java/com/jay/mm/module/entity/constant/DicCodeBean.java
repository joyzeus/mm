package com.jay.mm.module.entity.constant;

import lombok.Data;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/10 11:15
 */
@Data
public class DicCodeBean {

    public final Integer code;
    public final String text;

    public DicCodeBean(Integer code, String text) {
        this.code = code;
        this.text = text;
    }
}

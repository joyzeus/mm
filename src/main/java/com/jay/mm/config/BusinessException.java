package com.jay.mm.config;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/3 11:01
 */
public class BusinessException extends RuntimeException {

    private Integer code;

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

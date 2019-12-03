package com.jay.mm.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/11/22 14:16
 */
@Data
public class CommonResult implements Serializable {

    private int code;
    private String message;
    private Object data;

    public static CommonResult success() {
        return success("");
    }

    public static <T> CommonResult success(T t) {
        CommonResult result = new CommonResult();
        result.setCode(CommonCode.SUCCESS);
        result.setMessage("请求成功");
        result.setData(t);
        return result;
    }

    public static <T> CommonResult error(String message) {
        return error(message, null);
    }

    public static <T> CommonResult error(T t) {
        return error("系统异常", t);
    }

    public static <T> CommonResult error(String message, T t) {
        CommonResult result = new CommonResult();
        result.setCode(CommonCode.INTERNAL_ERROR);
        result.setMessage(message);
        result.setData(t);
        return result;
    }

    public static <T> CommonResult customResult(int code, String message, T t) {
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMessage(message);
        result.setData(t);
        return result;
    }
}

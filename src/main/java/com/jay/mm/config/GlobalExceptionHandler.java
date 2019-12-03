package com.jay.mm.config;

import com.jay.mm.common.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/3 10:47
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public CommonResult handleBusinessException(BusinessException businessException) {
        if (businessException.getCode() != null) {
            return CommonResult.error(businessException.getMessage(), businessException.getCode());
        }
        return CommonResult.error(businessException.getCode());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResult handleUnprocessedException(Exception exception) {


        return CommonResult.error("系统内部错误");
    }
}

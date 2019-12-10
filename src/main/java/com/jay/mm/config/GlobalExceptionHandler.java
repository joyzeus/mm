package com.jay.mm.config;

import com.jay.mm.common.CommonResult;
import com.jay.mm.module.entity.constant.ErrorLogEnum;
import com.jay.mm.module.entity.doo.ErrorLog;
import com.jay.mm.module.service.base.ErrorLogService;
import org.apache.catalina.util.RequestUtil;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

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

    private final ErrorLogService errorLogService;

    public GlobalExceptionHandler(ErrorLogService errorLogService) {
        this.errorLogService = errorLogService;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResult handleBusinessException(Exception exception, HttpServletRequest request) {
        try {
            errorLogService.insertErrorLog(ErrorLog.Builder.anErrorLog()
                    .withMessage(ExceptionUtils.getStackTrace(exception))
                    .withType(ErrorLogEnum.TypeEnum.BUSINESS.getCode())
                    .withUrl("")
                    .build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (exception instanceof BusinessException) {
            BusinessException businessException = (BusinessException) exception;
            if (businessException.getCode() != null) {
                return CommonResult.error(businessException.getMessage(), businessException.getCode());
            }
            return CommonResult.error(businessException.getCode());
        } else {

            return CommonResult.error("系统内部异常");
        }
    }
}

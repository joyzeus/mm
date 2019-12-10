package com.jay.mm.module.entity.constant;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/10 11:23
 */
public class ErrorLogEnum {

    public enum TypeEnum implements IDicTable {

        /**
         * 业务逻辑错误
         */
        BUSINESS(1, "业务异常"),
        /**
         * 系统内部错误
         */
        INTERNAL(2, "服务器异常"),
        ;

        TypeEnum(Integer code, String text) {
            DicCodePool.putDic(this, code, text);
        }
    }
}

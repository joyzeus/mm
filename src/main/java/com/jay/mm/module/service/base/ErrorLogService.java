package com.jay.mm.module.service.base;

import com.jay.mm.module.entity.doo.ErrorLog;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/10 10:52
 */
public interface ErrorLogService {

    /**
     * 插入错误日志
     *
     * @param errorLog 错误记录
     * @return 印象数据库的条数
     */
    Integer insertErrorLog(ErrorLog errorLog);
}

package com.jay.mm.module.service.impl;

import com.jay.mm.module.dao.ErrorLogMapper;
import com.jay.mm.module.entity.doo.ErrorLog;
import com.jay.mm.module.service.base.ErrorLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/10 10:52
 */
@Service
public class ErrorLogServiceImpl implements ErrorLogService {

    private final ErrorLogMapper errorLogMapper;

    @Autowired(required = false)
    public ErrorLogServiceImpl(ErrorLogMapper errorLogMapper) {
        this.errorLogMapper = errorLogMapper;
    }

    @Override
    public Integer insertErrorLog(ErrorLog errorLog) {
        return errorLogMapper.insertSelective(errorLog);
    }
}

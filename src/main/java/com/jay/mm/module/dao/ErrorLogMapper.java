package com.jay.mm.module.dao;

import com.jay.mm.module.entity.doo.ErrorLog;

/**
 * @author zhoux
 * @date 2019/12/10
 */
public interface ErrorLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(ErrorLog record);

    ErrorLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErrorLog record);

    int updateByPrimaryKeyWithBLOBs(ErrorLog record);
}
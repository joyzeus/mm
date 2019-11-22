package com.jay.mm.module.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/11/22 14:26
 */
@Data
public class UserLoginVO implements Serializable {

    private String mobile;
    private String password;
}

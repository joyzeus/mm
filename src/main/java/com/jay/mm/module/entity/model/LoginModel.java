package com.jay.mm.module.entity.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/10 10:12
 */
@Data
public class LoginModel implements Serializable {

    private String token;

    private String nickName;
    private String mobile;
    private String headImage;
}

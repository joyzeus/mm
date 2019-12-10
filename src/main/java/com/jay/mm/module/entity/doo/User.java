package com.jay.mm.module.entity.doo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhouxu
 * @date 2019/12/10
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String account;

    private String mobile;

    private String email;

    private String password;

    private String nickname;

    private String headImage;

    private Date lastLoginTime;

    private Date createTime;

    private Integer loginCount;

    private Boolean locked;
}
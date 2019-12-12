package com.jay.mm.module.entity.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/12 9:16
 */
@Data
public class PermissionModel implements Serializable {

    private Integer id;

    private String name;

    private String path;

    private Integer orderId;

    private List<PermissionModel> childList;
}

package com.jay.mm.module.service.base;

import com.jay.mm.module.entity.model.PermissionModel;

import java.util.List;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/11 16:53
 */
public interface RoleService {
    /**
     * @return
     */
    List<PermissionModel> getPermissionTree();
}

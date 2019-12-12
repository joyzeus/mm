package com.jay.mm.module.service.impl;

import com.jay.mm.module.dao.PermissionMapper;
import com.jay.mm.module.dao.RoleMapper;
import com.jay.mm.module.entity.doo.Permission;
import com.jay.mm.module.entity.model.PermissionModel;
import com.jay.mm.module.service.base.RoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/11 16:53
 */
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleMapper roleMapper;

    private final PermissionMapper permissionMapper;

    @Autowired(required = false)
    public RoleServiceImpl(RoleMapper roleMapper, PermissionMapper permissionMapper) {
        this.roleMapper = roleMapper;
        this.permissionMapper = permissionMapper;
    }

    @Override
    public List<PermissionModel> getPermissionTree() {
        List<Permission> list = permissionMapper.getList(null);
        return getChildList(list, 0);
    }

    private List<PermissionModel> getChildList(List<Permission> permissionList, Integer parentId) {
        List<Permission> list = permissionList.stream().filter(p -> p.getParentId().intValue() == parentId).collect(Collectors.toList());
        return list.stream().map(p -> {
            PermissionModel permissionModel = new PermissionModel();
            BeanUtils.copyProperties(p, permissionModel);
            permissionModel.setChildList(getChildList(permissionList, p.getId()));
            return permissionModel;
        }).collect(Collectors.toList());
    }
}
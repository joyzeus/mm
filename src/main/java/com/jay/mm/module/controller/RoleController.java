package com.jay.mm.module.controller;

import com.jay.mm.common.CommonResult;
import com.jay.mm.module.service.base.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/12/11 16:16
 */
@RestController
@RequestMapping("/sys/admin/role")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/list")
    public CommonResult getPermissionList() {
        return CommonResult.success(roleService.getPermissionTree());
    }
}
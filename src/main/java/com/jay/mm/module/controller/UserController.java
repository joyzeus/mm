package com.jay.mm.module.controller;

import com.jay.mm.common.CommonResult;
import com.jay.mm.common.JWTConstant;
import com.jay.mm.common.JWTUtil;
import com.jay.mm.module.entity.doo.User;
import com.jay.mm.module.entity.model.LoginModel;
import com.jay.mm.module.entity.vo.UserLoginVO;
import com.jay.mm.module.service.base.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/11/22 14:14
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    private final UserService userService;

    private final JWTUtil jwtUtil;

    @Autowired(required = false)
    public UserController(UserService userService, JWTUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public CommonResult login(@RequestBody UserLoginVO userLoginVO, HttpServletRequest request) {
        //验证入参
        String mobile = userLoginVO.getMobile();
        String password = userLoginVO.getPassword();
        if (StringUtils.isBlank(mobile) || StringUtils.isBlank(password)) {
            return CommonResult.error("手机号或者密码不能为空");
        }

        //查询账号
        User user = userService.selectByMobile(mobile);
        if (user == null) {
            return CommonResult.error("账号或者密码错误");
        }

        //验证密码
        if (!StringUtils.equals(DigestUtils.md5Hex(password), user.getPassword())) {
            return CommonResult.error("账号或者密码错误");
        }

        if (user.getLocked()) {
            return CommonResult.error("当前账号已经锁定,请稍后重试");
        }

        //生成token
        String jwt = jwtUtil.createJWT(JWTConstant.JWT_LOGIN, user, JWTConstant.LOGIN_EXPIRED_TIME);

        LoginModel loginModel = new LoginModel();
        loginModel.setToken(jwt);
        loginModel.setMobile(user.getMobile());
        loginModel.setNickName(user.getAccount());
        loginModel.setHeadImage(user.getHeadImage());

        return CommonResult.success(loginModel);
    }

    @GetMapping("/test")
    public CommonResult login() {
        return CommonResult.error(1/0);
    }
}

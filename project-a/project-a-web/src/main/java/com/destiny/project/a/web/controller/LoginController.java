package com.destiny.project.a.web.controller;

import com.destiny.project.a.api.LoginServiceFacade;
import com.destiny.project.a.api.param.LoginParam;
import com.destiny.project.a.api.result.LoginResult;
import com.destiny.project.api.doc.ApiVersion;
import com.destiny.project.framework.base.api.Result;
import com.destiny.project.framework.base.utils.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.destiny.project.api.doc.ApiVersionConstant;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
@Api(value = "LoginController", tags = {"用户登录相关操作接口"})
public class LoginController {
    @Resource
    LoginServiceFacade loginServiceFacade;

    @PostMapping("/userLogin")
    @ApiOperation(value = "用户登录接口")
    @ApiVersion(group = ApiVersionConstant.VERSION_1_0_0)
    public Result<LoginResult> userLogin(@RequestBody LoginParam param) {
        if (StringUtil.isBlank(param.getUserName())) {
            return Result.buildFail("用户名必传");
        } else if (StringUtil.isBlank(param.getPassword())) {
            return Result.buildFail("用户密码必传");
        }
        return loginServiceFacade.userLogin(param);
    }
}

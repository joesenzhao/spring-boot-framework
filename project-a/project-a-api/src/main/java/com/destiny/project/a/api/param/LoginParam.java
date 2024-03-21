package com.destiny.project.a.api.param;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LoginParam {
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("密码")
    private String password;
}

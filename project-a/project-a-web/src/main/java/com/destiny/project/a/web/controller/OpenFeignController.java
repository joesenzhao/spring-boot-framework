package com.destiny.project.a.web.controller;

import com.alibaba.nacos.shaded.io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import com.destiny.project.a.api.FeignServiceFacade;
import com.destiny.project.a.api.param.OrderRequestParam;
import com.destiny.project.api.doc.ApiVersion;
import com.destiny.project.api.doc.ApiVersionConstant;
import com.destiny.project.b.api.param.OrderParam;
import com.destiny.project.b.api.result.OrderResult;
import com.destiny.project.framework.base.api.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/feign")
public class OpenFeignController {
    @Resource
    FeignServiceFacade feignServiceFacade;

    @PostMapping("/getOrderList")
    @ApiOperation(value = "远程调用订单接口")
    @ApiVersion(group = ApiVersionConstant.VERSION_1_0_0)
    public Result<List<OrderResult>>getOrderList(@RequestBody OrderRequestParam param){
        OrderParam orderParam = new OrderParam();
        BeanUtils.copyProperties(param,orderParam);
        return feignServiceFacade.getOrderList(orderParam);
    }

    @PostMapping("/clientTest")
    @ApiOperation(value = "远程调用订单接口")
    @ApiVersion(group = ApiVersionConstant.VERSION_1_0_0)
    public Result<?>clientTest(){
        return Result.buildSuccess(feignServiceFacade.clientTest());
    }
}

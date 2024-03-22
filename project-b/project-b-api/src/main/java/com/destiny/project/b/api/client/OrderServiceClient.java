package com.destiny.project.b.api.client;

import com.destiny.project.b.api.param.OrderParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.destiny.project.b.api.result.OrderResult;
import com.destiny.project.framework.base.api.Result;

import java.util.List;

@FeignClient(value = "project-b", contextId = "orderServiceClient")
public interface OrderServiceClient {

    @PostMapping("/order/getOrderList")
    Result<List<OrderResult>> getOrderList(@RequestBody OrderParam param);

    @GetMapping("/order/clientTest")
    String clientTest();

}

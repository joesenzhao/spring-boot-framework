package com.destiny.project.a.service;

import com.destiny.project.a.api.FeignServiceFacade;
import com.destiny.project.b.api.client.OrderServiceClient;
import com.destiny.project.b.api.param.OrderParam;
import com.destiny.project.b.api.result.OrderResult;
import com.destiny.project.framework.base.api.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "feignServiceFacade")
public class FeignServiceFacadeImpl implements FeignServiceFacade {
    @Resource
    private OrderServiceClient orderServiceClient;

    @Override
    public Result<List<OrderResult>> getOrderList(OrderParam param) {
        return orderServiceClient.getOrderList(param);
    }

    @Override
    public String clientTest() {
        return orderServiceClient.clientTest();
    }
}

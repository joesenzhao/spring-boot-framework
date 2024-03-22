package com.destiny.project.a.api;

import com.destiny.project.b.api.param.OrderParam;
import com.destiny.project.b.api.result.OrderResult;
import com.destiny.project.framework.base.api.Result;

import java.util.List;

public interface FeignServiceFacade {
    Result<List<OrderResult>> getOrderList(OrderParam param);

    String clientTest();
}

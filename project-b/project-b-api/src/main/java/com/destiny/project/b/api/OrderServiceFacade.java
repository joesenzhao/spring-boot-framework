package com.destiny.project.b.api;


import com.destiny.project.b.api.param.OrderParam;
import com.destiny.project.b.api.result.OrderResult;
import com.destiny.project.framework.base.api.Result;

import java.util.List;

public interface OrderServiceFacade {
    Result<List<OrderResult>> getOrderById(OrderParam param);
}

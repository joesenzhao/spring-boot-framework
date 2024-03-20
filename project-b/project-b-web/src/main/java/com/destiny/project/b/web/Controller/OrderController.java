package com.destiny.project.b.web.Controller;

import com.destiny.project.b.api.OrderServiceFacade;
import com.destiny.project.b.api.param.OrderParam;
import com.destiny.project.b.api.result.OrderResult;
import com.destiny.project.framework.base.api.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController
{
    @Resource
    OrderServiceFacade orderServiceFacade;

    @PostMapping("/getOrderList")
    public Result<List<OrderResult>>getOrderList(@RequestBody OrderParam orderParam){
        return orderServiceFacade.getOrderById(orderParam);
    }

}

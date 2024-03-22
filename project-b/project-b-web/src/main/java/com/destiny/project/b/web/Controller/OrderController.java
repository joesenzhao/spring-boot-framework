package com.destiny.project.b.web.Controller;

import com.destiny.project.b.api.OrderServiceFacade;
import com.destiny.project.b.api.param.OrderParam;
import com.destiny.project.b.api.result.OrderResult;
import com.destiny.project.framework.base.api.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController
{
    @Resource
    private OrderServiceFacade orderServiceFacade;

    @PostMapping("/getOrderList")
    public Result<List<OrderResult>>getOrderList(@RequestBody OrderParam orderParam){
        return orderServiceFacade.getOrderList(orderParam);
    }

    @GetMapping("/clientTest")
    public Result<?>clientTest(){
        return Result.buildSuccess(orderServiceFacade.clientTest());
    }

}

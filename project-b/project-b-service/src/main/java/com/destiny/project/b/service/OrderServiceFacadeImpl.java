package com.destiny.project.b.service;

import com.destiny.project.a.dao.mapper.OrderMapper;
import com.destiny.project.a.dao.model.Order;
import com.destiny.project.a.dao.model.OrderExample;
import com.destiny.project.b.api.OrderServiceFacade;
import com.destiny.project.b.api.param.OrderParam;
import com.destiny.project.b.api.result.OrderResult;
import com.destiny.project.framework.base.api.Result;
import com.destiny.project.framework.base.utils.StringUtil;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service("orderServiceFacade")
public class OrderServiceFacadeImpl implements OrderServiceFacade {
    @Resource
    private OrderMapper orderMapper;

    @Override
    public Result<List<OrderResult>> getOrderList(OrderParam param) {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        List<Order> orders = orderMapper.selectByExample(orderExample);
        if(StringUtil.isNotBlank(param.getApplyNo())){
            criteria.andApplyNoEqualTo(param.getApplyNo());
        }
        if(CollectionUtils.isEmpty(orders)){
          return Result.buildFail("查询失败");
        }
        List<OrderResult> resultList = new ArrayList<>();
        for (Order order : orders) {
            OrderResult orderResult = new OrderResult();
            BeanUtils.copyProperties(order,orderResult);
            resultList.add(orderResult);
        }
        return Result.buildSuccess(resultList);
    }

    @Override
    public String clientTest() {
        return "成功";
    }
}

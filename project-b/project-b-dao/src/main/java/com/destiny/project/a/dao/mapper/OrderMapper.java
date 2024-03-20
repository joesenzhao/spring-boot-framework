package com.destiny.project.a.dao.mapper;

import com.destiny.project.a.dao.model.Order;
import com.destiny.project.a.dao.model.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2024/03/20
*/
public interface OrderMapper {
    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    long countByExample(OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    int deleteByExample(OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    int deleteByPrimaryKey(String pkId);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    int insert(Order record);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    int insertSelective(Order record);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    List<Order> selectByExample(OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    Order selectByPrimaryKey(String pkId);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     *
     * @mbg.generated 2024-03-20 20:32:23
     */
    int updateByPrimaryKey(Order record);
}
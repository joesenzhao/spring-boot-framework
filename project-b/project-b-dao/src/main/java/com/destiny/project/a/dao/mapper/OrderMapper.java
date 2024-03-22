package com.destiny.project.a.dao.mapper;

import com.destiny.project.a.dao.model.Order;
import com.destiny.project.a.dao.model.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2024/03/22
*/
public interface OrderMapper {
    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    long countByExample(OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    int deleteByExample(OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    int deleteByPrimaryKey(String pkId);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    int insert(Order record);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    int insertSelective(Order record);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    List<Order> selectByExample(OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    Order selectByPrimaryKey(String pkId);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     *
     * @mbg.generated 2024-03-22 17:20:04
     */
    int updateByPrimaryKey(Order record);
}
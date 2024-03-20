package com.destiny.project.a.dao.mapper;

import com.destiny.project.a.dao.model.User;
import com.destiny.project.a.dao.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2024/03/20
*/
public interface UserMapper {
    /**
     *
     * @mbg.generated 2024-03-20 20:34:11
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:34:11
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:34:11
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2024-03-20 20:34:11
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2024-03-20 20:34:11
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:34:11
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated 2024-03-20 20:34:11
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}
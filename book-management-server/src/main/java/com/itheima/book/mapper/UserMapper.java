package com.itheima.book.mapper;

import com.itheima.book.entity.User;
import org.apache.ibatis.annotations.Select;

/**
* @author san qian
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2024-06-26 08:32:16
* @Entity com.itheima.book.entity.User
*/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    @Select("select * from user where username=#{username}")
    User selectByusername(String username);
}

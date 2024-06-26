package com.itheima.book.mapper;


import com.itheima.book.entity.Author;

/**
* @author san qian
* @description 针对表【author(作者表)】的数据库操作Mapper
* @createDate 2024-06-26 08:32:16
* @Entity com.itheima.book.entity.Author
*/
public interface AuthorMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);

}

package com.itheima.book.mapper;

import com.itheima.book.entity.Book;

/**
* @author san qian
* @description 针对表【book(图书表)】的数据库操作Mapper
* @createDate 2024-06-26 08:32:16
* @Entity com.itheima.book.entity.Book
*/
public interface BookMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

}

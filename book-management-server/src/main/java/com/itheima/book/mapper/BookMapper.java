package com.itheima.book.mapper;

import com.itheima.book.entity.Book;
import com.itheima.book.mapper.sql.BookMapperSQL;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

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

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    @SelectProvider(type = BookMapperSQL.class, method = "selectByName")
    List<Book> selectByName(String name);
}

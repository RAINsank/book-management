package com.itheima.book.mapper;


import com.itheima.book.entity.Author;
import com.itheima.book.mapper.sql.AuthorMapperSQL;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
* @author san qian
* @description 针对表【author(作者表)】的数据库操作Mapper
* @createDate 2024-06-26 08:32:16
* @Entity com.itheima.book.entity.Author
*/
public interface AuthorMapper {
    @SelectProvider(type = AuthorMapperSQL.class, method = "selectByAuthor")
    List<Author> selectByAuthor(String name);

    int deleteByPrimaryKey(Integer id);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
    @Delete("delete from author where name=#{name}")
    void deleteByName(String author);
}

package com.itheima.book.mapper.sql;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.ObjectUtils;

import java.util.Objects;

/**
 * @author san qian
 **/
public class AuthorMapperSQL {
    public String selectByAuthor(String name){
        SQL sql = new SQL();
        sql.SELECT("*");
        sql.FROM("author");
        if (!(name==null|| Objects.equals(name, ""))){
            sql.WHERE("name=#{name}");
        }
        return sql.toString();
    }
}

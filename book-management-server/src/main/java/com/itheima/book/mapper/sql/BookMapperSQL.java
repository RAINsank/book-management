package com.itheima.book.mapper.sql;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.ObjectUtils;

import java.lang.invoke.VarHandle;
import java.util.Objects;

/**
 * @author san qian
 **/
public class BookMapperSQL {
    public String selectByName(String name){
        SQL sql = new SQL();
        sql.SELECT("*");
        sql.FROM("book");
        if(!(name==null||Objects.equals(name, ""))){
            sql.WHERE("name = #{name}");
        }
        return sql.toString();
    }
}

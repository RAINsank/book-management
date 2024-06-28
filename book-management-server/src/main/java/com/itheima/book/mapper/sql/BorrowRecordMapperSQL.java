package com.itheima.book.mapper.sql;

import com.itheima.book.dto.RecordDto;
import com.itheima.book.entity.BorrowRecord;
import org.apache.ibatis.jdbc.SQL;

import java.util.Arrays;

/**
 * @author san qian
 **/
public class BorrowRecordMapperSQL {
    public String borrowBooks(RecordDto dto) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO borrow_record (user_id, book_id, borrow_date, return_date) VALUES ");

        for (int i = 0; i < dto.getBookId().length; i++) {
            sql.append("(")
                    .append("#{userId}, ")
                    .append(Arrays.stream(dto.getBookId()).toList().get(i)).append(", ")
                    .append("#{borrowDate}, ")
                    .append("#{returnDate}")
                    .append(")");

            if (i < dto.getBookId().length - 1) {
                sql.append(", ");
            }
        }

        return sql.toString();
    }
    public String deleteBytimer(){
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM borrow_record\n" +
                "WHERE return_date < DATE_FORMAT(NOW() ,'%Y-%m-01');");
        return sql.toString();
    }
}

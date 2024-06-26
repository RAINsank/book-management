package com.itheima.book.entity;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 借阅记录表
 * @TableName borrow_record
 */
@Data
public class BorrowRecord implements Serializable {
    /**
     * 借阅记录ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 图书ID
     */
    private Integer bookId;

    /**
     * 借阅日期
     */
    private LocalDate borrowDate;

    /**
     * 归还日期
     */
    private LocalDate returnDate;

    private static final long serialVersionUID = 1L;
}
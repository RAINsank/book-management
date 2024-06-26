package com.itheima.book.entity;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

/**
 * 图书表
 * @TableName book
 */
@Data
@Builder
public class Book implements Serializable {
    /**
     * 图书ID
     */
    private Integer id;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 作者ID
     */
    private Integer authorId;

    /**
     * 出版社
     */
    private String publisher;

    /**
     * 出版日期
     */
    private LocalDate publicationDate;

    private static final long serialVersionUID = 1L;
}
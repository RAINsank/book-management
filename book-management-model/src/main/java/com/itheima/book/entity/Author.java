package com.itheima.book.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 作者表
 * @TableName author
 */
@Data
public class Author implements Serializable {
    /**
     * 作者ID
     */
    private Integer id;

    /**
     * 作者姓名
     */
    private String name;

    private static final long serialVersionUID = 1L;
}
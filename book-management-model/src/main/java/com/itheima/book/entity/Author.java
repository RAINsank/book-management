package com.itheima.book.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者表
 * @TableName author
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
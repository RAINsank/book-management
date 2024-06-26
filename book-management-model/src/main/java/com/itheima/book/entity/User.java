package com.itheima.book.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表
 * @TableName user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    private static final long serialVersionUID = 1L;
}
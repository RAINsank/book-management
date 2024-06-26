package com.itheima.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author san qian
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto implements Serializable {
    private String username;
    private String password;
}

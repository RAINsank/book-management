package com.itheima.book.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author san qian
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAddDto implements Serializable {
    String username;
    String password;
}

package com.itheima.book.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author san qian
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginVo {
    private String username;
    private String id;
}

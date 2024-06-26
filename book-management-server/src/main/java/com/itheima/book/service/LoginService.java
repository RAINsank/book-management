package com.itheima.book.service;

import com.itheima.book.dto.LoginDto;
import com.itheima.book.dto.UserAddDto;
import com.itheima.book.vo.LoginVo;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author san qian
 **/
public interface LoginService {
    LoginVo login(@RequestBody LoginDto dto);

    void add(UserAddDto dto);
}

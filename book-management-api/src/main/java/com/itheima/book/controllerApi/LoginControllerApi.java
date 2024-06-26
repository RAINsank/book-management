package com.itheima.book.controllerApi;

import com.itheima.book.dto.LoginDto;
import com.itheima.book.dto.UserAddDto;
import com.itheima.book.response.ResponseResult;
import com.itheima.book.vo.LoginVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author san qian
 **/
@RequestMapping("/api/login")
public interface LoginControllerApi {
    //登录接口
    @PostMapping
    ResponseResult<LoginVo> login(LoginDto dto);
    //注册用户接口
    @PutMapping
    ResponseResult add(UserAddDto dto);

}

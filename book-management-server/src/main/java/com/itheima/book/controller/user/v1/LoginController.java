package com.itheima.book.controller.user.v1;

import com.itheima.book.controllerApi.LoginControllerApi;
import com.itheima.book.dto.LoginDto;
import com.itheima.book.response.ResponseResult;
import com.itheima.book.service.LoginService;
import com.itheima.book.vo.LoginVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author san qian
 **/
@RestController
public class LoginController implements LoginControllerApi {
    final
    LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public ResponseResult<LoginVo> login(@RequestBody LoginDto dto) {
        LoginVo vo =loginService.login(dto);
        return ResponseResult.ok(vo);
    }
}

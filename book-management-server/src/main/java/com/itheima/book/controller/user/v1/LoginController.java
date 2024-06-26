package com.itheima.book.controller.user.v1;

import com.itheima.book.constant.JwtClaimsConstant;
import com.itheima.book.controllerApi.LoginControllerApi;
import com.itheima.book.dto.LoginDto;
import com.itheima.book.dto.UserAddDto;
import com.itheima.book.properties.JwtProperties;
import com.itheima.book.response.ResponseResult;
import com.itheima.book.service.LoginService;
import com.itheima.book.util.JwtUtil;
import com.itheima.book.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author san qian
 **/
@RestController
public class LoginController implements LoginControllerApi {
    final
    JwtProperties jwtProperties;
    final
    LoginService loginService;

    public LoginController(LoginService loginService, JwtProperties jwtProperties) {
        this.loginService = loginService;
        this.jwtProperties = jwtProperties;
    }

    @Override
    public ResponseResult<LoginVo> login(@RequestBody LoginDto dto) {
        LoginVo vo =loginService.login(dto);
        Map<String, Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.USER_ID, vo.getId());
        String token = JwtUtil.createJWT(
                jwtProperties.getUserSecretKey(),
                jwtProperties.getUserTtl(),
                claims);
        vo.setToken(token);
        return ResponseResult.ok(vo);
    }

    @Override
    public ResponseResult add(@RequestBody UserAddDto dto) {
        loginService.add(dto);
        return ResponseResult.ok();
    }
}

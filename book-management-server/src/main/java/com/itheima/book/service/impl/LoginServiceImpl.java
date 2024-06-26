package com.itheima.book.service.impl;

import com.itheima.book.dto.LoginDto;
import com.itheima.book.dto.UserAddDto;
import com.itheima.book.entity.User;
import com.itheima.book.enums.CodeEnum;
import com.itheima.book.exception.Exceptions;
import com.itheima.book.mapper.UserMapper;
import com.itheima.book.service.LoginService;
import com.itheima.book.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @author san qian
 **/
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserMapper userMapper;
    @Override
    public LoginVo login(LoginDto dto) {
        //参数校验
        if(ObjectUtils.isEmpty(dto)||ObjectUtils.isEmpty(dto.getUsername())||ObjectUtils.isEmpty(dto.getPassword())){
            Exceptions.cast(CodeEnum.DATA_ERROR);
        }
        //业务处理
        User user = userMapper.selectByusername(dto.getUsername());
        if(ObjectUtils.isEmpty(user)){
            Exceptions.cast(CodeEnum.NO_RESPONSE_DATA);
        }
        if (!user.getPassword().equals(dto.getPassword())){
            Exceptions.cast(CodeEnum.SYSTEM_PASSWORD_ERROR);
        }
        LoginVo vo = LoginVo.builder().
                id(String.valueOf(user.getId())).
                username(user.getUsername()).
                build();
        return vo;
    }

    @Override
    public void add(UserAddDto dto) {
        if(ObjectUtils.isEmpty(dto)||ObjectUtils.isEmpty(dto.getUsername())||ObjectUtils.isEmpty(dto.getPassword())){
            Exceptions.cast(CodeEnum.DATA_ERROR);
        }
        User user1 = User.builder().
                username(dto.getUsername()).
                password(dto.getPassword()).
                build();
        userMapper.insert(user1);
    }
}

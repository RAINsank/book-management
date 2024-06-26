package com.itheima.book.controller.user.v1;

import com.itheima.book.controllerApi.UserControllerApi;
import com.itheima.book.response.ResponseResult;
import com.itheima.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author san qian
 **/
@RestController
public class UserController implements UserControllerApi {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseResult borrowBooks(@PathVariable Integer[] ids) {
        userService.borrowBooks(ids);
        return ResponseResult.ok();
    }

    @Override
    public ResponseResult returnBook(Integer id) {
        userService.returnBook(id);
        return ResponseResult.ok();
    }
}

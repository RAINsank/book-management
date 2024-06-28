package com.itheima.book.controller.user.v1;

import com.itheima.book.controllerApi.UserControllerApi;
import com.itheima.book.entity.Book;
import com.itheima.book.response.ResponseResult;
import com.itheima.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author san qian
 **/
@RestController
public class UserController implements UserControllerApi {
    @Autowired
    UserService userService;
    final
    RedisTemplate redisTemplate;

    public UserController(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
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

    @Override
    public ResponseResult<List<Book>> getBook() {
        List<Book> list = (List<Book>) redisTemplate.opsForValue().get("book_list");
        if(list != null && list.size() > 0){
            //如果存在，直接返回，无须查询数据库
            return ResponseResult.ok(list);
        }
        List<Book> book = userService.getBook();
        redisTemplate.opsForValue().set("book_list", book);
        return ResponseResult.ok(book);
    }

}

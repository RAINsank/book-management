package com.itheima.book.controllerApi;

import com.itheima.book.response.ResponseResult;
import com.itheima.book.vo.BookVo;
import org.springframework.web.bind.annotation.*;

/**
 * @author san qian
 **/
@SuppressWarnings("all")
@RequestMapping("/api/user")
public interface UserControllerApi {
    //批量生成借书记录
    @PostMapping("/{ids}")
    ResponseResult borrowBooks(@PathVariable("ids") Integer[] ids);
    //还书
    @PutMapping("/{id}")
    ResponseResult returnBook(@PathVariable("id") Integer id);

}

package com.itheima.book.controllerApi;

import com.itheima.book.dto.BookUpdatedto;
import com.itheima.book.dto.Bookdto;
import com.itheima.book.response.ResponseResult;
import com.itheima.book.vo.BookVo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author san qian
 **/
@RequestMapping("api/books")
public interface BookControllerApi {
    //更具作者或者书名查询,无参时查询所有
    @GetMapping()
    ResponseResult<List<BookVo>> selectBookBynameorAuthor(String name,String author);
    //新增书籍
    @PostMapping()
    ResponseResult addBook(Bookdto dto);
    //删除书籍
    @DeleteMapping("/{id}")
    ResponseResult deleteBook(@PathVariable("id") Long id);
    //更新书籍
    @PutMapping()
    ResponseResult updateBook(BookUpdatedto dto);
}

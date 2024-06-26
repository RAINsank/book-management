package com.itheima.book.controller.admin.v1;

import com.itheima.book.controllerApi.BookControllerApi;
import com.itheima.book.dto.BookUpdatedto;
import com.itheima.book.dto.Bookdto;
import com.itheima.book.response.ResponseResult;
import com.itheima.book.service.BookService;
import com.itheima.book.vo.BookVo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author san qian
 **/
@RestController
public class BookController implements BookControllerApi {
    final
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public ResponseResult<List<BookVo>> selectBookBynameorAuthor(String name, String author) {
        List<BookVo> list=bookService.selectBookBynameorAuthor(name,author);
        return ResponseResult.ok(list);
    }

    @Override
    public ResponseResult addBook(@RequestBody Bookdto dto) {
        bookService.addBook(dto);
        return ResponseResult.ok();
    }

    @Override
    public ResponseResult deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseResult.ok();
    }

    @Override
    public ResponseResult updateBook(@RequestBody BookUpdatedto dto) {
        bookService.UpdateBook(dto);
        return ResponseResult.ok();
    }
}

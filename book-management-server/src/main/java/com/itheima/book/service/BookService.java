package com.itheima.book.service;

import com.itheima.book.dto.BookUpdatedto;
import com.itheima.book.dto.Bookdto;
import com.itheima.book.vo.BookVo;

import java.util.List;

/**
 * @author san qian
 **/
public interface BookService {
    List<BookVo> selectBookBynameorAuthor(String name, String author);

    void addBook(Bookdto dto);

    void deleteBook(Long id);

    void UpdateBook(BookUpdatedto dto);
}

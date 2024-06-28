package com.itheima.book.service;

import com.itheima.book.entity.Book;

import java.util.List;

/**
 * @author san qian
 **/
public interface UserService {

    void borrowBooks(Integer[] ids);

    void returnBook(Integer id);

    List<Book> getBook();
}

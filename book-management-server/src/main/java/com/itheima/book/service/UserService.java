package com.itheima.book.service;

/**
 * @author san qian
 **/
public interface UserService {

    void borrowBooks(Integer[] ids);

    void returnBook(Integer id);
}

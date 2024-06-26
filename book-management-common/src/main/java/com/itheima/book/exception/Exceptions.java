package com.itheima.book.exception;

import com.itheima.book.enums.Code;

/**
 * @author san qian
 **/
public class Exceptions {
    public static void cast(Code code){
        throw  new BookException(code);
    }
    private Exceptions(){}
}

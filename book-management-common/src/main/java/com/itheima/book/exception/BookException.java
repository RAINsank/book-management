package com.itheima.book.exception;

import com.itheima.book.enums.Code;
import lombok.Getter;

/**
 * @author san qian
 **/
@Getter
public class BookException extends RuntimeException{
    private final Code code;

    public BookException(Code code){
        this.code = code;
    }

}

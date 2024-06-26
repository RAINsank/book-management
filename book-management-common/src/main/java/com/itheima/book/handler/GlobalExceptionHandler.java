package com.itheima.book.handler;

import com.itheima.book.enums.CodeEnum;
import com.itheima.book.response.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author san qian
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

//    private final EmailService emailService;

//    public GlobalExceptionHandler(EmailService emailService) {
//        this.emailService = emailService;
//    }

    @ExceptionHandler(Exception.class)
    public ResponseResult<String> handleException(Exception ex) {
        String errorMessage = "An error occurred: " + ex.getMessage();
//        emailService.sendErrorEmail("Error Notification", errorMessage);
//        String body = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage).getBody();
        return ResponseResult.error(CodeEnum.ERROR);
    }
}

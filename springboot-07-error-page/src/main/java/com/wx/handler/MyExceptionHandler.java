package com.wx.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author wang xing
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public void handlerException(Exception e){
        System.out.println("错误信息:\t" + e.getMessage());
    }
}

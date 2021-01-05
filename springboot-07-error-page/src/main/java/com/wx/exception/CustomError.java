package com.wx.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wang xing
 */

@Component
public class CustomError implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println(httpServletRequest.getRequestURI());
        System.out.println(o + "---" + e.getMessage() + "--" + e.getCause());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/");
        return modelAndView;
    }
}

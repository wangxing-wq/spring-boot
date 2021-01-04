package com.wx.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author wang xing
 */
public class CustomFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化CustomFilter1===================");
    }

    @Override
    public void destroy() {
        System.out.println("销毁CustomFilter1===================");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("放行CustomFilter1===================");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

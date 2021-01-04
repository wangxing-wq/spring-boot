package com.wx.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/")
public class CustomFilter2 implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化CustomFilter2===================");
    }

    @Override
    public void destroy() {
        System.out.println("销毁CustomFilter2===================");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("放行CustomFilter2===================");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

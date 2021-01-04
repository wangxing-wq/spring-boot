package com.wx.config;

import com.wx.filter.CustomFilter1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author wang xing
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean getFilterRegisterBean(){
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CustomFilter1());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(0);
        return registrationBean;
    }
}

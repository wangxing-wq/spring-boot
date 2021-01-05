package com.wx.custom;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author wang xing
 */
@Configuration
public class CustomWeb {

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> getWebServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                ErrorPage errorPage = new ErrorPage(HttpStatus.NOT_FOUND,"/one.html");
                factory.addErrorPages(errorPage);
            }
        };
    }
}

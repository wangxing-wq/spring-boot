package com.wx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wang xing
 * @Configuration
 * @ConfigurationProperties
 * @PropertySource()
 */
@Configuration
@ConfigurationProperties(prefix = "computer")
@PropertySource("classpath:computer.properties")
public class ConfigComputer {

    private String viewing;
    private String cpu;
    private String keyboard;
    private String mouse;

    public String getViewing() {
        return viewing;
    }

    public void setViewing(String viewing) {
        this.viewing = viewing;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
}

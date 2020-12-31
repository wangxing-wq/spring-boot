package com.wx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wang xing
 */

@ConfigurationProperties(prefix = "foot")
public class ConfigFoot {


    private String meat;
    private String rice;

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }
}

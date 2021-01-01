package com.wx.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wang xing
 */

@ConfigurationProperties(prefix = "foot")
@Data
public class ConfigFoot {


    private String meat;
    private String rice;
    private String [] sauce;


}

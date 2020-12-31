package com.wx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wang xing
 * @Configuration
 * @Component作用一样,加入Spring管理
 * @ConfigurationProperties("vegetables")
 * 声明这个是一个配置类替代配置文件
 * @PropertySource("classpath:vegetables.properties")
 * 配置数据源位置
 */
@Configuration
@ConfigurationProperties("vegetables")
@PropertySource("classpath:vegetables.properties")
public class ConfigVegetables {

    private String greenPepper;
    private String eggplant;
    private String potato;

    public String getGreenPepper() {
        return greenPepper;
    }

    public void setGreenPepper(String greenPepper) {
        this.greenPepper = greenPepper;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

}

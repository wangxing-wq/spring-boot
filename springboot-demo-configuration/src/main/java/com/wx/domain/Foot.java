package com.wx.domain;

/**
 * @author wang xing
 */
public class Foot {

    private String meat;
    private String rice;

    public Foot(String meat, String rice) {
        this.meat = meat;
        this.rice = rice;
    }

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

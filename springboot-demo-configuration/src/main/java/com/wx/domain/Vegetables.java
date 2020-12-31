package com.wx.domain;

/**
 * @author wang xing
 */
public class Vegetables {

    private String greenPepper;
    private String eggplant;
    private String potato;

    public Vegetables(){}

    public Vegetables(String greenPepper, String eggplant, String potato) {
        this.greenPepper = greenPepper;
        this.eggplant = eggplant;
        this.potato = potato;
    }

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

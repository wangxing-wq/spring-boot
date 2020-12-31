package com.wx.domain;

/**
 * @author wang xing
 */
public class Computer {

    private String viewing;
    private String cpu;
    private String keyboard;
    private String mouse;

    public Computer(){}

    public Computer(String viewing, String cpu, String keyboard, String mouse) {
        this.viewing = viewing;
        this.cpu = cpu;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

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

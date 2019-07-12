package com.local.computer.domain;

/**
 * 键盘
 *
 * @Author: qyf
 * @Date: 2019-7-12 10:36
 * @Description: 键盘
 */
public class Keyboard {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    public Keyboard() {
    }

    public Keyboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "品牌 : " + brand + ", 型号 : " + model;
    }
}

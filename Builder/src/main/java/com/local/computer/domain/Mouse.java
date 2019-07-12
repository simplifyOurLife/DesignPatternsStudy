package com.local.computer.domain;

/**
 * 鼠标
 *
 * @Author: qyf
 * @Date: 2019-7-12 10:36
 * @Description: 鼠标
 */
public class Mouse {
    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    public Mouse() {
    }

    public Mouse(String brand, String model) {
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

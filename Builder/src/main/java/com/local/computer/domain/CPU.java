package com.local.computer.domain;

/**
 * cpu
 *
 * @Author: qyf
 * @Date: 2019-7-12 10:37
 * @Description: cpu
 */
public class CPU {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    public CPU() {
    }

    public CPU(String brand, String model) {
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

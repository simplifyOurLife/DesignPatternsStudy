package com.local.computer.domain;

/**
 * 电脑显示屏
 *
 * @Author: qyf
 * @Date: 2019-7-12 10:36
 * @Description: 电脑显示屏
 */
public class Screen {
    /**
     * 品牌
     */
    private String brand;

    /**
     * 尺寸
     */
    private String size;

    public Screen() {
    }

    public Screen(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "品牌 : " + brand + ", 尺寸 : " + size;
    }
}

package com.local.computer.domain;

/**
 * 固态硬盘
 *
 * @Author: qyf
 * @Date: 2019-7-12 10:39
 * @Description: 固态硬盘
 */
public class SSD {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 容量
     */
    private String capacity;

    public SSD() {
    }

    public SSD(String brand, String capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "品牌 : " + brand + ", 容量 : " + capacity;
    }
}

package com.local.computer.domain;

/**
 * 内存
 *
 * @Author: qyf
 * @Date: 2019-7-12 10:38
 * @Description: 内存
 */
public class Memory {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 容量
     */
    private String capacity;

    public Memory() {
    }

    public Memory(String brand, String capacity) {
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

package com.local.factory;

import com.local.domain.Car;

/**
 * 汽车工厂
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:23
 * @Description: 汽车工厂--生产汽车,为了解决单一工厂中的判断过多,引入工厂方法,不同品牌汽车由不同工厂制造
 */
public interface Factory {

    /**
     * 生产汽车
     *
     * @return car 汽车
     */
    Car getCar();
}

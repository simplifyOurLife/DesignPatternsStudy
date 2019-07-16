package com.local.factory;

import com.local.domain.Benz;
import com.local.domain.Car;

/**
 * 奔驰汽车生产工厂
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:24
 * @Description: 奔驰汽车生产工厂-只生产奔驰汽车
 */
public class BenzFactory implements Factory {

    @Override
    public Car getCar() {
        return new Benz();
    }
}

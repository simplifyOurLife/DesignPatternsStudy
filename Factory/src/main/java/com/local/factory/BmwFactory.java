package com.local.factory;

import com.local.domain.Bmw;
import com.local.domain.Car;

/**
 * 宝马汽车生产工厂
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:24
 * @Description: 宝马汽车生产工厂-只生产宝马汽车
 */
public class BmwFactory implements Factory{

    @Override
    public Car getCar() {
        return new Bmw();
    }
}

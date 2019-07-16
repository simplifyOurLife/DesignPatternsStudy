package com.local.abstractfactory;

import com.local.domain.Bmw;
import com.local.domain.Car;

/**
 * 宝马抽象汽车生产工厂
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:57
 * @Description: 宝马抽象汽车生产工厂
 */
public class AbstractBmwFactory extends AbstractFactory {

    @Override
    public Car getCar() {
        return new Bmw();
    }
}

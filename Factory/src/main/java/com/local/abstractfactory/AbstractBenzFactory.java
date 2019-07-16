package com.local.abstractfactory;

import com.local.domain.Benz;
import com.local.domain.Car;

/**
 * 奔驰抽象汽车生产工厂
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:56
 * @Description: 奔驰抽象汽车生产工厂
 */
public class AbstractBenzFactory extends AbstractFactory {

    @Override
    public Car getCar() {
        return new Benz();
    }
}

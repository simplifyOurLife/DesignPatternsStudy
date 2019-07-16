package com.local.abstractfactory;

import com.local.domain.Car;
import com.local.domain.Chery;

/**
 * 奇瑞抽象汽车生产工厂
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:52
 * @Description: 奇瑞抽象汽车生产工厂
 */
public class AbstractCheryFactory extends AbstractFactory {

    @Override
    public Car getCar() {
        return new Chery();
    }
}

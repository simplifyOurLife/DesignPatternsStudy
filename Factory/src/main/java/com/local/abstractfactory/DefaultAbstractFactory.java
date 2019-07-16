package com.local.abstractfactory;

import com.local.domain.Car;

/**
 * 默认的汽车工厂
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:41
 * @Description: 默认的汽车工厂--生产奇瑞牌汽车
 */
public class DefaultAbstractFactory extends AbstractFactory {

    private AbstractFactory defaultFactory = new AbstractCheryFactory();

    /**
     * 默认工厂生产的是奇瑞牌汽车
     *
     * @return 奇瑞牌汽车
     */
    @Override
    public Car getCar() {
        return defaultFactory.getCar();
    }
}

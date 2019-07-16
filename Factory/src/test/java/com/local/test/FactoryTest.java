package com.local.test;

import com.local.abstractfactory.*;
import com.local.domain.Car;
import com.local.factory.BenzFactory;
import com.local.factory.BmwFactory;
import com.local.factory.Factory;
import com.local.simplefactory.SimpleFactory;
import org.junit.Test;

/**
 * 工厂模式测试类
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:10
 * @Description: 工厂模式测试类
 */
public class FactoryTest {

    /**
     * 简单工厂测试
     */
    @Test
    public void testSimpleFactory() {
        // 1. 创建汽车工厂
        SimpleFactory factory = new SimpleFactory();
        // 2. 通过汽车工厂生产宝马牌汽车
        Car car = factory.getCar("BMW");
        // 3. 验收拿到是不是自己想要的汽车
        System.out.println("拿到了 [ " + car.getName() + " ] 牌汽车");
    }

    /**
     * 工厂方法测试
     */
    @Test
    public void testFactoryMethod() {
        // 1. 创建宝马工厂
        Factory bmwFactory = new BmwFactory();
        // 2. 制造宝马汽车
        Car bmwCar = bmwFactory.getCar();
        // 3. 查看是否为宝马牌汽车
        System.out.println("拿到了 [ " + bmwCar.getName() + " ] 牌汽车");

        // 1. 创建奔驰工厂
        Factory benzFactory = new BenzFactory();
        // 2. 制造奔驰汽车
        Car benzCar = benzFactory.getCar();
        // 3. 查看是否为奔驰牌汽车
        System.out.println("拿到了 [ " + benzCar.getName() + " ] 牌汽车");
    }

    /**
     * 默认抽象汽车工厂测试
     */
    @Test
    public void testDefaultAbstractFactory() {
        // 1. 创建默认抽象汽车工厂
        AbstractFactory defaultFactory = new DefaultAbstractFactory();
        // 2. 制造出默认品牌的汽车
        Car defaultCar = defaultFactory.getCar();
        // 3. 查看默认的汽车品牌
        System.out.println("拿到了默认的 [ " + defaultCar.getName() + " ] 牌汽车");
    }

    /**
     * 抽象汽车工厂测试
     */
    @Test
    public void testAbstractFactory() {
        // 1. 创建抽象汽车工厂
        AbstractFactory abstractFactory = new AbstractCheryFactory();
        // 2. 制造出三款汽车
        Car bmw = abstractFactory.getCar("bmw");
        Car benz = abstractFactory.getCar("benz");
        Car chery = abstractFactory.getCar("chery");
        // 3. 查看制造出的汽车品牌
        System.out.println("拿到了 [ " + bmw.getName() + " " + benz.getName() + " " + chery.getName() + " ] 牌汽车");


        // 1. 创建奔驰抽象汽车工厂
        AbstractFactory abstractBenzFactory = new AbstractBenzFactory();
        // 2. 制造出奔驰汽车
        Car benzCar = abstractBenzFactory.getCar();
        // 3. 查看是否为奔驰牌汽车
        System.out.println("拿到了 [ " + benzCar.getName() + " ] 牌汽车");

        // 1. 创建宝马抽象汽车工厂
        AbstractFactory abstractBmwFactory = new AbstractBmwFactory();
        // 2. 制造出宝马汽车
        Car bmwCar = abstractBmwFactory.getCar();
        // 3. 查看是否为宝马牌汽车
        System.out.println("拿到了 [ " + bmwCar.getName() + " ] 牌汽车");

        // 1. 创建奇瑞抽象汽车工厂
        AbstractFactory abstractCheryFactory = new AbstractCheryFactory();
        // 2. 制造出奇瑞汽车
        Car cheryCar = abstractCheryFactory.getCar();
        // 3. 查看是否为奇瑞牌汽车
        System.out.println("拿到了 [ " + cheryCar.getName() + " ] 牌汽车");
    }
}

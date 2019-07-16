package com.local.abstractfactory;

import com.local.domain.Benz;
import com.local.domain.Bmw;
import com.local.domain.Car;
import com.local.domain.Chery;

/**
 * 抽象汽车工厂类
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:43
 * @Description: 抽象汽车工厂类
 */
public abstract class AbstractFactory {

    /**
     * 制造汽车--让各个品牌的工厂去实现
     *
     * @return 不同品牌的汽车
     */
    public abstract Car getCar();

    /**
     * 根据汽车品牌来制造汽车
     *
     * @param carBrand 汽车品牌
     * @return 需要的品牌汽车
     */
    public Car getCar(String carBrand) {
        // 奔驰牌
        String benz = "Benz";
        // 宝马牌
        String bmw = "BMW";
        // 奇瑞
        String chery = "Chery";

        if (bmw.equalsIgnoreCase(carBrand)) {
            return new Bmw();
        } else if (benz.equalsIgnoreCase(carBrand)) {
            return new Benz();
        } else if (chery.equalsIgnoreCase(carBrand)) {
            return new Chery();
        } else {
            System.out.println("目前暂不支持生产 [ " + carBrand + " ] 牌汽车...");
            return null;
        }
    }
}

package com.local.simplefactory;

import com.local.domain.Bmw;
import com.local.domain.Benz;
import com.local.domain.Car;

/**
 * 简单的汽车工厂
 *
 * @Author: qyf
 * @Date: 2019-7-15 17:11
 * @Description: 简单的汽车工厂, 但是当需要生产较多品牌汽车时, if...else...会过多
 */
public class SimpleFactory {

    public Car getCar(String carName) {

        // 宝马牌
        String bmw = "BMW";
        // 奔驰牌
        String benz = "Benz";

        if (bmw.equalsIgnoreCase(carName)) {
            return new Bmw();
        } else if (benz.equalsIgnoreCase(carName)) {
            return new Benz();
        } else {
            System.out.println("技术有限,目前暂不支持生产 [ " + carName + " ] 牌汽车...");
            return null;
        }
    }

}

package com.local;

import com.local.computer.builder.impl.ComputerBuilder;
import com.local.computer.domain.*;
import com.local.simple.User;
import com.local.simple.UserBuilder;
import org.junit.Test;

import java.io.File;

/**
 * 构建者模式测试类
 *
 * @Author: qyf
 * @Date: 2019-7-10 14:48
 * @Description: 构建者模式测试类
 */
public class BuilderTest {

    /**
     * 构建者模式简单Demo
     */
    @Test
    public void testBuildUser() {
        UserBuilder builder = new UserBuilder();
        // 1. 直接build一个user对象
        User buildUser = builder.build();
        System.out.println(": " + buildUser);
        // 2. 使用build赋值来创建
        User user = builder.buildName("张三").buildGender("男").buildAge(20).build();
        System.out.println("buildUser: " + user);
    }

    /**
     * 第一种方式组装一台电脑
     */
    @Test
    public void testBuilderComputer1() {
        // 构建者
        ComputerBuilder builder = new ComputerBuilder();
        // 一边准备配件一边组装 ( 一行太长了,所以拆开写的 )
        ComputerBuilder builder1 = builder.buildCpu("Intel", "i7").buildKeyboard("Cherry", "MX8.0");
        ComputerBuilder builder2 = builder1.buildMainboard("华硕", "Z390").buildMemory("海盗船", "16G");
        Computer computer = builder2.buildMouse("罗技", "G320").buildScreen("三星", "47吋").buildSsd("三星", "1T").build();

        System.out.println(computer);
    }

    /**
     * 第二种方式组装一台电脑
     */
    @Test
    public void testBuilderComputer2() {
        // 准备配件
        CPU cpu = new CPU("Intel", "i7");
        Keyboard keyboard = new Keyboard("Cherry", "MX8.0");
        Mainboard mainboard = new Mainboard("华硕", "Z390");
        Memory memory = new Memory("海盗船", "16G");
        Mouse mouse = new Mouse("罗技", "G320");
        Screen screen = new Screen("三星", "47吋");
        SSD ssd = new SSD("三星", "1T");
        // 构建者
        ComputerBuilder builder = new ComputerBuilder();
        // 构建产品
        Computer computer = builder.buildCpu(cpu).buildKeyboard(keyboard).buildMainboard(mainboard).buildMemory(memory).buildMouse(mouse).buildScreen(screen).buildSsd(ssd).build();
        System.out.println(computer);
    }
}

package com.local.computer.builder;

import com.local.computer.builder.impl.ComputerBuilder;
import com.local.computer.domain.*;

/**
 * [description]
 *
 * @Author: qyf
 * @Date: 2019-7-12 14:01
 * @Description: 说明
 */
public interface ComputerBuild {

    Computer build();

    ComputerBuilder buildCpu(CPU cpu);

    ComputerBuilder buildCpu(String brand, String model);

    ComputerBuilder buildKeyboard(Keyboard keyboard);

    ComputerBuilder buildKeyboard(String brand, String model);

    ComputerBuilder buildMainboard(Mainboard mainboard);

    ComputerBuilder buildMainboard(String brand, String model);

    ComputerBuilder buildMemory(Memory memory);

    ComputerBuilder buildMemory(String brand, String capacity);

    ComputerBuilder buildMouse(Mouse mouse);

    ComputerBuilder buildMouse(String brand, String model);

    ComputerBuilder buildScreen(Screen screen);

    ComputerBuilder buildScreen(String brand, String size);

    ComputerBuilder buildSsd(SSD ssd);

    ComputerBuilder buildSsd(String brand, String capacity);
}

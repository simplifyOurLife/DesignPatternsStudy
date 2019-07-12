package com.local.computer.builder.impl;

import com.local.computer.builder.ComputerBuild;
import com.local.computer.domain.*;

/**
 * 组装器
 *
 * @Author: qyf
 * @Date: 2019-7-12 10:49
 * @Description: 组装器
 */
public class ComputerBuilder implements ComputerBuild {

    private Computer targetComputer;

    public ComputerBuilder() {
        targetComputer = new Computer();
    }

    @Override
    public Computer build() {
        return targetComputer;
    }

    @Override
    public ComputerBuilder buildCpu(CPU cpu) {
        targetComputer.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilder buildCpu(String brand, String model) {
        CPU cpu = new CPU();
        cpu.setBrand(brand);
        cpu.setModel(model);
        targetComputer.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilder buildKeyboard(Keyboard keyboard) {
        targetComputer.setKeyboard(keyboard);
        return this;
    }

    @Override
    public ComputerBuilder buildKeyboard(String brand, String model) {
        Keyboard keyboard = new Keyboard();
        keyboard.setBrand(brand);
        keyboard.setModel(model);
        targetComputer.setKeyboard(keyboard);
        return this;
    }

    @Override
    public ComputerBuilder buildMainboard(Mainboard mainboard) {
        targetComputer.setMainboard(mainboard);
        return this;
    }

    @Override
    public ComputerBuilder buildMainboard(String brand, String model) {
        Mainboard mainboard = new Mainboard();
        mainboard.setBrand(brand);
        mainboard.setModel(model);
        targetComputer.setMainboard(mainboard);
        return this;
    }

    @Override
    public ComputerBuilder buildMemory(Memory memory) {
        targetComputer.setMemory(memory);
        return this;
    }

    @Override
    public ComputerBuilder buildMemory(String brand, String capacity) {
        Memory memory = new Memory();
        memory.setBrand(brand);
        memory.setCapacity(capacity);
        targetComputer.setMemory(memory);
        return this;
    }

    @Override
    public ComputerBuilder buildMouse(Mouse mouse) {
        targetComputer.setMouse(mouse);
        return this;
    }

    @Override
    public ComputerBuilder buildMouse(String brand, String model) {
        Mouse mouse = new Mouse();
        mouse.setBrand(brand);
        mouse.setModel(model);
        targetComputer.setMouse(mouse);
        return this;
    }

    @Override
    public ComputerBuilder buildScreen(Screen screen) {
        targetComputer.setScreen(screen);
        return this;
    }

    @Override
    public ComputerBuilder buildScreen(String brand, String size) {
        Screen screen = new Screen();
        screen.setBrand(brand);
        screen.setSize(size);
        targetComputer.setScreen(screen);
        return this;
    }

    @Override
    public ComputerBuilder buildSsd(SSD ssd) {
        targetComputer.setSsd(ssd);
        return this;
    }

    @Override
    public ComputerBuilder buildSsd(String brand, String capacity) {
        SSD ssd = new SSD();
        ssd.setBrand(brand);
        ssd.setCapacity(capacity);
        targetComputer.setSsd(ssd);
        return this;
    }

}

package com.local.computer.domain;

/**
 * 电脑整机
 *
 * @Author: qyf
 * @Date: 2019-7-12 10:49
 * @Description: 电脑整机
 */
public class Computer {

    private CPU cpu;

    private Keyboard keyboard;

    private Mainboard mainboard;

    private Memory memory;

    private Mouse mouse;

    private Screen screen;

    private SSD ssd;

    public Computer() {
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "组装的电脑配置为: \n\r " +
                "cpu: [ " + cpu + " ], \n\r keyboard: [ " + keyboard + " ], \n\r mainboard: [ " + mainboard + " ], \n\r" +
                " memory: [ " + memory + " ], \n\r mouse: [ " + mouse + " ], \n\r screen: [ " + screen + " ], \n\r ssd: [ " + ssd + " ] ";
    }
}

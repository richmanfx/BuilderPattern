package ru.r5am.concrete_builders;

import ru.r5am.Device;
import ru.r5am.DeviceBuilder;

/**
 * Строитель для ноутбука
 */
public class NotebookBuilder implements DeviceBuilder {

    private String chassis;         // Корпус
    // Блока питания нет - внешний
    private String screen;          // Экран
    private String keyboard;        // Клавиатура
    private String motherboard;     // Материнская плата
    private String cpu;             // Процессор
    private String ram;             // Оперативная память

    @Override
    public DeviceBuilder chassisAssembly() {
        System.out.println("Сборка корпуса для ноутбука");
        this.chassis = "Notebook chassis";
        return this;
    }

    @Override
    public DeviceBuilder powerMounting() {      // Блока питания нет - внешний
        return null;
    }

    @Override
    public DeviceBuilder screenMounting() {
        System.out.println("Установка экрана ноутбука");
        this.screen = "Notebook screen";
        return this;
    }

    @Override
    public DeviceBuilder keyboardMounting() {
        System.out.println("Установка клавиатуры ноутбука");
        this.keyboard = "Notebook keyboard";
        return this;
    }

    @Override
    public DeviceBuilder motherboardMounting() {
        System.out.println("Установка материнской платы ноутбука");
        this.motherboard = "Notebook motherboard";
        return this;
    }

    @Override
    public DeviceBuilder cpuMounting() {
        System.out.println("Установка процессора ноутбука");
        this.cpu = "Notebook CPU";
        return this;
    }

    @Override
    public DeviceBuilder ramMounting() {
        System.out.println("Установка ОЗУ в ноутбук");
        this.ram = "Notebook RAM";
        return this;
    }

    @Override
    public Device deviceGet() {
        Device device = new Device();
        return device;
    }
}

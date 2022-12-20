package ru.r5am.concrete_builders;

import ru.r5am.Device;
import ru.r5am.DeviceBuilder;

/**
 * Строитель для смартфона
 */
public class SmartphoneBuilder implements DeviceBuilder {

    private String chassis;         // Корпус
                                    // Блока питания нет - внешний
    private String screen;          // Экран
                                    // Клавиатуры нет
    private String motherboard;     // Материнская плата
    private String cpu;             // Процессор
    private String ram;             // Оперативная память

    @Override
    public DeviceBuilder chassisAssembly() {
        System.out.println("Сборка корпуса для смартфона");
        this.chassis = "Smartphone chassis";
        return this;
    }

    @Override
    public DeviceBuilder powerMounting() {
        return this;
    }

    @Override
    public DeviceBuilder screenMounting() {
        System.out.println("Установка экрана смартфона");
        this.screen = "Smartphone screen";
        return this;
    }

    @Override
    public DeviceBuilder keyboardMounting() {
        return this;
    }

    @Override
    public DeviceBuilder motherboardMounting() {
        System.out.println("Установка материнской платы смартфона");
        this.motherboard = "Smartphone motherboard";
        return this;
    }

    @Override
    public DeviceBuilder cpuMounting() {
        System.out.println("Установка процессора смартфона");
        this.cpu = "Smartphone CPU";
        return this;
    }

    @Override
    public DeviceBuilder ramMounting() {
        System.out.println("Установка ОЗУ в смартфон");
        this.ram = "Smartphone RAM";
        return this;
    }

    @Override
    public Device build() {
        Device device = new Device(chassis, null, screen, null, motherboard, cpu, ram);
        if (device.qualityCheck()) {        // Если смартфон соответствует требованиям
            System.out.println("=> Смартфон соответствует требованиям\n");
        } else {
            System.out.println("=> Смартфон не соответствует требованиям\n");
            System.exit(0);
        }
        return device;
    }

}

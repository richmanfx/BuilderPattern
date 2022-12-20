package ru.r5am.concrete_builders;

import ru.r5am.Device;
import ru.r5am.DeviceBuilder;

/**
 * Строитель для планшета
 */
public class PadBuilder implements DeviceBuilder {

    private String chassis;         // Корпус
                                    // Блока питания нет - внешний
    private String screen;          // Экран
                                    // Клавиатуры нет
    private String motherboard;     // Материнская плата
    private String cpu;             // Процессор
    private String ram;             // Оперативная память

    @Override
    public DeviceBuilder chassisAssembly() {
        System.out.println("Сборка корпуса для планшета");
        this.chassis = "Pad chassis";
        return this;
    }

    @Override
    public DeviceBuilder powerMounting() {
        return this;
    }

    @Override
    public DeviceBuilder screenMounting() {
        System.out.println("Установка экрана планшета");
        this.screen = "Pad screen";
        return this;
    }

    @Override
    public DeviceBuilder keyboardMounting() {
        return this;
    }

    @Override
    public DeviceBuilder motherboardMounting() {
        System.out.println("Установка материнской платы планшета");
        this.motherboard = "Pad motherboard";
        return this;
    }

    @Override
    public DeviceBuilder cpuMounting() {
        System.out.println("Установка процессора планшета");
        this.cpu = "Pad CPU";
        return this;
    }

    @Override
    public DeviceBuilder ramMounting() {
        System.out.println("Установка ОЗУ в планшет");
        this.ram = "Pad RAM";
        return this;
    }

    @Override
    public Device build() {
        Device device = new Device(chassis, null, screen, null, motherboard, cpu, ram);
        if (device.qualityCheck()) {        // Если планшет соответствует требованиям
            System.out.println("=> Планшет соответствует требованиям\n");
        } else {
            System.out.println("=> Планшет не соответствует требованиям\n");
            System.exit(0);
        }
        return device;
    }

}

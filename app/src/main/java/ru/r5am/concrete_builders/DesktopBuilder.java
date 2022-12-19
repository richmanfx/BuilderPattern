package ru.r5am.concrete_builders;

import ru.r5am.Device;
import ru.r5am.DeviceBuilder;

/**
 * Строитель для десктоп-компьютера
 */
public class DesktopBuilder implements DeviceBuilder {

    private String chassis;         // Корпус
    private String power;           // Блок питания
                                    // Экрана нет
                                    // Клавиатуры нет
    private String motherboard;     // Материнская плата
    private String cpu;             // Процессор
    private String ram;             // Оперативная память

    @Override
    public DeviceBuilder chassisAssembly() {
        System.out.println("Сборка корпуса для десктопа");
        this.chassis = "Desktop chassis";
        return this;
    }

    @Override
    public DeviceBuilder powerMounting() {
        System.out.println("Установка блока питания десктопа");
        this.power = "Desktop power";
        return this;
    }

    @Override
    public DeviceBuilder screenMounting() {     // Экрана нет
        return null;
    }

    @Override
    public DeviceBuilder keyboardMounting() {       // Клавиатуры нет
        return null;
    }

    @Override
    public DeviceBuilder motherboardMounting() {
        System.out.println("Установка материнской платы десктопа");
        this.motherboard = "Desktop motherboard";
        return this;
    }

    @Override
    public DeviceBuilder cpuMounting() {
        System.out.println("Установка процессора десктопа");
        this.cpu = "Desktop CPU";
        return this;
    }

    @Override
    public DeviceBuilder ramMounting() {
        System.out.println("Установка ОЗУ в десктоп");
        this.ram = "Desktop RAM";
        return this;
    }

    @Override
    public Device deviceGet() {
        Device device = new Device();
        return device;
    }
}

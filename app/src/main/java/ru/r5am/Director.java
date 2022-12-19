package ru.r5am;

/**
 * Директор. Определяет порядок вызова шагов для изготовления устройсва.
 */
public class Director {

    /**
     *
     * @param deviceBuilder Конкретный строитель для какого-либо устройства
     * @return Компьютерное устройство
     */
    Device deviceCreate(DeviceBuilder deviceBuilder) {

        deviceBuilder
                .chassisAssembly()
                .powerMounting()
                .motherboardMounting()
                .cpuMounting()
                .ramMounting()
                .deviceGet();

        Device device = new Device();

        return device;

    }

}

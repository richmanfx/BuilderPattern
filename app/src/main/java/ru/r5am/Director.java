package ru.r5am;

/**
 * Директор. Определяет порядок вызова шагов для изготовления компьютерного устройства.
 */
public class Director {

    /**
     * Собирает компьютерное устройство
     * @param deviceBuilder Конкретный строитель для какого-либо устройства
     * @return Компьютерное устройство
     */
    Device deviceCreate(DeviceBuilder deviceBuilder) {

        return deviceBuilder
                .chassisAssembly()
                .powerMounting()
                .screenMounting()
                .keyboardMounting()
                .motherboardMounting()
                .cpuMounting()
                .ramMounting()
                .build();

    }

}

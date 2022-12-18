package ru.r5am;

/**
 * Интерфейс построителя устройства с этапами сборки
 */
public interface DeviceBuilder {

    // Монтаж корпуса
    public DeviceBuilder chassisAssembly();

    // Установка экрана
    public DeviceBuilder screenMounting();

    // Установка клавиатуры
    public DeviceBuilder keyboardMounting();

    // Установка материнской платы
    public DeviceBuilder motherboardMounting();

    // Установка процессора
    public DeviceBuilder cpuMounting();

    // Установка оперативной памяти
    public DeviceBuilder ramMounting();

    // Выпуск устройства
    public Device build();

}

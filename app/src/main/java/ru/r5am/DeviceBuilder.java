package ru.r5am;

/**
 * Интерфейс построителя устройства с этапами сборки
 */
public interface DeviceBuilder {

    // Монтаж корпуса
    DeviceBuilder chassisAssembly();

    // Установка блока питания
    DeviceBuilder powerMounting();

    // Установка экрана
    DeviceBuilder screenMounting();

    // Установка клавиатуры
    DeviceBuilder keyboardMounting();

    // Установка материнской платы
    DeviceBuilder motherboardMounting();

    // Установка процессора
    DeviceBuilder cpuMounting();

    // Установка оперативной памяти
    DeviceBuilder ramMounting();

    // Выпуск устройства
    Device build();

}

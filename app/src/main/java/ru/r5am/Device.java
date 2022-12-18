package ru.r5am;

import lombok.Getter;
import lombok.Setter;

/**
 * Копьютерное устройство
 */
public class Device {

    @Getter @Setter private String chassis;         // Корпус
    @Getter @Setter private String power;           // Блок питания
    @Getter @Setter private String screen;          // Экран
    @Getter @Setter private String keyboard;        // Клавиатура
    @Getter @Setter private String motherboard;     // Материнская плата
    @Getter @Setter private String cpu;             // Процессор
    @Getter @Setter private String ram;             // Оперативная память

    /**
     * Проверить качество
     */
     public boolean qualityCheck() {
         return (chassis != null && !chassis.trim().isEmpty()) &&
                (motherboard != null && !motherboard.trim().isEmpty()) &&
                (cpu != null && !cpu.trim().isEmpty()) &&
                (ram != null && !ram.trim().isEmpty());
     }

    @Override
    public String toString() {
        return "Device:" +
                " chassis=" + chassis +
                " power=" + power +
                " screen=" + screen +
                " keyboard=" + keyboard +
                " motherboard=" + motherboard +
                " cpu=" + cpu +
                " ram=" + ram;
    }

}

package ru.r5am;

import java.util.ArrayList;

import ru.r5am.concrete_builders.PadBuilder;
import ru.r5am.concrete_builders.DesktopBuilder;
import ru.r5am.concrete_builders.NotebookBuilder;
import ru.r5am.concrete_builders.SmartphoneBuilder;

public class App {

    public static void main(String[] args) {

        System.out.println("\nПривет, Builder!\n");

        // Партия компьютерных устройств
        ArrayList<Device> devicesShipment = new ArrayList<>();

        // Директор
        Director director = new Director();

        // Произвести десктоп
        DeviceBuilder builder = new DesktopBuilder();       // Конкретный строитель десктопа
        Device desktop = director.deviceCreate(builder);
        devicesShipment.add(desktop);       // Добавить десктоп в партию

        // Произвести ноутбук заданным конкретным строителем ноутбука
        Device notebook = director.deviceCreate(new NotebookBuilder());
        devicesShipment.add(notebook);       // Добавить ноутбук в партию

        // Произвести смартфон заданным конкретным строителем смартфона
        Device smartPhone = director.deviceCreate(new SmartphoneBuilder());
        devicesShipment.add(smartPhone);       // Добавить смартфон в партию

        // Произвести планшет заданным конкретным строителем планшета
        Device pad = director.deviceCreate(new PadBuilder());
        devicesShipment.add(pad);       // Добавить планшет в партию

        // Готовые компьютерные устройства
        System.out.print("Партия компьютерных устройств:");
        for (Device device: devicesShipment) {
            System.out.printf("\n%s", device);
        }

    }

}

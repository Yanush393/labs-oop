package org.example;

public interface Driveable {
    void drive();
    void brake();
    double getSpeed();


    static String info() {
        return "Интерфейс Driveable: управление транспортным средством";
    }
}
package org.example;

public interface Parkable {
    void park();
    boolean isParked();

    static String info() {
        return "Интерфейс Parkable: парковка транспортного средства";
    }
}
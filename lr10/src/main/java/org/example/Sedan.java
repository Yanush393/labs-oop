package org.example;

public class Sedan implements Driveable, Parkable {
    private String brand;
    private double speed;
    private boolean parked;

    public Sedan(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
        this.parked = true;
    }

    public String getBrand() { return brand; }
    public void setSpeed(double speed) { this.speed = speed; }

    @Override
    public void drive() {
        if (parked) {
            System.out.println("Седан " + brand + " сначала нужно вывести с парковки");
            return;
        }
        System.out.println("Седан " + brand + " едет со скоростью " + speed + " км/ч");
    }

    @Override
    public void brake() {
        speed = 0;
        System.out.println("Седан " + brand + " остановился");
    }

    @Override
    public double getSpeed() { return speed; }

    @Override
    public void park() {
        if (speed > 0) {
            System.out.println("Седан " + brand + " нельзя припарковать на ходу");
            return;
        }
        parked = true;
        System.out.println("Седан " + brand + " припаркован");
    }

    @Override
    public boolean isParked() { return parked; }

    public void leaveParking() {
        parked = false;
        System.out.println("Седан " + brand + " покинул парковку");
    }

    @Override
    public String toString() {
        return "Sedan{brand='" + brand + "', speed=" + speed + ", parked=" + parked + "}";
    }
}

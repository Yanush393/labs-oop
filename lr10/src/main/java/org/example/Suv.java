package org.example;

public class Suv implements Driveable, Parkable {
    private String brand;
    private double speed;
    private boolean parked;

    public Suv(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
        this.parked = true;
    }

    public String getBrand() { return brand; }
    public void setSpeed(double speed) { this.speed = speed; }

    @Override
    public void drive() {
        if (parked) {
            System.out.println("Внедорожник " + brand + " сначала нужно вывести с парковки");
            return;
        }
        System.out.println("Внедорожник " + brand + " едет со скоростью " + speed + " км/ч");
    }

    @Override
    public void brake() {
        speed = 0;
        System.out.println("Внедорожник " + brand + " остановился");
    }

    @Override
    public double getSpeed() { return speed; }

    @Override
    public void park() {
        if (speed > 0) {
            System.out.println("Внедорожник " + brand + " нельзя припарковать на ходу");
            return;
        }
        parked = true;
        System.out.println("Внедорожник " + brand + " припаркован");
    }

    @Override
    public boolean isParked() { return parked; }

    public void leaveParking() {
        parked = false;
        System.out.println("Внедорожник " + brand + " покинул парковку");
    }

    @Override
    public String toString() {
        return "Suv{brand='" + brand + "', speed=" + speed + ", parked=" + parked + "}";
    }
}

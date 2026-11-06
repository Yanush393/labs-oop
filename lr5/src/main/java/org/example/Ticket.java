package org.example;

public class Ticket {
    private String event;
    private int seatNumber;
    private double price;

    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void applyDiscount(double percent) {
        price = price - price * percent / 100;
    }

    @Override
    public String toString() {
        return "Билет: " + event + ", место " + seatNumber + ", цена " + price;
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket("Рок-концерт", 15, 100.0);
        System.out.println("До скидки: " + ticket);
        ticket.applyDiscount(20);
        System.out.println("После скидки 20%: " + ticket);
    }
}

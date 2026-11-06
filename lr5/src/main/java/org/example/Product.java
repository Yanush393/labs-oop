package org.example;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name,double price, int quantity){

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price >=0){
            this.price = price;
        }else{

            System.out.println("Цена не может быть отрицательной");

        }
    }

    public void setQuantity(int quantity) {
        if(quantity>=0) {
            this.quantity = quantity;
        }else{

            System.out.println("Кол-во не может быть отрицательным");

        }

    }

    public double totalCost(){

        return price*quantity;
    }



}





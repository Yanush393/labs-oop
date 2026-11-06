package org.example;

public abstract class Plant {

    private   String name;
    private double hight;
    private String type;


    public Plant(String name,String type, double hight){

        this.name = name;
        this.hight = hight;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void water();

    public void displayInfo(){

        System.out.println("Название: " + name + ", высота: " + hight + " см, тип: " + type);

    }
    public abstract String getLightRequirements();

}

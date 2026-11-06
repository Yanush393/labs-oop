package org.example;

 public class Tree extends Plant {

     private double crownDiameter;
     public Tree(String name, double hight, String type, double crownDiameter){

         super(name, type, hight);
         this.crownDiameter = crownDiameter;

     }

     public double getCrownDiameter() {
         return crownDiameter;
     }

     public void setCrownDiameter(double crownDiameter) {
         this.crownDiameter = crownDiameter;
     }

    @Override
     public void water(){
         System.out.println("Поливается 1 раз в неделю");
    }

    @Override
    public String getLightRequirements(){

         return "Светолюбивое";

    }

     @Override
     public void displayInfo() {
         super.displayInfo();
         System.out.println("Диаметр кроны: " + crownDiameter + " м");
     }



 }

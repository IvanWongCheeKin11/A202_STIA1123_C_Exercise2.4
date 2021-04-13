package com.cheekin;

public class Main {

    public static void main(String[] args) {
        Phone a = new Phone();
        a.setType("Corded phone");
        a.setColor("Red");
        a.setDistance("Long");
        a.setCost("Lower");
        a.setFunction("One only");
        a.setAmountOfPhone(1);
        a.setWeight(530);
        a.setPrice(50);

        System.out.println("Type: " + a.getType() + "\n" + "Color: " + a.getColor() + "\n" + "Communication Distance: " + a.getDistance() + "\n" + "Cost: " + a.getCost() + "\n" + "Function: " + a.getFunction());
        System.out.printf("Weight: %.2fg %n",a.getWeight());
        System.out.printf("Price: RM%.2f each %n",a.getPrice());
        System.out.println("Amount Of Phone: " + a.getAmountOfPhone());
        System.out.printf("Total Weight: %.2fkg %n",a.getTotalWeight());
        System.out.printf("Total Price: RM%.2f %n",a.getTotalPrice());
        System.out.println();


        Phone b = new Phone();
        b.setType("Cell phone");
        b.setColor("Black");
        b.setDistance("Long");
        b.setCost("Higher");
        b.setFunction("More than one");
        b.setAmountOfPhone(5);
        b.setWeight(170);
        b.setPrice(1000);

        System.out.println("Type: " + b.getType() + "\n" + "Color: " + b.getColor() + "\n" + "Communication Distance: " + b.getDistance() + "\n" + "Cost: " + b.getCost() + "\n" + "Function: " + b.getFunction());
        System.out.printf("Weight: %.2fg %n",b.getWeight());
        System.out.printf("Price: RM%.2f each %n",b.getPrice());
        System.out.println("Amount Of Phone: " + b.getAmountOfPhone());
        System.out.printf("Total Weight: %.2fkg %n",b.getTotalWeight());
        System.out.printf("Total Price: RM%.2f %n",b.getTotalPrice());
    }
}
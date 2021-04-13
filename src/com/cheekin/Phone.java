package com.cheekin;

public class Phone {
    String type, color, distance, cost, function;
    double weight, price,totalweight, totalprice;
    int AmountOfPhone;

    void setType(String type) {
        this.type = type;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setDistance(String distance) {
        this.distance = distance;
    }

    void setCost (String cost) {
        this.cost = cost;
    }

    void setFunction (String function) {
        this.function = function;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setAmountOfPhone(int amount) {
        this.AmountOfPhone = amount;
    }

    String getType() {
        return this.type;
    }

    String getColor() {
        return this.color;
    }

    String getDistance() {
        return this.distance;
    }

    String getCost() {
        return this.cost;
    }

    String getFunction() {
        return this.function;
    }

    double getWeight() {
        return this.weight;
    }

    double getPrice() {
        return this.price;
    }

    int getAmountOfPhone() {
        return this.AmountOfPhone;
    }

    double getTotalWeight() {
        this.totalweight = this.AmountOfPhone * this.weight;
        return this.totalweight;
    }

    double getTotalPrice() {
        this.totalprice = this.AmountOfPhone * this.price;
        return this.totalprice;
    }
}

package com.suchit.principles.abs.inner;

public abstract class Suitcase {

    String brand;
    String color;
    int capacity;
    double weight;

    public Suitcase(String brand, String color, int capacity, double weight) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity + " L");
        System.out.println("Weight: " + weight + " kg");
    }
}
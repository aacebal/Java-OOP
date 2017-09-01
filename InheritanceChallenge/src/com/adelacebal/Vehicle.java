package com.adelacebal;

public class Vehicle {

    private int capacity;
    private String material;

    public Vehicle() {
        this(0, "No material");
    }

    public Vehicle(int capacity, String material) {

        this.capacity = capacity;
        this.material = material;
    }

    public void steering() {
        System.out.println("Steering called, changing direction");
    }

    public void move(int speed) {
        System.out.println("Vehicle is moving at " + speed);
    }

    public int getCapacity() {
        return capacity;
    }

    public String getMaterial() {
        return material;
    }
}

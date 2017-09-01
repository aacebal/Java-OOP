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

    private void steering() {
        System.out.println("Steering called, changing direction");
    }

    private void move(int speed) {
        System.out.println("Vehicle is moving at " + speed);
    }
}

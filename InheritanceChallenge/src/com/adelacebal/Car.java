package com.adelacebal;

public class Car extends Vehicle{

    private int color;
    private int wheels;
    private int doors;
    private int gears;

    public Car(int capacity, String material, int wheels, int doors, int gears) {
        super(capacity, material);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;

    }

    public void changeGears(int addedSpeed) {
        System.out.println("Car gears have changed");
    }

    @Override
    public void move(int speed) {
        System.out.println("Car moves");
        changeGears(20);
        super.move(speed);
    }
}

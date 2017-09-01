package com.adelacebal;

public class SolutionCar extends SolutionVehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public SolutionCar(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Setting current gear to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car changed velocity to speed: " + speed + " and direction: " + direction);
    }
}

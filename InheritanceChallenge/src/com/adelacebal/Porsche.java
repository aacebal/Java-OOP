package com.adelacebal;

public class Porsche extends Car{

    private String model;
    private String style;

    public Porsche(int capacity, String material, int wheels, int doors, int gears, String model, String style) {
        super(capacity, material, wheels, doors, gears);
        this.model = model;
        this.style = style;
    }
}

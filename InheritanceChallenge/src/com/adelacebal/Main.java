package com.adelacebal;

public class Main {

    public static void main(String[] args) {
        Porsche carrera = new Porsche(5, "leather", 4, 2, 5, "Carrera 911", "Sport");

//        carrera.changeGears();
        carrera.move(110);
    }
}

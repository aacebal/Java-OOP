package com.adelacebal;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10]; //{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myIntArray[5] = 50;
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[8]);

        for(int i = 0; i<10; i++) {
            myIntArray[i] = i * 10;
        }

        for(int i = 0; i<10; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }
}

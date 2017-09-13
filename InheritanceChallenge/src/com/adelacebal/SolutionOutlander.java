package com.adelacebal;

public class SolutionOutlander extends SolutionCar {

    private int roadService;

    public SolutionOutlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadService = roadServiceMonths;
    }
}

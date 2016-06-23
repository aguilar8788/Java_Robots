package com.company;

/**
 * Created by peteraguilar on 6/20/16.
 */
public class Battery {
    private String batteryType;
    private int numberOfCells;
    private String totalVolts;
    private String current;

    public Battery(String batteryType, int numberOfCells, String totalVolts, String current) {
        this.batteryType = batteryType;
        this.numberOfCells = numberOfCells;
        this.totalVolts = totalVolts;
        this.current = current;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public int getNumberOfCells() {
        return numberOfCells;
    }

    public String getTotalVolts() {
        return totalVolts;
    }

    public String getCurrent() {
        return current;
    }
}

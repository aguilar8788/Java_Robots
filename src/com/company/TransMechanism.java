package com.company;

/**
 * Created by peteraguilar on 6/20/16.
 */
public class TransMechanism {
    private String wheelType;
    private int numberOfWheels;
    private String motorType;

    public TransMechanism(String wheelType, int numberOfWheels, String motorType) {
        this.wheelType = wheelType;
        this.numberOfWheels = numberOfWheels;
        this.motorType = motorType;
    }

    public String getWheelType() {
        return wheelType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
}

package com.company;

/**
 * Created by peteraguilar on 6/20/16.
 */
public class Robot {
    private Computer computer;
    private Frame frame;
    private Battery battery;
    private TransMechanism mechanism;

    public Robot(Computer computer, Frame frame, Battery battery, TransMechanism mechanism) {
        this.computer = computer;
        this.frame = frame;
        this.battery = battery;
        this.mechanism = mechanism;
    }

    public Computer getComputer() {
        return computer;
    }

    public Frame getFrame() {
        return frame;
    }

    public Battery getBattery() {
        return battery;
    }

    public TransMechanism getMechanism() {
        return mechanism;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setMechanism(TransMechanism mechanism) {
        this.mechanism = mechanism;
    }
}

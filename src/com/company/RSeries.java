package com.company;

/**
 * Created by peteraguilar on 6/20/16.
 */
public class RSeries extends Robot{
    private double height;
    private int powerbusCables;
    private String visualHardware;
    private String defense;
    private String dataRetrieval;
    private String tools;
    private String scannerTool;

    public RSeries(Computer computer, Frame frame, Battery battery, TransMechanism mechanism, double height, int powerbusCables, String visualHardware, String defense, String dataRetrieval, String tools, String scannerTool) {
        super(computer, frame, battery, mechanism);
        this.height = height;
        this.powerbusCables = powerbusCables;
        this.visualHardware = visualHardware;
        this.defense = defense;
        this.dataRetrieval = dataRetrieval;
        this.tools = tools;
        this.scannerTool = scannerTool;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPowerbusCables() {
        return powerbusCables;
    }

    public void setPowerbusCables(int powerbusCables) {
        this.powerbusCables = powerbusCables;
    }

    public String getVisualHardware() {
        return visualHardware;
    }

    public void setVisualHardware(String visualHardware) {
        this.visualHardware = visualHardware;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getDataRetrieval() {
        return dataRetrieval;
    }

    public void setDataRetrieval(String dataRetrieval) {
        this.dataRetrieval = dataRetrieval;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getScannerTool() {
        return scannerTool;
    }

    public void setScannerTool(String scannerTool) {
        this.scannerTool = scannerTool;
    }
}

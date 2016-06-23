package com.company;

/**
 * Created by peteraguilar on 6/20/16.
 */
public class Frame {
    private String material;
    private String color;

    public Frame(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

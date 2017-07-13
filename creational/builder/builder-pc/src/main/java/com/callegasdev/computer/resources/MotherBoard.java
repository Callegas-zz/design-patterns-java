package com.callegasdev.computer.resources;

/**
 * Created by callegas on 13/07/17.
 */
public class MotherBoard {
    private String manufacturer;
    private String model;
    private String chipset;

    public MotherBoard(String manufacturer, String model, String chipset) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MOTHERBOARD: ")
                .append(manufacturer)
                .append(" ")
                .append(model)
                .append(" ")
                .append(chipset)
                .append(".");
        return sb.toString();
    }
}

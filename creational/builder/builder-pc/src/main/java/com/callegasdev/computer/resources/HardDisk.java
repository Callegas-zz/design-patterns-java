package com.callegasdev.computer.resources;

/**
 * Created by callegas on 13/07/17.
 */
public class HardDisk {
    private String manufacturer;
    private String model;
    private Integer capacityInGB;

    public HardDisk(String manufacturer, String model, Integer capacityInGB) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.capacityInGB = capacityInGB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HARDDISK: ")
                .append(manufacturer)
                .append(" ")
                .append(model)
                .append(" ")
                .append(capacityInGB + "GB")
                .append(".");
        return sb.toString();
    }
}

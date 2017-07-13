package com.callegasdev;

/**
 * Created by callegas on 13/07/17.
 */
public class RAMMemory {
    private String manufacturer;
    private String model;
    private String type;
    private Integer capacityInGB;

    public RAMMemory(String manufacturer, String model, String type, Integer capacityInGB) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.capacityInGB = capacityInGB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RAM: ")
                .append(manufacturer)
                .append(" ")
                .append(model)
                .append(" ")
                .append(type)
                .append(" ")
                .append(capacityInGB + "GB")
                .append(".");
        return sb.toString();
    }
}

package com.callegasdev.computer.resources;

/**
 * Created by callegas on 13/07/17.
 */
public class  Cabinet {
    private String manufacturer;
    private String model;

    public Cabinet(String manufacturer, String model) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CABINET: ")
                .append(manufacturer)
                .append(" ")
                .append(model)
                .append(".");
        return sb.toString();
    }
}

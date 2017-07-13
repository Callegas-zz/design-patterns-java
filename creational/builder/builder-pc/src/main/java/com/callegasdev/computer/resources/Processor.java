package com.callegasdev.computer.resources;

/**
 * Created by callegas on 13/07/17.
 */
public class Processor {
    private String manufacturer;
    private String model;
    private Double frequency;

    public Processor(String manufacturer, String model, Double frequency) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PROCESSOR: ")
                .append(manufacturer)
                .append(" ")
                .append(model)
                .append(" ")
                .append(frequency + "Ghz")
                .append(".");
        return sb.toString();
    }
}

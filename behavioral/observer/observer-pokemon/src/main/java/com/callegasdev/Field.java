package com.callegasdev;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private FieldType currentField;
    private List<FieldObserver> observers;

    public Field() {
        observers = new ArrayList<>();
        currentField = FieldType.THUNDER;
    }

    public void addObserver(FieldObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(FieldObserver obs) {
        observers.remove(obs);
    }

    public void timePasses() {
        FieldType[] enumValues = FieldType.values();
        currentField = enumValues[(currentField.ordinal() + 1) % enumValues.length];
        System.out.println("The Field changed to " + currentField);
        notifyObservers();
    }

    private void notifyObservers() {
        for (FieldObserver obs : observers) {
            obs.update(currentField);
        }
    }

}

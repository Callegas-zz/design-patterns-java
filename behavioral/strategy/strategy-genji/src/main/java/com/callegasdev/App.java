package com.callegasdev;

import com.callegasdev.genji.GenjiFactory;

public class App {

    public static void main(String[] args) {

        new GenjiFactory("counterattack").execute();
        new GenjiFactory("dash").execute();
        new GenjiFactory("ultimate").execute();
    }

}

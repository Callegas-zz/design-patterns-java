package com.callegasdev;

import com.callegasdev.genji.GenjiBuilder;

public class App {

    public static void main(String[] args) {

        GenjiBuilder genji = new GenjiBuilder();

        genji.execute("counterattack");
        genji.execute("dash");
        genji.execute("ultimate");

    }

}

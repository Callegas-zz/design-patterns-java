package com.callegasdev;

import com.callegasdev.pokemons.Charmmander;
import com.callegasdev.pokemons.Pikachu;
import com.callegasdev.pokemons.Squartle;

public class App {

    public static void main(String[] args) {
        Field field = new Field();
        field.addObserver(new Charmmander());
        field.addObserver(new Pikachu());
        field.addObserver(new Squartle());

        field.timePasses();
        System.out.println("\n ~~~~~~~");

        field.timePasses();
        System.out.println("\n ~~~~~~~");

        field.timePasses();
        System.out.println("\n ~~~~~~~");

        field.timePasses();
        System.out.println("\n ~~~~~~~");
    }
}

package com.callegasdev;

public class Barney {

    private static Barney instance = new Barney();

    private Barney(){}

    public static Barney getInstance(){
        return instance;
    }

    public void haveYouMetTeddy(){
        System.out.println("Hey, have you met Teddy?");
    }


}

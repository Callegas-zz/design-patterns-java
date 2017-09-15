package com.callegasdev;

public class App {

    public static void main(String[] args) {
        ThoughtsEnum thoughtsEnum = ThoughtsEnum.INSTANCE;
        System.out.println(thoughtsEnum.randomThought());
    }

}

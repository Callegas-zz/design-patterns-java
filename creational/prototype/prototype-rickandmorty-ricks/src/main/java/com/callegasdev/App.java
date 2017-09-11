package com.callegasdev;

public class App {
    public static void main(String[] args) {
        RickCache.loadCache();

        Rick clonedRick = (Rick) RickCache.getRick("1");
        System.out.println("Rick: " + clonedRick.whoRick);

        Rick clonedRick2 = (Rick) RickCache.getRick("2");
        System.out.println("Rick: " + clonedRick2.whoRick);

        Rick clonedRick3 = (Rick) RickCache.getRick("3");
        System.out.println("Rick: " + clonedRick3.whoRick);

    }
}

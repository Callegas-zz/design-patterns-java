package com.callegasdev;

import java.util.Hashtable;

public class RickCache {

    private static Hashtable<String, Rick> shapeMap  = new Hashtable<String, Rick>();

    public static Rick getRick(String rickId){
        Rick cachedRick = shapeMap.get(rickId);
        return (Rick) cachedRick.clone();
    }

    public static void loadCache() {
        DoofusRick doofusRick = new DoofusRick();
        doofusRick.setId("1");
        shapeMap.put(doofusRick.getId(), doofusRick);

        PickleRick pickleRick = new PickleRick();
        pickleRick.setId("2");
        shapeMap.put(pickleRick.getId(), pickleRick);

        TinyRick tinyRick = new TinyRick();
        tinyRick.setId("3");
        shapeMap.put(tinyRick.getId(), tinyRick);
    }

}

package com.callegasdev;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum ThoughtsEnum {

    INSTANCE;

    Map<Integer, String> thoughtList = new HashMap<>();

    private void loadThoughts() {
        thoughtList.put(0, "Try not to become a man of success, but rather try to become a man of value.");
        thoughtList.put(1, "Great spirits have always encountered violent opposition from mediocre minds.");
        thoughtList.put(2, "Not everything that can be counted counts, and not everything that counts can be counted.");
        thoughtList.put(3, "Everybody is a genius. But if you judge a fish by its ability to climb a tree, it will live its whole life believing that it is stupid.");
    }

    public String randomThought(){
        loadThoughts();
        return thoughtList.get(new Random().nextInt(thoughtList.size()));
    }

}

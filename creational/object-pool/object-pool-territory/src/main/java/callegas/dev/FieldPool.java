package callegas.dev;

import java.util.HashMap;
import java.util.Map;

public class FieldPool {
    private static long expTime = 60000;
    public static HashMap<Field, Long> available = new HashMap<Field, Long>();
    public static HashMap<Field, Long> inUse = new HashMap<Field, Long>();


    public synchronized static Field getObject() {
        long now = System.currentTimeMillis();
        if (!available.isEmpty()) {
            for (Map.Entry<Field, Long> entry : available.entrySet()) {
                if (now - entry.getValue() > expTime) { //object has expired
                    popElement(available);
                } else {
                    Field poField = popElement(available, entry.getKey());
                    push(inUse, poField, now);
                    return poField;
                }
            }
        }

        return createField(now);
    }

    private synchronized static Field createField(long now) {
        Field poField = new Field();
        push(inUse, poField, now);
        return poField;
    }

    private synchronized static void push(HashMap<Field, Long> map,
                                          Field poField, long now) {
        map.put(poField, now);
    }

    public static void releaseObject(Field poField) {
        cleanUp(poField);
        available.put(poField, System.currentTimeMillis());
        inUse.remove(poField);
    }

    private static Field popElement(HashMap<Field, Long> map) {
        Map.Entry<Field, Long> entry = map.entrySet().iterator().next();
        Field key= entry.getKey();
        map.remove(entry.getKey());
        return key;
    }

    private static Field popElement(HashMap<Field, Long> map, Field key) {
        map.remove(key);
        return key;
    }

    public static void cleanUp(Field poField) {
        poField.setTemp1(null);
        poField.setTemp2(null);
        poField.setTemp3(null);
    }
}
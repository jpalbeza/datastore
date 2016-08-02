package com.chunky.datastore;

import java.util.HashMap;
import java.util.Map;

public class DatabaseStore {
    private void simulateLatency(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // do nothing
        }
    }

    public Object get(String key)
    {
        //simulates 50 ms roundtrip to the database
        simulateLatency(50);
        if (values.containsKey(key))
        {
            return values.get(key);
        }
        return null;
    }

    public void put(String key, Object value)
    {
        //simulates 50 ms roundtrip to the database
        simulateLatency(50);
        values.put(key, value);
    }

    private Map<String, Object> values = new HashMap<>();
}

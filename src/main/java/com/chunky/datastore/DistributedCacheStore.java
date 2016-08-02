package com.chunky.datastore;

import java.util.HashMap;
import java.util.Map;

public class DistributedCacheStore {

    private void simulateLatency(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // do nothing
        }
    }

    public Object get(String key)
    {
        //simulates 5 ms roundtrip to the distributed cache
        simulateLatency(5);
        if (values.containsKey(key))
        {
            return values.get(key);
        }
        return null;
    }

    public void put(String key, Object value)
    {
        //simulates 5 ms roundtrip to the distributed cache
        simulateLatency(50);
        values.put(key, value);
    }

    private Map<String, Object> values = new HashMap<>();
}

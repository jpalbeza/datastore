package com.chunky.datastore;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class LRUCacheTest {
    @Test
    public void canGetBack1Item() {
        LRUCache<String, Object> target = new LRUCache<>(5);
        String sampleKey = "sample1";
        Object sampleObject = new Object();
        target.put(sampleKey, sampleObject);
        Object returned = target.get(sampleKey);
        assertTrue(returned == sampleObject);
    }
}

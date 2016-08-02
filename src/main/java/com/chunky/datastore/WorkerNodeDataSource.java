package com.chunky.datastore;

public class WorkerNodeDataSource implements IDataSource {
    private DatabaseStore db;
    private DistributedCacheStore distCache;
    private LRUCache lruCache;

    @Override
    public Object get(String key) {
        return null;
    }

    public WorkerNodeDataSource(DatabaseStore db, DistributedCacheStore distCache, int cacheSize) {
        this.db = db;
        this.distCache = distCache;
        this.lruCache = new LRUCache<String, CachedData>(cacheSize);
    }

    private class CachedData {
        Object canonicalValue;

        public CachedData(Object canonicalValue) {
            this.canonicalValue = canonicalValue;
        }
    }

}

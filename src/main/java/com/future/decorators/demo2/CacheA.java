package com.future.decorators.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 18:57
 */
public class CacheA implements Cache {

    private final Cache cache;

    public CacheA(Cache cache) {
        this.cache = cache;
    }

    @Override
    public String getObject(String key) {
        System.out.println("装饰器模式A");
        return cache.getObject(key);
    }

    @Override
    public void putObject(String key, String value) {
        cache.putObject(key, value);
    }
}

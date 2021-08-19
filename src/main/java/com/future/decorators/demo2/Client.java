package com.future.decorators.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 18:59
 */
public class Client {

    public static void main(String[] args) {
        final BaseCache baseCache = new BaseCache();
        final CacheA cacheA = new CacheA(baseCache);
        final Cache cache = new CacheC(cacheA);

        cache.putObject("admin", "111");
        System.out.println(cache.getObject("admin"));

    }


}

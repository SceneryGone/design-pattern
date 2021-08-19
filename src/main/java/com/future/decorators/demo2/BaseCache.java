package com.future.decorators.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 18:49
 */
public class BaseCache implements Cache {

    private final Map<String, String> map = new HashMap<>();

    @Override
    public String getObject(String key) {
        return map.get(key);
    }

    @Override
    public void putObject(String key, String value) {
        map.put(key, value);
    }
}

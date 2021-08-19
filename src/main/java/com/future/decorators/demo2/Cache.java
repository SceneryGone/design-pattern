package com.future.decorators.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 18:48
 */
public interface Cache {

    String getObject(String key);

    void putObject(String key, String value);

}

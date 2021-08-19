package com.future.builder;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 16:52
 */
public interface Builder {

    void id(Integer id);

    void username(String username);

    void age(Integer age);

    User getUser();

}

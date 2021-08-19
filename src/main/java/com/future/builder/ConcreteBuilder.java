package com.future.builder;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 16:53
 */
public class ConcreteBuilder implements Builder {

    private Integer id;

    private String username;

    private Integer age;

    @Override
    public void id(Integer id) {
        this.id = id;
    }

    @Override
    public void username(String username) {
        this.username = username;
    }

    @Override
    public void age(Integer age) {
        this.age = age;
    }

    @Override
    public User getUser() {
        return new User(id, username, age);
    }

}

package com.future.builder;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 16:52
 */
public class User {

    private Integer id;

    private String username;

    private Integer age;

    public User(Integer id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

}

package com.future.builder;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 16:55
 */
public class Director {

    public void construct(Builder builder) {
        builder.id(1);
        builder.username("test-builder");
        builder.age(2);
    }

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);

        System.out.println(builder.getUser());
    }
}

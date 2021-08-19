package com.future.decorators;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 17:43
 */
public class Client {

    public static void main(String[] args) {
        final BaseComponent baseComponent = new BaseComponent();
        final DecoratorA decoratorA = new DecoratorA(baseComponent);
        decoratorA.execute();
    }

}

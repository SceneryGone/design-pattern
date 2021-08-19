package com.future.decorators;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 17:39
 */
public class DecoratorA extends BaseDecorator {

    public DecoratorA(Component wrapper) {
        super(wrapper);
    }

    @Override
    public void execute() {
        System.out.println("add A function");
        super.execute();
    }
}

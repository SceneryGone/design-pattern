package com.future.decorators;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 17:40
 */
public class DecoratorB extends BaseDecorator{

    public DecoratorB(Component wrapper) {
        super(wrapper);
    }

    @Override
    public void execute() {
        System.out.println("add B function");
        super.execute();
    }
}

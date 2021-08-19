package com.future.decorators;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 17:38
 */
public class BaseDecorator implements Component {

    private Component wrapper;

    public BaseDecorator(Component wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void execute() {
        wrapper.execute();
    }

}

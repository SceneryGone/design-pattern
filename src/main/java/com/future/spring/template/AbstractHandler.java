package com.future.spring.template;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 14:10
 */
public abstract class AbstractHandler implements Activity {

    @Override
    public void create() {
        validate();
        System.out.println("parent create");
    }

    protected abstract void validate();

    @Override
    public void update() {
        System.out.println("update create");
    }

}

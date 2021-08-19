package com.future.bridge;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:09
 */
public abstract class AbstractEntity {

    protected AbstractBehavior abstractBehavior;

    public AbstractEntity(AbstractBehavior abstractBehavior) {
        this.abstractBehavior = abstractBehavior;
    }

    public abstract void request();
}

package com.future.bridge;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:12
 */
public class DetailEntityB extends AbstractEntity {

    public DetailEntityB(AbstractBehavior abstractBehavior) {
        super(abstractBehavior);
    }

    @Override
    public void request() {
        super.abstractBehavior.operation2();
    }
}

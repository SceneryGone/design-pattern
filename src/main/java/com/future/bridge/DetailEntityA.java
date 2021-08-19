package com.future.bridge;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:10
 */
public class DetailEntityA extends AbstractEntity {

    public DetailEntityA(AbstractBehavior abstractBehavior) {
        super(abstractBehavior);
    }

    @Override
    public void request() {
        super.abstractBehavior.operation1();
    }

}

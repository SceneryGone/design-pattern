package com.future.bridge;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:13
 */
public class Client {

    public static void main(String[] args) {
        final AbstractBehavior abstractBehavior = new DetailBehaviorB();
        final AbstractEntity abstractEntity = new DetailEntityA(abstractBehavior);
        abstractEntity.request();
    }

}

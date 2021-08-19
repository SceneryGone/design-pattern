package com.future.strategy;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 16:56
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void request() {
        this.strategy.handler();
    }

}

package com.future.strategy;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 16:55
 */
public class StrategyA implements Strategy{

    @Override
    public void handler() {
        System.out.println("Strategy A");
    }
}

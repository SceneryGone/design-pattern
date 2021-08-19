package com.future.strategy;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 16:57
 */
public class Client {

    public static void main(String[] args) {
        final Context context = new Context(new StrategyA());
        context.request();
    }

}

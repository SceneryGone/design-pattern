package com.future.state;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:24
 */
public class Client {

    public static void main(String[] args) {
        final Context context = new Context(StateA.instance());
        context.request();
        context.request();
        context.request();
    }

}

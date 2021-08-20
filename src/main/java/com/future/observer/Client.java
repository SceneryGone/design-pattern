package com.future.observer;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 19:09
 */
public class Client {

    public static void main(String[] args) {
        final Publisher publisher = new PublisherImpl("future", 100);
        publisher.addObserver(new ObserverImpl());
        publisher.notify(200);
    }

}

package com.future.observer.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 10:02
 */
public class Client {

    public static void main(String[] args) {
        final Subject subject = new SubjectPublisherImpl();

        final MessageObserver observer = new MessageObserverImpl();
        subject.attach(observer);

        final Message message = new Message();
        message.setId(1);
        message.setMessage("消息");
        subject.notifyUpdate(message);
    }


}

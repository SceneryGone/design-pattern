package com.future.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 19:05
 */
public class PublisherImpl implements Publisher {

    private final String acct;

    private double balance;

    private final List<Observer> myObservers;

    public PublisherImpl(String acct, double balance) {
        this.acct = acct;
        this.balance = balance;
        myObservers = Lists.newArrayList();
    }

    @Override
    public void addObserver(Observer o) {
        myObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        myObservers.remove(o);
    }

    @Override
    public void notify(double amt) {
        balance -= amt;
        if (balance < 0) {
            overdrawn();
        }
    }

    private void overdrawn() {
        myObservers.forEach(observer -> observer.notify(acct, balance));
    }
}

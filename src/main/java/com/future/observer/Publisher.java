package com.future.observer;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 18:59
 */
public interface Publisher {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notify(double amt);
}

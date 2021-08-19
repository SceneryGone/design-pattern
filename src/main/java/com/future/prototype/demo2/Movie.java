package com.future.prototype.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 09:55
 */
public class Movie implements IPrototype {
    @Override
    public Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }
}

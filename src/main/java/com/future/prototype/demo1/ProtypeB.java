package com.future.prototype.demo1;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 18:47
 */
public class ProtypeB implements PrototypeInterface {
    @Override
    public ProtypeB clone() throws CloneNotSupportedException {
        return (ProtypeB) super.clone();
    }
}

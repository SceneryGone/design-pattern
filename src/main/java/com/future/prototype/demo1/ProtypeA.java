package com.future.prototype.demo1;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 18:47
 */
public class ProtypeA implements PrototypeInterface {
    @Override
    public ProtypeA clone() throws CloneNotSupportedException {
        System.out.println("clone object A");
        return (ProtypeA) super.clone();
    }
}

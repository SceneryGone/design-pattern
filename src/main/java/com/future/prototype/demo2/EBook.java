package com.future.prototype.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 09:56
 */
public class EBook implements IPrototype {
    @Override
    public EBook clone() throws CloneNotSupportedException {
        return (EBook) super.clone();
    }

}

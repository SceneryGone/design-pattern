package com.future.prototype.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 09:55
 */
public interface IPrototype extends Cloneable {

    IPrototype clone() throws CloneNotSupportedException;

}

package com.future.prototype.demo1;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 18:46
 */
public interface PrototypeInterface extends Cloneable {
    PrototypeInterface clone() throws CloneNotSupportedException;
}

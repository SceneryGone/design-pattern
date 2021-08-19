package com.future.prototype.demo1;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 18:48
 */
public class TestProtoType {
    public static void main(String[] args) throws CloneNotSupportedException {
        final ProtypeA protypeA = new ProtypeA();
        System.out.println(protypeA);

        final ProtypeA newInstanceA = protypeA.clone();
        System.out.println(newInstanceA);
    }
}

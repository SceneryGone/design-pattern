package com.future.simple.factory;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 18:20
 */
public class ProductA implements Product{

    @Override
    public void apply() {
        System.out.println("A");
    }
}

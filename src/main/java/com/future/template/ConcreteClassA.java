package com.future.template;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 16:45
 */
public class ConcreteClassA extends AbstractClassTemplate {
    @Override
    protected void step2() {
        System.out.println("A step 2");
    }

    @Override
    protected void step3() {
        System.out.println("A step 3");
    }
}

package com.future.template;

/**
 * 功能描述: 模版方法
 *
 * @author future
 * @date 2021-08-19 16:44
 */
public abstract class AbstractClassTemplate {

    void step1(String key) {
        System.out.println("=== 在模板类里 执行步骤 1");
        step2();
        step3();
    }

    protected abstract void step2();

    protected abstract void step3();

}

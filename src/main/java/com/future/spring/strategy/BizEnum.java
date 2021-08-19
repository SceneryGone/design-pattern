package com.future.spring.strategy;

/**
 * @author future
 */

public enum BizEnum {
    /**
     * alipay
     */
    BIZ_A("1001", "A"),
    /**
     * wx
     */
    BIZ_B("1002", "B");

    private String code;

    private String desc;

    BizEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}

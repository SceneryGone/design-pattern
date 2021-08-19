package com.future.spring.factory;

/**
 * @author future
 */

public enum PayEnum {
    /**
     * alipay
     */
    ALIPAY("1001", "支付宝"),
    /**
     * wx
     */
    WX("1002", "微信");

    private String code;

    private String desc;

    PayEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}

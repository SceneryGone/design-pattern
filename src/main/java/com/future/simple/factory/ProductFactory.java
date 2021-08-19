package com.future.simple.factory;

import org.apache.commons.lang3.StringUtils;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 18:22
 */
public class ProductFactory {

    public static Product getProduct(String productName) {
        if (StringUtils.equals(productName, "A")) {
            return new ProductA();
        }
        if (StringUtils.equals(productName, "B")) {
            return new ProductB();
        }
        throw new RuntimeException("not found product!");
    }
}
